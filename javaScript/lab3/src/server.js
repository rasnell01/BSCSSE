const express = require('express');
const axios = require('axios');
require('dotenv').config();

const app = express();
const port = process.env.PORT || 3000;

// This endpoint handles the redirect from GitHub after the user logs in
app.get('/auth/callback', async (req, res) => {
  const { code } = req.query;

  if (!code) {
    return res.status(400).json({ error: 'No code provided' });
  }

  try {
    // GitHub token exchange URL
    const tokenUrl = 'https://github.com/login/oauth/access_token';
    const { data } = await axios.post(tokenUrl, null, {
      params: {
        client_id: process.env.GITHUB_CLIENT_ID,
        client_secret: process.env.GITHUB_CLIENT_SECRET,
        code: code,
      },
      headers: {
        Accept: 'application/json',
      },
    });

    // GitHub will return an access token in the response
    const { access_token } = data;

    // Use the token to fetch user data
    const userData = await axios.get('https://api.github.com/user', {
      headers: {
        Authorization: `Bearer ${access_token}`,
      },
    });

    // Send the user data back to the frontend
    return res.json({ user: userData.data, token: access_token });

  } catch (error) {
    return res.status(500).json({ error: 'Error exchanging code for token' });
  }
});

// Start the Express server
app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});

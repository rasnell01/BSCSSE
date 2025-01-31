import React from 'react';

const GitHubLoginButton = () => {
    const handleLogin = () => {
        // GitHub OAuth URL with your Client ID
        const clientId = 'YOUR_GITHUB_CLIENT_ID';
        const redirectUri = 'https://green-ocean-0e709031e.4.azurestaticapps.net';
        const scope = 'read:user'; 
        const authUrl = `https://github.com/login/oauth/authorize?client_id=${clientId}&redirect_uri=${redirectUri}&scope=${scope}`;

        window.location.href = authUrl;
    };

    return <button onClick={handleLogin}>Login with GitHub</button>;
};

export default GitHubLoginButton;
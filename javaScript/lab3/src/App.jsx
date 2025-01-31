import React, { useState, useEffect } from 'react';
import GitHubLoginButton from './GitHubLoginButton.jsx';
import './App.css';
import Welcome from './welcome.jsx';

function App() {
  const [count, setCount] = useState(0);

  // useEffect(() => {
  //   const getUserData = async () => {
  //     // Check for the 'code' query parameter from the URL
  //     const queryParams = new URLSearchParams(window.location.search);
  //     const code = queryParams.get('code');

  //     if (code) {
  //       try {
  //         // Send the code to your backend to exchange it for a token
  //         const response = await fetch(`http://localhost:3000/auth/callback?code=${code}`);
  //         const data = await response.json();

  //         console.log(data); // This will print the user info and token
  //         // You can store the user info and token in localStorage or context as needed
  //         localStorage.setItem('github_user', JSON.stringify(data.user));
  //         localStorage.setItem('github_token', data.token);

  //         // Optionally, redirect the user or update the state
  //         // Example: window.location.href = '/dashboard';
  //       } catch (error) {
  //         console.error("Error fetching user data", error);
  //       }
  //     }
  //   };

  //   getUserData();
  // }, []);

  return (
      <>
        <div className="card">
          <button onClick={() => setCount((count) => count + 1)}>
            count is {count}
          </button>
          <div>
            <h1>Welcome to the App! My name is Ryan!</h1>
            <GitHubLoginButton />
            <Welcome />
          </div>
        </div>
      </>
  );
}

export default App;

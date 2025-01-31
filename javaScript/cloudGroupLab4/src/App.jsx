import links from "./links";
import './App.css';

function App() {
    return (
        <>
            <h1>Azure Blob</h1>
            <div className="card">
                <p>Dahlonega, GA tombstone photos</p>
            </div>

            <ul id="link-list">
                {links.map((link, index) => (
                    <li key={index}>
                        <a href={link.url} target="_blank" rel="noopener noreferrer">
                            {link.name}
                        </a>
                    </li>
                ))}
            </ul>
        </>
    );
}

export default App;
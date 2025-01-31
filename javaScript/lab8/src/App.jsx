import { useState } from 'react';
import Add from './Add';
import Subtract from "./Subtract.jsx";
import Multiply from './Multiply';
import Divide from './Divide';
import Square from './Square';
import SquareRoot from "./SquareRoot.jsx";
import Power from "./Power.jsx";
import './App.css';

function App() {
    const [num1, setNum1] = useState(0);
    const [num2, setNum2] = useState(0);
    const [result, setResult] = useState(null);

    return (
        <>
            <h1>Mathematical Operations</h1>
            <div>
                <input
                    type="number"
                    value={num1}
                    onChange={(e) => setNum1(Number(e.target.value))}
                    placeholder="Enter first number"
                />
                <input
                    type="number"
                    value={num2}
                    onChange={(e) => setNum2(Number(e.target.value))}
                    placeholder="Enter second number"
                />
            </div>
            <div>
                <button onClick={() => setResult(Add(num1, num2))}>Add</button>
                <button onClick={() => setResult(Subtract(num1, num2))}>Subtract</button>
                <button onClick={() => setResult(Multiply(num1, num2))}>Multiply</button>
                <button onClick={() => setResult(Divide(num1, num2))}>Divide</button>
                <button onClick={() => setResult(Square(num1))}>Square</button>
                <button onClick={() => setResult(SquareRoot(num1))}>Square Root</button>
                <button onClick={() => setResult(Power(num1, num2))}>Power</button>
            </div>
            {result !== null && (
                <p>Result: {result}</p>
            )}
        </>
    );
}

export default App;
import './App.css';
import React from "react";

function App() {
    const message = {};
    const inputType = "number";
    const minValue = 10;
    const maxValue = 10;


    const date = new Date();
    const time = date.toLocaleTimeString();
    var message1 = "Lorem ipsum odor amet, consectetuer adipiscing elit." +
        "Habitant suspendisse sodales curae tempor non faucibus; feugiat " +
        "sem suscipit. Nibh dapibus imperdiet lectus urna consectetur " +
        "curae. Pretium venenatis sed mattis rhoncus natoque semper ante " +
    "fringilla. Enim congue conubia rutrum habitasse mattis dis " +
    " tincidunt. Imperdiet suspendisse a mattis diam placerat finibus. " +
        "Nisl primis faucibus condimentum porttitor varius? Aliquam fusce " +
        "eleifend porta cursus inceptos; leo dictumst phasellus. Justo montes " +
        "dictum placerat leo mauris nostra. Accumsan vel eros varius " +
        "turpis nec."

    return (
        <div>
            <p>
        <h1>{new Date().toLocaleTimeString()}</h1>
            <textarea id="story" name="story" rows={10} cols={50}>{message1}</textarea>
            </p>
        <textarea style={{border: '3px solid red'}}
                  spellCheck={true}

                  autoFocus={true}/>
        </div>
            )
}
export default App;
import './App.css';
import Greeter from "./Greeter";
import {Fragment} from "react";

function App() {
  return (
      <Fragment>
      <h2>This is my top level app content.</h2>
      <Greeter name="Dave" age={253} />
          <Greeter name="Joe" age={23} />
          <Greeter name="Flower" age={18} />
          <Greeter name="Cinderblock" age={19} />

      </Fragment>
  );
}

export default App;

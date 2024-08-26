import {useState} from 'react';

const Greeter = (props) => {
    let [age, setAge] = useState(props.age);

    const addOne = () => {
        setAge(age+1);
    }

    return (<div>
        <p>Good morning, {props.name}. You are {age} years old.</p>
        <button onClick={addOne}>Add one year</button>
    </div>)
}
export default Greeter;
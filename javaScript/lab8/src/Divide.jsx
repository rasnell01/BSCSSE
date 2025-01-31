function Divide(num1, num2) {
    if (num2 != 0)
        return (num1 / num2);
    else
        throw new Error("Division by zero is not allowed.");
}
Divide.displayName = "Divide";
export default Divide;
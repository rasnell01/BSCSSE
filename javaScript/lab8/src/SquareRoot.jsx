function SquareRoot(num1) {
    if (num1 < 0) {
        throw new Error("Square root of a negative number is not a real number.");
    }
    return Math.sqrt(num1);
}
SquareRoot.displayName = "SquareRoot";
export default SquareRoot;
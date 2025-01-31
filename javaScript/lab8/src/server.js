import express from 'express';
import cors from 'cors';

const app = express();
const port = 3000;

app.use(cors());
app.use(express.json());

// Utility function to validate query parameters
function validateNumbers(a, b, res) {
    if (isNaN(a) || (b !== undefined && isNaN(b))) {
        return res.status(400).json({ error: 'Invalid inputs. Both a and b must be numbers.' });
    }
}

// Addition endpoint
app.get('/add', (req, res) => {
    const a = parseFloat(req.query.a);
    const b = parseFloat(req.query.b);

    // Validate inputs
    const validationError = validateNumbers(a, b, res);
    if (validationError) return validationError;

    const result = a + b;
    return res.json({ result });
});

// Subtraction endpoint
app.get('/sub', (req, res) => {
    const a = parseFloat(req.query.a);
    const b = parseFloat(req.query.b);

    // Validate inputs
    const validationError = validateNumbers(a, b, res);
    if (validationError) return validationError;

    const result = a - b;
    return res.json({ result });
});

// Division endpoint
app.get('/div', (req, res) => {
    const a = parseFloat(req.query.a);
    const b = parseFloat(req.query.b);

    // Validate inputs
    const validationError = validateNumbers(a, b, res);
    if (validationError) return validationError;

    if (b === 0) {
        return res.status(400).json({ error: 'Division by zero is not allowed.' });
    }

    const result = a / b;
    return res.json({ result });
});

// Multiplication endpoint
app.get('/mult', (req, res) => {
    const a = parseFloat(req.query.a);
    const b = parseFloat(req.query.b);

    // Validate inputs
    const validationError = validateNumbers(a, b, res);
    if (validationError) return validationError;

    const result = a * b;
    return res.json({ result });
});

// Power endpoint
app.get('/pow', (req, res) => {
    const a = parseFloat(req.query.a);
    const b = parseFloat(req.query.b);

    // Validate inputs
    const validationError = validateNumbers(a, b, res);
    if (validationError) return validationError;

    const result = a ** b;
    return res.json({ result });
});

// Square Root endpoint
app.get('/root', (req, res) => {
    const a = parseFloat(req.query.a);

    // Validate input
    const validationError = validateNumbers(a, null, res);
    if (validationError) return validationError;

    const result = Math.sqrt(a);
    return res.json({ result });
});

// Squared endpoint
app.get('/square', (req, res) => {
    const a = parseFloat(req.query.a);

    // Validate input
    const validationError = validateNumbers(a, null, res);
    if (validationError) return validationError;

    const result = a ** 2;
    return res.json({ result });
});

// Start the server
app.listen(port, () => {
    console.log(`Server started on http://localhost:${port}`);
});
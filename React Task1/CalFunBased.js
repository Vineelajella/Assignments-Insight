import React, { useState } from "react";

function CalFunBased() {
    const [num1, setNum1] = useState('');
    const [num2, setNum2] = useState('');

    return (
        <div style={{ textAlign: 'center', marginTop: '20px' }}>
            <h2>Enter 2 numbers</h2>
            <form onSubmit={(e) => e.preventDefault()}>
                <input
                    type="number"
                    name="num1"
                    value={num1}
                    onChange={(e) => setNum1(e.target.value)}
                    placeholder="Enter first number"
                    required
                />
                <input
                    type="number"
                    name="num2"
                    value={num2}
                    onChange={(e) => setNum2(e.target.value)}
                    placeholder="Enter second number"
                    required
                />
                <button type="submit">Calculate</button>
            </form>

            {/* Pass numbers as props to Calculator */}
            <Calculator number1={Number(num1)} number2={Number(num2)} />
        </div>
    );
}

// Child Component (Inside the same file)
function Calculator({ number1, number2 }) {
    const sum = number1 + number2;
    const diff = number1 - number2;
    const product = number1 * number2;

    return (
        <div style={{ textAlign: 'center', marginTop: '20px' }}>
            <h2>Calcul Results</h2>
            <p>Sum: {sum}</p>
            <p>Difference: {diff}</p>
            <p>Product: {product}</p>
        </div>
    );
}

export default CalFunBased;

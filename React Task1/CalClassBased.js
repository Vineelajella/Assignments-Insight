import React, { Component } from "react";

class CalClassBased extends Component {
    constructor() {
        super();
        this.state = {
            num1: '',
            num2: ''
        };
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
        this.setState({ [event.target.name]: event.target.value });
    }

    handleSubmit(event) {
        event.preventDefault();
    }

    render() {
        return (
            <div style={{ textAlign: 'center', marginTop: '20px' }}>
                <h2>Enter 2 numbers</h2>
                <form onSubmit={this.handleSubmit}>
                    <input 
                        type="number" 
                        name="num1" 
                        value={this.state.num1} 
                        onChange={this.handleChange} 
                        placeholder="Enter first number" 
                        required 
                    />
                    <input 
                        type="number" 
                        name="num2" 
                        value={this.state.num2} 
                        onChange={this.handleChange} 
                        placeholder="Enter second number" 
                        required 
                    />
                    <button type="submit">Calculate</button>
                </form>

                {/* Pass numbers as props to Calculator */}
                <Calculator number1={Number(this.state.num1)} number2={Number(this.state.num2)} />
            </div>
        );
    }
}

class Calculator extends Component {
    render() {
        const { number1, number2 } = this.props;
        const sum = number1 + number2;
        const diff = number1 - number2;
        const product = number1 * number2;

        return (
            <div style={{ textAlign: 'center', marginTop: '20px' }}>
                <h2>Calculation Results</h2>
                <p>Sum: {sum}</p>
                <p>Difference: {diff}</p>
                <p>Product: {product}</p>
            </div>
        );
    }
}

export default CalClassBased;

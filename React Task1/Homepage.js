import React, { useState } from 'react';
import LoginForm from './LoginForm';
import SignUp from './SignUp';

const Homepage = () => {
    const [active, setActive] = useState('LoginForm');

    return (
        <div >
            <h1>Welcome to Our App</h1>
            <div >
                <button onClick={() => setActive('LoginForm')} >Login</button>
                <button onClick={() => setActive('SignUp')} >Sign Up</button>
            </div>
            {active === 'LoginForm' ? <LoginForm /> : <SignUp />}
        </div>
    );
};

export default Homepage;
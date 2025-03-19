import React, { useState } from 'react';

const SignUp = () => {
    const [customerid, setcustomerid] = useState("");
    const [name, setname] = useState("");
    const [email, setemail] = useState("");
    const [gender, setGender] = useState("");
    const [city, setCity] = useState("");
    const [review, setReview] = useState(false);
    
    const handleSubmit = (event) => {
        event.preventDefault();
        setReview(true);
    };

    return (
        <div style={{ display: 'flex', justifyContent: 'center', alignItems: 'center', height: '100vh', backgroundColor: '#f0f0f0' }}>
            <div style={{ padding: '20px', border: '1px solid #ccc', borderRadius: '8px', backgroundColor: 'aqua', width: '300px' }}>
                <form onSubmit={handleSubmit}>
                    <div>
                        <label>Customer ID</label>
                        <input type="text" value={customerid} onChange={(e) => setcustomerid(e.target.value)} />
                    </div>
                    <div>
                        <label>Name:</label>
                        <input type="text" value={name} onChange={(e) => setname(e.target.value)} required />
                    </div>
                    <div>
                        <label>Email:</label>
                        <input type="email" value={email} onChange={(e) => setemail(e.target.value)} required />
                    </div>
                    <div>
                        <label>Gender:</label>
                        <select value={gender} onChange={(e) => setGender(e.target.value)} required>
                            <option value="">Select</option>
                            <option value="Male">Male</option>
                            <option value="Female">Female</option>
                        </select>
                    </div>
                    <div>
                        <label>City:</label>
                        <select value={city} onChange={(e) => setCity(e.target.value)} required>
                            <option value="">Select</option>
                            <option value="Hyderabad">Hyderabad</option>
                            <option value="Chennai">Chennai</option>
                            <option value="Pune">Pune</option>
                        </select>
                    </div>
                    <button type="submit" value="submit">Review</button>
                </form>
                {review && (
                    <div>
                        <h3>Review Details</h3>
                        <p>Customer Id: {customerid}</p>
                        <p><strong>Name:</strong> {name}</p>
                        <p><strong>Email:</strong> {email}</p>
                        <p><strong>Gender:</strong> {gender}</p>
                        <p><strong>City:</strong> {city}</p>
                    </div>
                )}
            </div>
        </div>
    );
};

export default SignUp;

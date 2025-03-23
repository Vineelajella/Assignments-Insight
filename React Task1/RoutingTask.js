import React from 'react'
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";

const RoutingTask = () => {
  return (
    <div>
       < Router>
        <nav>
            <li><Link to ="/" >Home</Link></li>
            <li > <Link to ="/login">Login </Link></li>
            <li > <Link to ="/signup">SignUp</Link></li>
        </nav>
        <Routes>
            <Route path="/"element={<Homepage/>}></Route>
            <Route path="/login" element={<LoginComponenet />} />
            <Route path="/signup" element={<SignupComponent />} />
        </Routes>
        </Router>
        
    </div>
  )
}
const Homepage=()=>{
    return(
        <>
        <h1>
            Home Page
            </h1></>
    )
}
const LoginComponenet=()=>{
    return(
        <>
        <h1>Login Page</h1>
        </>
    )
}

const SignupComponent = () => {
    return (
      <div>
        <h1> Signup</h1>
        <p>Create a new account.</p>
      </div>
    );
  };
export default RoutingTask

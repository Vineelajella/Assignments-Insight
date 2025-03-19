import React, { use, useState } from 'react'

const LoginForm = () => {
    const[id,setid]=useState("");
    const[password,setpassword]=useState("")
    const handleSubmit=(event)=>{
        event.preventDefault();
        if(id==="iguser"&&password==="password"){
            alert('valid User')
        }
        else{
            alert('Invalid User');
        }
    }
  return (
    <div style={{width:'300px',margin:'100px auto', padding:'20px',border:'1px solid', textAlign:'center', backgroundColor:'aqua'}}>
        <h2 style={{textAlign:'center', marginBottom:'10px' }}>Login</h2>
        <form onSubmit={handleSubmit}>
            <div style={{marginBottom:'15px', textAlign:'center'}}>
                <label>
                    Id
                </label>
                <input type="text"value={id}onChange={(e)=>setid(e.target.value)}required/>

            </div>
            <div>
                <label>Password</label>
                <input type="password" value={password}onChange={(e)=>setpassword(e.target.value)}/>

            </div>
            <button type="submit" value="submit" style={{border:'12 px solid 12px', borderRadius:'5px' }}>Submit</button>
        </form>

      
    </div>
  )
}

export default LoginForm

import React, { useEffect, useState } from 'react'

const ProductComponentTask = () => {
    const[products,setproducts]=useState([]);
    useEffect(()=>{
        fetch("https://fakestoreapi.com/products")
        .then((response)=>response.json())
        .then((data)=>setproducts(data))
        .catch((error)=>console.log(error));
    },[]);
  return (
    <div>
        <h2>product List</h2>
        <table border="1" cellPadding="10" style={{ width: "100%", textAlign: "left" }}>
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Category</th>
            </tr>
        </thead>
        <tbody>
            {products.map((product) => (
                <tr key={product.id}>
                    <td>{product.id}</td>
                    <td>{product.title}</td>
                    <td>{product.category}</td>
                </tr>
            ))}
        </tbody>
        </table>
    </div>
  )
}

export default ProductComponentTask

import React  from "react"
function MobileDetails({id,model,price}){
    return(
        <div>
        <h3>Mobile Id:{id}</h3>
        <p>Model :{model}</p>
        <p>Price :{price}</p>
        </div>
    )
}


function FunctionBasedMobile(){
    const mobiles=[
        {id:1,model:"Samsung",price:9999},
        {id:2,model:"Nokia",price:5999},
        {id:3,model:"Vivo",price:16000}
    ]
    return(
        <div>
            <MobileDetails></MobileDetails>
            <h3>Mobile List</h3>
            {mobiles.map((mobile) => (
        <MobileDetails key={mobile.id} id={mobile.id} model={mobile.model} price={mobile.price} />
      ))}

        </div>
    )
}
export default FunctionBasedMobile;
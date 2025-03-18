import { Component } from "react";


class MobileList extends Component{
    constructor(){
        super();
        this.state = {
            mobiles: [
              { id: 1, model: 'iPhone 14', price: 999 },
              { id: 2, model: 'Samsung Galaxy S23', price: 899 },
              { id: 3, model: 'OnePlus 11', price: 799 },
              { id: 4, model: 'Google Pixel 7', price: 699 }
            ]
        };
    }
    render(){
        return(
            <div>
                <ClassBasedMobile></ClassBasedMobile>
                 <h2>Mobile List</h2>
        {this.state.mobiles.map((mobile) => (
          <ClassBasedMobile key={mobile.id} id={mobile.id} model={mobile.model} price={mobile.price} />
        ))}
            </div>
        )
    }
}
export default MobileList;


class ClassBasedMobile extends Component{
    render(){
        return(
            <div>
            <h3>Mobile id:{this.props.id}</h3>
            <p>Model :{this.props.model}</p>
            <p>price: ${this.props.price}</p>
           
            </div>
        )
    }

}

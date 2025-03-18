
import './App.css';
import CalClassBased from './CalClassBased';
import CalFunBased from './CalFunBased';
import MobileList from './ClassBasedMobile';
import ClassBasedMobile from './ClassBasedMobile';
import Counter from './Counter';
import FunctionBasedMobile from './FunctionBasedMobile';
import Header from './Header';
import IncrDecr from './IncrDecr';


function App() {
  return (
    // <div className="App">
    //   <Header></Header>
    //  <h1>hii</h1>
    //  <Child></Child>
    // </div>
   // <IncrDecr></IncrDecr>
  //  <Counter></Counter>
//  <MobileList></MobileList>
/* <FunctionBasedMobile></FunctionBasedMobile> */
/* <CalClassBased></CalClassBased> */
<CalFunBased></CalFunBased>
   
  );
}


export default App;

// function Child(){
//   return(
//     <div>
//       <h5>Child class</h5>
//     </div>
//   )
// }
// import React, { Component } from "react";
// import "./App.css";

// class App extends React.Component {
//   constructor() {
//     super();
//     this.state = {
//       x: 100,
//       name: "user123",
//       inputValue: "" 
//     };

   
//     this.handleChange = this.handleChange.bind(this);
//     this.handleSubmit = this.handleSubmit.bind(this);
//   }

//   handleChange(event) {
//     this.setState({ inputValue: event.target.value }); // Fixed state update
//   }

//   handleSubmit(event) {
//     event.preventDefault(); 
//     alert("A name is submitted: " + this.state.inputValue);
//   }

//   render() {
//     return (
//       <div>
       
//         <form onSubmit={this.handleSubmit}>
//           <label htmlFor="name">
//             Enter name: 
//             <input
//               type="text"
//               id="name"
//               value={this.state.inputValue}
//               onChange={this.handleChange}
//             />
//           </label>
//           <input type="submit" value="Submit" />
//         </form>

       
//         <h1>Class Component</h1>
//         <h1>
//           {this.state.x} {this.state.name}
//         </h1>

       
//         <Footer year="2025" />
//       </div>
//     );
//   }
// }


// class Footer extends Component {
//   constructor(props) {
//     super(props);
//     this.state = {
//       y: 200
//     };
//   }

//   render() {
//     return (
//       <div>
//         <h2>Footer child class: Copyrights reserved by IG {this.props.year}</h2>
//         <h3>{this.state.y}</h3>
//       </div>
//     );
//   }
// }

// export default App;


// import React from'react';

// class Counter extends React.Component{
//   constructor(){
//     super();
//     this.state={
//       count:0
//     }
//   };
  
//   increment=()=>{
//     this.setState({count:this.state+1});
//   };
//   decrement=()=>{
//     this.setState({count:this.state-1})

//   };
//   render(){
//     return(
//       <div>
//         <h1>Counter :{this.state.count}</h1>
//         <button onClick={this.increment}>++</button>
//         <button onClick={this.decrement}>--</button>
//       </div>
//     );
//   }
// }

// export default Counter;






import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";

// Higher Order Component (HOC) for Bootstrap Table
const withBootstrapTable = (WrappedComponent, columns) => {
  return (props) => (
    <div className="container mt-4">
      <table className="table table-striped table-bordered">
        <thead>
          <tr>
            {columns.map((col, index) => (
              <th key={index}>{col}</th>
            ))}
          </tr>
        </thead>
        <tbody>
          <WrappedComponent {...props} />
        </tbody>
      </table>
    </div>
  );
};

// ProductList Component
const ProductList = ({ products }) => {
  return products.map((product, index) => (
    <tr key={index}>
      <td>{product.id}</td>
      <td>{product.name}</td>
      <td>{product.price}</td>
    </tr>
  ));
};

// EmployeeList Component
const EmployeeList = ({ employees }) => {
  return employees.map((employee, index) => (
    <tr key={index}>
      <td>{employee.id}</td>
      <td>{employee.name}</td>
      <td>{employee.department}</td>
    </tr>
  ));
};

// Define column headers
const productColumns = ["ID", "Name", "Price"];
const employeeColumns = ["ID", "Name", "Department"];

// Wrap components with HOC
const ProductTable = withBootstrapTable(ProductList, productColumns);
const EmployeeTable = withBootstrapTable(EmployeeList, employeeColumns);

// Main HOCtask Component
const HOCtask = () => {
  const products = [
    { id: 1, name: "Laptop", price: "$1000" },
    { id: 2, name: "Phone", price: "$500" },
  ];

  const employees = [
    { id: 1, name: "John Doe", department: "Engineering" },
    { id: 2, name: "Jane Smith", department: "Marketing" },
  ];

  return (
    <div className="container">
      <h2>Product List</h2>
      <ProductTable products={products} />

      <h2>Employee List</h2>
      <EmployeeTable employees={employees} />
    </div>
  );
};

export default HOCtask;

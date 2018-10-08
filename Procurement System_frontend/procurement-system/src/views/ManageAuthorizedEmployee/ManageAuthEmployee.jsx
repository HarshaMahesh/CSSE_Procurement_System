import React, { Component } from "react";
import Axios from 'axios';

import {
  Grid,
  Row,
  Col,

  Table
 // FormGroup,
 //ControlLabel,
} from "react-bootstrap";
import '../../assets/css/all.css';
import './css/cssAuthEmployee.css';
import { Card } from "components/Card/Card.jsx";



//import avatar from "assets/img/faces/face-3.jpg";

class ManageAuthEmployee extends Component {

    constructor(props) {
        super(props);

        this.submitAuthEmployeeData = this.submitAuthEmployeeData.bind(this);

        this.setselectedAEmployeeID = this.setselectedAEmployeeID.bind(this);
        this.setselectedAEmployeeName = this.setselectedAEmployeeName.bind(this);
        this.setselectedAEmployeeType = this.setselectedAEmployeeType.bind(this);
        this.setselectedAEmployeeAddress = this.setselectedAEmployeeAddress.bind(this);
        this.setselectedAEmployeeEmail = this.setselectedAEmployeeEmail.bind(this);
        this.setselectedAEmployeePhone = this.setselectedAEmployeePhone.bind(this);
        
        this.state = {

            selectedAEmployeeID:"",
            selectedAEmployeeName:"",
            selectedAEmployeeType:"",
            selectedAEmployeeAddress:"",
            selectedAEmployeeEmail:"",
            selectedAEmployeePhone:"",
        };
    }
    setselectedAEmployeeID(e){
        this.setState({selectedAEmployeeID:e.target.value});
    }

    setselectedAEmployeeName(e){
        this.setState({selectedAEmployeeName:e.target.value});
    }

    setselectedAEmployeeType(e){
        this.setState({selectedAEmployeeType:e.target.value});
    }

    setselectedAEmployeeAddress(e){
        this.setState({selectedAEmployeeAddress:e.target.value});
    }
    
    setselectedAEmployeeEmail(e){
        this.setState({selectedAEmployeeEmail:e.target.value});
    }

    setselectedAEmployeePhone(e){
        this.setState({selectedAEmployeePhone:e.target.value});
    }

    
    //
    // setAdmissionData(e){
    //     console.log(e.target.value)
    // }

    submitAuthEmployeeData(){
        //console.log("Button Clicked");
        let object = {
            employeeID: this.state.selectedAEmployeeID,
            employeeName: this.state.selectedAEmployeeName,
            employeeType: this.state.selectedAEmployeeType,
            address: this.state.selectedAEmployeeAddress,
            email: this.state.selectedAEmployeeEmail,
            phone: this.state.selectedAEmployeePhone
        }

        console.log(object);

        Axios.post('http://localhost:8083/api/authemp/addAuthEmp',object).then(function (data) {
            console.log(data);
            console.log("New Authorized Employee Added");
            alert("New Authorized Employee Added");
        })
    }
    handleChange = event => {
        this.setState({ name: event.target.value });
    };



  render() {


      return (

          <div className="content">
              <Grid fluid>
                  <div className="card">

                      <div className="content">
                          <Row>
                              <Col md={6}>

                                  <div className="settings-item123">
                                      <div className="setting-item-label123">Employee ID</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedAEmployeeID}/>

                                  </div><br/>

                                  <div className="settings-item123">
                                      <div className="setting-item-label123">Employee Name</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedAEmployeeName}/>

                                  </div><br/>

                                  <div className="settings-item123">
                                      <div className="setting-item-label123">Employee Type</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedAEmployeeType}/>
                                  </div><br/>

                                  
                                  
                                  

                              </Col>
                              <Col md={6}>
                                <div className="settings-item123">
                                      <div className="setting-item-label123">Address</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedAEmployeeAddress}/>

                                </div><br/>
                                <div className="settings-item123">
                                      <div className="setting-item-label123">Email</div>
                                      <input type="email" name="profile-lname" onChange={this.setselectedAEmployeeEmail}/>

                                  </div><br/>

                                  <div className="settings-item123">
                                      <div className="setting-item-label123">Phone</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedAEmployeePhone}/>

                                  </div><br/>
                                  

                                  
                              </Col>
                              
                              <button type="button" name="save" className="order-add-button123"
                                          onClick={this.submitAuthEmployeeData}>Add AuthEmp
                                  </button>
                                  <button type="button" name="save" className="order-update-button123"
                                          onClick={this.submitSupplierData}>Update Supplier
                                  </button>
                                  <button type="button" name="save" className="order-delete-button123"
                                          onClick={this.submitSupplierData}>Delete Supplier
                                  </button>
                                  <button type="button" name="save" className="order-clear-button123"
                                          onClick={this.submitSupplierData}>Clear
                                  </button>
                              <Col md={8}>

                                  <br/>
                                  <Card
                                      plain
                                      title="Authorized Employee Details"
                                      ctTableFullWidth
                                      ctTableResponsive
                                      content={
                                          <Table hover>
                                              <thead>
                                              <tr>

                                                  <th className="employee-num-column">Employee ID</th>
                                                  <th className="employee-id">Employee Name</th>
                                                  <th className="employee-name">Employee Type</th>
                                                  <th className="employee-designation">Address</th>
                                                  <th className="employee-mobile">Email</th>
                                                  <th className="employee-mobile">Phone</th>
                                                  
                                              </tr>
                                              </thead>
                                              <tbody>

                                              </tbody>
                                          </Table>
                                      }
                                  />
                                  <br/>

                                  

                              </Col>
                          </Row>
                          <br />
                          <br />
                          <div className="places-buttons">



                          </div>
                      </div>
                  </div>
              </Grid>
          </div>
      );

  }
}

export default ManageAuthEmployee;

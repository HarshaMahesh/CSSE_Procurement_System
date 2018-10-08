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
import './css/cssSiteManager.css';
import { Card } from "components/Card/Card.jsx";



//import avatar from "assets/img/faces/face-3.jpg";

class ManageSiteManager extends Component {

    constructor(props) {
        super(props);

        this.submitSiteManagerData = this.submitSiteManagerData.bind(this);

        this.setselectedAEmployeeID = this.setselectedAEmployeeID.bind(this);
        this.setselectedAEmployeeName = this.setselectedAEmployeeName.bind(this);
        this.setselectedSiteName = this.setselectedSiteName.bind(this);
        this.setselectedAEmployeeAddress = this.setselectedAEmployeeAddress.bind(this);
        this.setselectedAEmployeeEmail = this.setselectedAEmployeeEmail.bind(this);
        this.setselectedAEmployeePhone = this.setselectedAEmployeePhone.bind(this);
        
        this.state = {

            selectedAEmployeeID:"",
            selectedAEmployeeName:"",
            selectedSiteName:"",
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

    setselectedSiteName(e){
        this.setState({selectedSiteName:e.target.value});
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

    submitSiteManagerData(){
        //console.log("Button Clicked");
        let object = {
            employeeID: this.state.selectedAEmployeeID,
            employeeName: this.state.selectedAEmployeeName,
            siteName: this.state.selectedAEmployeeType,
            address: this.state.selectedAEmployeeAddress,
            email: this.state.selectedAEmployeeEmail,
            phone: this.state.selectedAEmployeePhone
        }

        console.log(object);

        Axios.post('http://localhost:8083/api/sitemanager/addSiteManager',object).then(function (data) {
            console.log(data);
            console.log("New Site Manager Added");
            alert("New Site Manager Added");
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
                                      <div className="setting-item-label123">Site Name</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedSiteName}/>
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
                                          onClick={this.submitSiteManagerData}>Add Site Mgr
                                  </button>
                                  <button type="button" name="save" className="order-update-button123"
                                          onClick={this.submitSiteManagerData}>Update Supplier
                                  </button>
                                  <button type="button" name="save" className="order-delete-button123"
                                          onClick={this.submitSiteManagerData}>Delete Supplier
                                  </button>
                                  <button type="button" name="save" className="order-clear-button123"
                                          onClick={this.submitSiteManagerData}>Clear
                                  </button>
                              <Col md={8}>

                                  <br/>
                                  <Card
                                      plain
                                      title="Site Manager Details"
                                      ctTableFullWidth
                                      ctTableResponsive
                                      content={
                                          <Table hover>
                                              <thead>
                                              <tr>

                                                  <th className="employee-num-column">Employee ID</th>
                                                  <th className="employee-id">Employee Name</th>
                                                  <th className="employee-name">Site Name</th>
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

export default ManageSiteManager;

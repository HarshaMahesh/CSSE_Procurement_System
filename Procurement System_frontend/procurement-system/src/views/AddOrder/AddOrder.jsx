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
import { Card } from "components/Card/Card.jsx";


//import avatar from "assets/img/faces/face-3.jpg";

class AddOrder extends Component {

    constructor(props) {
        super(props);
       // this.setAdmissionData = this.setAdmissionData.bind(this);
        this.submitAdmissionData = this.submitAdmissionData.bind(this);

        this.setselectedBHTNo = this.setselectedBHTNo.bind(this);
        this.setselectedPatientData = this.setselectedPatientData.bind(this);
        this.setselectedWardNo = this.setselectedWardNo.bind(this);
        this.setselectedBedNo = this.setselectedBedNo.bind(this);
        this.setselectedAdmittedDate = this.setselectedAdmittedDate.bind(this);
        this.setselectedadmittedTime = this.setselectedadmittedTime.bind(this);


        this.state = {

            selectedBhtNo:"",
            selectedPatientName:"",
            selectedWardNo:"",
            selectedBedNo:"",
            selectedAdmittedDate:"",
            selectedAdmittedTime:0,
            name: 'Composed TextField'
        };
    }
    setselectedBHTNo(e){
        this.setState({selectedBhtNo:e.target.value});
    }

    setselectedPatientData(e){
        this.setState({selectedPatientName:e.target.value});
    }

    setselectedWardNo(e){
        this.setState({selectedWardNo:e.target.value});
    }

    setselectedBedNo(e){
        this.setState({selectedBedNo:e.target.value});
    }

    setselectedAdmittedDate(e){
        this.setState({selectedAdmittedDate:e.target.value});
    }

    setselectedadmittedTime(e){
        this.setState({selectedAdmittedTime:e.target.value});
    }



    //
    // setAdmissionData(e){
    //     console.log(e.target.value)
    // }

    submitAdmissionData(){
        //console.log("Button Clicked");
        let object = {
            BHTNo: this.state.selectedBhtNo,
            patientName: this.state.selectedPatientName,
            wardNo: this.state.selectedWardNo,
            bedNo: this.state.selectedBedNo,
            admittedDate: this.state.selectedAdmittedDate,
            admittedTime: this.state.selectedAdmittedTime
        }

        console.log(object);

        Axios.post('http://localhost:8083/patients',object).then(function (data) {
            console.log(data);
            console.log("New Patient Admission Added");
            alert("New Patient Admission Added");
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
                      <div className="header">
                          <center><b><h4 className="title">Item Details</h4></b></center>
                          <div className="settings-search-item input">

                              <div className="setting-item-label">Search Item</div>
                              <input type="text" name="profile-lname" onChange={this.setselectedBedNo}  />

                          </div>
                          <hr/>

                      </div>
                      <div className="content">
                          <Row>
                              <Col md={4}>


                                  <div className="settings-item">
                                      <div className="setting-item-label">Item_id</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedBedNo}/>

                                  </div><br/>

                                  <div className="settings-item">
                                      <div className="setting-item-label">Item Name</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedBedNo}/>

                                  </div><br/>
                                  <div className="settings-combo">
                                      <div className="setting-item-label">Item</div>
                                      <select className="combo" onChange={this.setselectedWardNo}>
                                          <option>Item-1</option>
                                          <option>Item-2</option>
                                          <option>Item-3</option>
                                      </select>

                                  </div>
                                  <br/>
                                  <div className="settings-item">
                                      <div className="setting-item-label">Price</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedBedNo}/>

                                  </div><br/>
                                  <div className="settings-item">
                                      <div className="setting-item-label">Delivary Information</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedBedNo}/>

                                  </div><br/>
                                  <div className="settings-item">
                                      <div className="setting-item-label">Status</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedBedNo}/>

                                  </div><br/>
                                  <div className="settings-item">
                                      <div className="setting-item-label">Unit</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedBedNo}/>

                                  </div><br/>

                                  <br/>
                                  <button type="button" name="save" className="order-add-button"
                                          onClick={this.submitAdmissionData}>Add Item
                                  </button>
                              </Col>
                              <Col md={8}>

                                  <br/>
                                  <Card
                                      plain
                                      title="Item details update and delete"
                                      ctTableFullWidth
                                      ctTableResponsive
                                      content={
                                          <Table hover>
                                              <thead>
                                              <tr>

                                                  <th className="employee-num-column">ID</th>
                                                  <th className="employee-id">Name</th>
                                                  <th className="employee-name">Category ID</th>
                                                  <th className="employee-designation">Price</th>
                                                  <th className="employee-mobile">Delivary Information</th>
                                                  <th className="employee-mobile">Status</th>
                                                  <th className="employee-edit">Unit</th>
                                              </tr>
                                              </thead>
                                              <tbody>

                                              </tbody>
                                          </Table>
                                      }
                                  />
                                  <br/>

                                  <button type="button" name="save" className="order-add-button"
                                          onClick={this.submitAdmissionData}>Update
                                  </button>
                                  <button type="button" name="save" className="order-add-button"
                                          onClick={this.submitAdmissionData}> Delete
                                  </button>

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

export default AddOrder;

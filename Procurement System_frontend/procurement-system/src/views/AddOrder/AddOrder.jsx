import React, { Component } from "react";
import Axios from 'axios';

import {
  Grid,
  Row,
  Col,
 // FormGroup,
 //ControlLabel,
} from "react-bootstrap";
import '../../assets/css/order.css';
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
    return <div>
        <div className="content">
            <Grid fluid>
                <Row>
                    <Col>
                        <Card
                            title="Order Details"
                            content={

                                <form action="">

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
                                        <div className="setting-item-label">Quantity</div>
                                        <input type="text" name="profile-lname" onChange={this.setselectedPatientData}/>
                                    </div>
                                    <br/>
                                    <br/>

                                    <div className="settings-item">
                                        <div className="setting-item-label">Action</div>
                                        <input type="text" name="profile-lname" onChange={this.setselectedBedNo}/>

                                    </div>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <button type="button" name="save" className="order-add-button"
                                            onClick={this.submitAdmissionData}>Add Order
                                    </button>
                                </form>

                            }
                            />
                    </Col>
                </Row>
            </Grid>
        </div>


    </div>
  }
}

export default AddOrder;

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
import './css/cssSupplier.css';
import { Card } from "components/Card/Card.jsx";



//import avatar from "assets/img/faces/face-3.jpg";

class AddOrder extends Component {

    constructor(props) {
        super(props);

        this.submitSupplierData = this.submitSupplierData.bind(this);

        this.setselectedSupplierID = this.setselectedSupplierID.bind(this);
        this.setselectedSupplierName = this.setselectedSupplierName.bind(this);
        this.setselectedBankAccntNo = this.setselectedBankAccntNo.bind(this);
        this.setselectedAddress = this.setselectedAddress.bind(this);
        this.setselectedEmail = this.setselectedEmail.bind(this);
        this.setselectedPhone = this.setselectedPhone.bind(this);
        this.setselectedItems = this.setselectedItems.bind(this);
        this.setselectedAvailable = this.setselectedAvailable.bind(this);

        this.state = {

            selectedSupplierID:"",
            selectedSupplierName:"",
            selectedBankAccntNo:"",
            selectedAddress:"",
            selectedEmail:"",
            selectedPhone:"",
            selectedItems:{"":0},
            selectedAvailable:""
        };
    }
    setselectedSupplierID(e){
        this.setState({selectedSupplierID:e.target.value});
    }

    setselectedSupplierName(e){
        this.setState({selectedSupplierName:e.target.value});
    }

    setselectedBankAccntNo(e){
        this.setState({selectedBankAccntNo:e.target.value});
    }

    setselectedAddress(e){
        this.setState({selectedAddress:e.target.value});
    }
    
    setselectedEmail(e){
        this.setState({selectedEmail:e.target.value});
    }

    setselectedPhone(e){
        this.setState({selectedPhone:e.target.value});
    }

    setselectedItems(e){
        this.setState({selectedItems:e.target.value});
    }
   
    setselectedAvailable(e){
        this.setState({selectedAvailable:e.target.value});
    }


    //
    // setAdmissionData(e){
    //     console.log(e.target.value)
    // }

    submitSupplierData(){
        //console.log("Button Clicked");
        let object = {
            supplierID: this.state.selectedItemId,
            supplierName: this.state.selectedItemName,
            bankAccntNo: this.state.selectedRestrictedItem,
            address: this.state.selectedCategoryID,
            email: this.state.selectedPrice,
            phone: this.state.selectedPhone,
            items: this.state.selectedItems,
            available: this.state.selectedAvailable
        }

        console.log(object);

        Axios.post('http://localhost:8083/Supplier',object).then(function (data) {
            console.log(data);
            console.log("New Supplier Added");
            alert("New Supplier Added");
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

                                  
                                  <div className="settings-combo123">
                                      <div className="setting-item-label123">Supplier ID</div>
                                      <select className="combo" onChange={this.setselectedSupplierID}>
                                          <option>sup-1</option>
                                          <option>sup-2</option>
                                          <option>sup-3</option>
                                      </select>

                                  </div><br/>

                                  <div className="settings-item123">
                                      <div className="setting-item-label123">Supplier Name</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedSupplierName}/>

                                  </div><br/>

                                  <div className="settings-item123">
                                      <div className="setting-item-label123">Bank Account No:</div>
                                      <input type="text" name="profile-lname" onChange={this.selectedBankAccntNo}/>

                                  </div><br/>

                                  <div className="settings-item123">
                                      <div className="setting-item-label123">Address</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedAddress}/>
                                  </div><br/>

                                  
                                  
                                  

                              </Col>
                              <Col md={6}>
                                <div className="settings-item123">
                                      <div className="setting-item-label123">Email</div>
                                      <input type="email" name="profile-lname" onChange={this.setselectedEmail}/>

                                  </div><br/>

                                  <div className="settings-item123">
                                      <div className="setting-item-label123">Phone</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedPhone}/>

                                  </div><br/>

                                  <div className="settings-combo123">
                                      <div className="setting-item-label123">Items</div>
                                      <select className="combo" onChange={this.setselectedItems}>
                                          <option>item1</option>
                                          <option>item2</option>
                                      </select>

                                  </div><br/>

                                  <div className="settings-combo123">
                                      <div className="setting-item-label123">Availability</div>
                                      <select className="combo" onChange={this.setselectedAvailable}>
                                          <option>True</option>
                                          <option>False</option>
                                      </select>

                                  </div><br/>
                                  
                              </Col>
                              
                              <button type="button" name="save" className="order-add-button123"
                                          onClick={this.submitSupplierData}>Add Supplier
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
                                      title="Supplier Details"
                                      ctTableFullWidth
                                      ctTableResponsive
                                      content={
                                          <Table hover>
                                              <thead>
                                              <tr>

                                                  <th className="employee-num-column">Supplier ID</th>
                                                  <th className="employee-id">Supplier Name</th>
                                                  <th className="employee-name">Bank Account No:</th>
                                                  <th className="employee-designation">Address</th>
                                                  <th className="employee-mobile">Phone</th>
                                                  <th className="employee-mobile">Items</th>
                                                  <th className="employee-edit">Availability</th>
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

export default AddOrder;

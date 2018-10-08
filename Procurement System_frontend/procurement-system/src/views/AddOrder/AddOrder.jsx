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
        this.submitItemData = this.submitItemData.bind(this);

        this.setselectedorderID = this.setselectedorderID.bind(this);
        this.setselectedsequential_Reference = this.setselectedsequential_Reference.bind(this);
        this.setselecteditems = this.setselecteditems.bind(this);
        this.setselectedquantity = this.setselectedquantity.bind(this);
        this.setselectedorderStatus = this.setselectedorderStatus.bind(this);
        this.setselecteddate = this.setselecteddate.bind(this);
        this.setselectedisDraftPurchaseOrder = this.setselectedisDraftPurchaseOrder.bind(this);
        this.setselectedadonHolde = this.setselectedadonHolde.bind(this);


        this.state = {

            selectedorderID:"",
            selectedsequential_Reference:"",
            selecteditems:"",
            selectedquantity:"",
            selectedorderStatus:"",
            selectedonDate:"",
            selectedisDraftPurchaseOrder:"",
            selectedonHold:"",
            name: 'Composed TextField'
        };
    }
    setselectedorderID(e){
        this.setState({selectedorderID:e.target.value});
    }

    setselectedsequential_Reference(e){
        this.setState({selectedsequential_Reference:e.target.value});
    }

    setselecteditems(e){
        this.setState({selecteditems:e.target.value});
    }
    setselectedquantity(e){
        this.setState({selectedquantity:e.target.value});
    }

    setselectedorderStatus(e){
        this.setState({selectedorderStatus:e.target.value});
    }

    setselecteddate(e){
        this.setState({selectedonDate:e.target.value});
    }

    setselectedisDraftPurchaseOrder(e){
        this.setState({selectedisDraftPurchaseOrder:e.target.value});
    }
    setselectedadonHolde(e){
        this.setState({selectedonHold:e.target.value});
    }
    setOrderData(OrderData){
        this.setState({ItemData:OrderData});
    }

    tableload(){
        Axios.get('http://localhost:8083/api/purchase_order/Orders').then(function (data) {
            this.setOrderData(data.data);
            console.log(data.data);
        }.bind(this))
    }

    submitItemData(){
        //console.log("Button Clicked");


        var quantitis1=this.state.selecteditems;
        var quantitis=parseInt(this.state.selectedquantity);



        let object = {
            orderID: this.state.selectedorderID,
            sequential_Reference: this.state.selectedsequential_Reference,
            items: {quantitis1:quantitis},
            orderStatus: this.state.selectedorderStatus,
            date: this.state.selectedonDate,
            isDraftPurchaseOrder: this.state.selectedisDraftPurchaseOrder,
            onHold: this.state.selectedonHold
        }

        console.log(object);

        Axios.post('http://localhost:8083/api/purchase_order/addOrder',object).then(function (data) {
            console.log(data);
            console.log("New Order Details Added");
            alert("New Order Details Added");

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
                          <center><b><h4 className="title">Order Details</h4></b></center>
                          <div className="settings-search-item input">

                              <input type="text" name="profile-lname" onChange={this.setsearchData}/>


                              <button type="button" name="save" className="search_button"
                                      onClick={this.searchItem}>search
                              </button>

                          </div>
                          <hr/>

                      </div>
                      <div className="content">
                          <Row>
                              <Col md={4}>


                                  <div className="settings-item">
                                      <div className="setting-item-label">Order ID</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedorderID}/>

                                  </div><br/>

                                  <div className="settings-item">
                                      <div className="setting-item-label">Sequential Reference</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedsequential_Reference}/>

                                  </div><br/>
                                  <div className="settings-combo">
                                      <div className="setting-item-label">Items</div>
                                      <select className="combo" onChange={this.setselecteditems}>
                                          <option>cement</option>
                                          <option>metal</option>
                                          <option>glass</option>
                                      </select>

                                  </div>
                                  <br/>
                                  <div className="settings-item">
                                      <div className="setting-item-label">Quantity</div>
                                      <input type="text" name="profile-lname" onChange={this.setselectedquantity}/>

                                  </div><br/>

                                  <div className="settings-combo">
                                      <div className="setting-item-label">Items</div>
                                      <select className="combo" onChange={this.setselectedorderStatus}>
                                          <option>Select Approve status</option>
                                          <option>Unapproved</option>

                                      </select>

                                  </div><br/>
                                  <div className="settings-item">
                                      <div className="setting-item-label">Date</div>
                                      <input type="text" name="profile-lname" onChange={this.setselecteddate}/>

                                  </div><br/>
                                  <div className="settings-combo">
                                      <div className="setting-item-label">Draft Purchase</div>
                                      <select className="combo" onChange={this.setselectedisDraftPurchaseOrder}>
                                          <option>True</option>
                                          <option>False</option>
                                      </select>

                                  </div>
                                 <br/>
                                  <div className="settings-combo">
                                      <div className="setting-item-label">On Hold</div>
                                      <select className="combo" onChange={this.setselectedadonHolde}>
                                          <option>True</option>
                                          <option>False</option>
                                      </select>

                                  </div>
                                 <br/>

                                  <br/>
                                  <button type="button" name="save" className="order-add-button"
                                          onClick={this.submitItemData}>Add Order
                                  </button>
                              </Col>
                              <Col md={8}>

                                  <br/>
                                  <Card
                                      plain
                                      title="Order details update and delete"
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

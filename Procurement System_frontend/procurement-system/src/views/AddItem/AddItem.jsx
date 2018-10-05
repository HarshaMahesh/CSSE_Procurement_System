import React, { Component } from "react";
import Axios from 'axios';
import ViewItemRows from "./ViewItemRow";
import {Input} from 'react-materialize';

import Button from "components/CustomButton/CustomButton.jsx";



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

class AddItem extends Component {

    constructor(props) {
        super(props);

        this.submitItemData = this.submitItemData.bind(this);

        this.setselectedItemId = this.setselectedItemId.bind(this);
        this.setselectedItemName = this.setselectedItemName.bind(this);
        this.setselectedCategoryID = this.setselectedCategoryID.bind(this);
        this.setselectedPrice = this.setselectedPrice.bind(this);
        this.setselectedDelivaryInformation = this.setselectedDelivaryInformation.bind(this);
        this.setselectedRestrictedItem = this.setselectedRestrictedItem.bind(this);
        this.setselectedUnit = this.setselectedUnit.bind(this);

        this.state = {

            selectedItemId:"",
            selectedItemName:"",
            selectedCategoryID:"",
            selectedPrice:"",
            selectedDelivaryInformation:"",
            selectedRestrictedItem:"",
            selectedUnit:"",
            name: 'Composed TextField'
        };

        super(props);
        this.ViewAll_Items();
        this.state = {
            ItemsData:[],
        }
        this.setItemsData = this.setItemsData.bind(this);
        this.setsearchData=this.setsearchData.bind(this);

    }
    setselectedItemId(e){
        this.setState({selectedItemId:e.target.value});
    }

    setselectedItemName(e){
        this.setState({selectedItemName:e.target.value});
    }

    setselectedCategoryID(e){
        this.setState({selectedCategoryID:e.target.value});
    }

    setselectedPrice(e){
        this.setState({selectedPrice:e.target.value});
    }

    setselectedDelivaryInformation(e){
        this.setState({selectedDelivaryInformation:e.target.value});
    }

    setselectedRestrictedItem(e){
        this.setState({selectedRestrictedItem:e.target.value});
    }
    setselectedUnit(e){
        this.setState({selectedUnit:e.target.value});
    }

    setItemsData(ItemsData){
        this.setState({ItemsData:ItemsData});
    }
    setsearchData(e){
        this.setState({selectedItemName:e.target.value});
        console.log(e.target.value);
        return e.target.value;
    }
    state = {
        name: 'Composed TextField',
    };

    ViewAll_Items(){
        Axios.get('http://localhost:8083/api/item/getItems').then(function (data) {
            this.setItemsData(data.data);
            console.log(data);
        }.bind(this))
    }
    View_Items(){
        Axios.get('http://localhost:8083/patients/'+this.state.selectedbhtno).then(function (data) {
            this.setItemsData(data.data);
            console.log(data.data.data);
        }.bind(this))
    }


    submitItemData(){
        //console.log("Button Clicked");
        let object = {
            itemID: this.state.selectedItemId,
            itemName: this.state.selectedItemName,
            categoryID: this.state.selectedCategoryID,
            price: this.state.selectedPrice,
            delivaryInformation: this.state.selectedDelivaryInformation,
            isRestrictedItem: this.state.selectedRestrictedItem,
            unit: this.state.selectedUnit
        }

        console.log(object);

        Axios.post('http://localhost:8083/api/item/addItem',object).then(function (data) {
            console.log(data);
            console.log("New Item Details Added");
            alert("New Item Details Added");

        })
    }
    handleChange = event => {
        this.setState({ name: event.target.value });
    };



    render() {
        const {classes} = this.props;

        let tableRows = this.state.ItemsData.map(function (item, i) {
            return <ViewItemRows itemID={item.itemID} itemName={item.itemName} categoryID={item.categoryID} price={item.price} delivaryInformation={item.delivaryInformation} isRestrictedItem={item.isRestrictedItem} unit={item.unit} key={i}/>
        });
        return (


            <div className="content">
                <Grid fluid>
                    <div className="card">
                        <div className="header">
                            <center><b><h4 className="title">Item Details</h4></b></center>
                            <div className="settings-search-item input">

                                <div className="setting-item-label">Search Item</div>
                                <input type="text" name="profile-lname" onChange=""  />

                            </div>
                            <hr/>

                        </div>
                        <div className="content">
                            <Row>
                                <Col md={4}>


                                    <div className="settings-item">
                                        <div className="setting-item-label">Item_id</div>
                                        <input type="text" name="profile-lname" onChange={this.setselectedItemId}/>

                                    </div><br/>

                                    <div className="settings-item">
                                        <div className="setting-item-label">Item Name</div>
                                        <input type="text" name="profile-lname" onChange={this.setselectedItemName}/>

                                    </div><br/>
                                    <div className="settings-combo">
                                        <div className="setting-item-label">Category ID</div>
                                        <select className="combo" onChange={this.setselectedCategoryID}>
                                            <option>CT001</option>
                                            <option>CT002</option>
                                            <option>CT003</option>
                                        </select>

                                    </div>
                                    <br/>
                                    <div className="settings-item">
                                        <div className="setting-item-label">Price</div>
                                        <input type="text" name="profile-lname" onChange={this.setselectedPrice}/>

                                    </div><br/>
                                    <div className="settings-item">
                                        <div className="setting-item-label">Delivary Information</div>
                                        <input type="text" name="profile-lname" onChange={this.setselectedDelivaryInformation}/>

                                    </div><br/>
                                    <div className="settings-item">
                                        <div className="setting-item-label">Status</div>
                                        <input type="text" name="profile-lname" onChange={this.setselectedRestrictedItem}/>

                                    </div><br/>
                                    <div className="settings-item">
                                        <div className="setting-item-label">Unit</div>
                                        <input type="text" name="profile-lname" onChange={this.setselectedUnit}/>

                                    </div><br/>

                                    <br/>
                                    <button type="button" name="save" className="order-add-button"
                                            onClick={this.submitItemData}>Add Item
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
                                                {tableRows}
                                                </tbody>
                                            </Table>
                                        }
                                    />
                                    <br/>

                                    <button type="button" name="save" className="order-add-button"
                                            onClick={this.submitItemData}>Update
                                    </button>
                                    <button type="button" name="save" className="order-add-button"
                                            onClick={this.submitItemData}> Delete
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

export default AddItem;

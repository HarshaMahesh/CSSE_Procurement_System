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

class LogManager extends Component {

    constructor(props) {
        super(props);

        this.submitItemData = this.submitItemData.bind(this);
        this.setItemsData = this.setItemsData.bind(this);
        this.setSearchData = this.setSearchData.bind(this);


        

        this.setselectedLogID = this.setselectedLogID.bind(this);
        this.setselectedLogDetail = this.setselectedLogDetail.bind(this);
        this.setselectedDateTime = this.setselectedDateTime.bind(this);

        this.state = {


            selectedLogID:"",
            selectedLogDetail:"",
            selectedDateTime:"",

            
            ItemData:[],
            searchdata:[],

            name: 'Composed TextField'
        };

        this.tableload();




    }
    setselectedLogID(e){
        this.setState({selectedLogID:e.target.value});
    }
    setselectedLogDetail(e){
        this.setState({selectedLogDetail:e.target.value});
    }
    setselectedDateTime(e){
        this.setState({setselectedDateTime:e.target.value});
    }




    setItemsData(ItemsData){
        this.setState({ItemData:ItemsData});
    }
    setSearchData(searchdata){
        this.setState({searchdata:searchdata});
    }

 //   setsearchData(e){
  //      this.setState({selectitemname:e.target.value});

   // }
    state = {
        name: 'Composed TextField',
    };

//Loading the Log Table Details 
    tableload(){
        Axios.get('http://localhost:8083/api/log/').then(function (data) {
            this.setItemsData(data.data);
            console.log(data.data);
        }.bind(this))
    }


   /* searchItem() {
        Axios.get('http://localhost:8083/api/item/getItem/I001').then(function (data) {
            this.setSearchData(data.data);
            // this.setTextBoxvalues();
            //console.log(this.state.selectitemname);
            console.log(data.data);
        }.bind(this))

    }*/


    submitItemData(){
        //console.log("Button Clicked");
        let object = {
            

            logID: this.state.selectedLogID,
            logDetail: this.state.selectedLogDetail,
            dateTime: this.state.selectedDateTime
        }


        


        console.log(object);

        Axios.post('http://localhost:8083/api/log/addLog/',object).then(function (data) {
           
           console.log(data.data);
           // console.log("New Log Added to the System");
           alert("New Log Added");

          window.location.reload();

        })
    }



    // setTextBoxvalues() {
    //     this.state.searchdata.map(function (item) {

    //         //BHTNo: this.state.selectBhtNo,
    //         document.getElementById("id").value = item.itemID;
    //         document.getElementById("iname").value = item.itemName;
    //         document.getElementById("ct").value = item.categoryID;
    //         document.getElementById("iprice").value = item.price;
    //         document.getElementById("di").value = item.delivaryInformation;
    //         document.getElementById("rs").value =String(item.restrictedItem);
    //         document.getElementById("iunit").value = item.unit;


    //     });
    // }
    handleChange = event => {
        this.setState({ name: event.target.value });
    };

    render() {
        const {classes} = this.props;

        let tableRows = this.state.ItemData.map(function (item, i) {
            return <ViewItemRows logID={item.logID} logDetail={item.logDetail} dateTime={item.dateTime} unit={item.unit} key={i}/>

        });
        return (


            <div className="content">
                <Grid fluid>
                    <div className="card">
                        <div className="header">
                            <center><b><h4 className="title">Log Manager</h4></b></center>
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
                                        <div className="setting-item-label">Log ID</div>
                                        <input type="text" id="id" name="profile-lname" onChange={this.setselectedLogID}/>

                                    </div><br/>

                                    <div className="settings-item">
                                        <div className="setting-item-label">Log Details</div>
                                        <input type="text" id="iname" name="profile-lname" onChange={this.setselectedLogDetail}/>

                                    </div><br/>
                                    <div className="settings-combo">
                                        <div className="setting-item-label">Category ID</div>
                                        <select className="combo" id="ct" onChange={this.setselectedCategoryID}>
                                            <option>LG001</option>
                                            <option>LG002</option>
                                            <option>LG003</option>
                                        </select>

                                    </div>
                                    <br/>
                                    <div className="settings-item">
                                        <div className="setting-item-label">Date Time</div>
                                        <input type="text" id="iprice" name="profile-lname" onChange={this.setselectedDateTime}/>

                                    </div><br/>

                                    
                                        

                                    <br/>
                                    <button type="button" name="save" className="order-add-button"
                                            onClick={this.submitItemData}>Add Log
                                    </button>
                                </Col>
                                <Col md={8}>

                                    <br/>
                                    <Card
                                        plain
                                        title="Log Manager Functions"
                                        ctTableFullWidth
                                        ctTableResponsive
                                        content={
                                            <Table hover>
                                                <thead>
                                                <tr>

                                                    <th className="employee-num-column">Log ID</th>
                                                    <th className="employee-id">Log Detail</th>
                                                    <th className="employee-name">Date Time</th>
                                                    
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

export default LogManager;

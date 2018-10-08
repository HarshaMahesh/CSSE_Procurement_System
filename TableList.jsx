import React, { Component } from 'react';

// importing main components of the sample center management
import SuccessfullPayments from "views/TableList/SuccessfullPayments";
import ManagerApproval from "views/TableList/ManagerApproval";
import PendingPayments from "views/TableList/Pendingpayments";




//main management component for sample centers
export default class TableList extends Component {

    constructor(props){
        super(props)
        this.state = {
            // setting the navigations when the sample center management is selected
            activeNavLink : { pendingpayments : true , invoicedetails : false, manegerapproval: false },

            navBarEvent : {activependingpayments: "active" ,activesuccessfullpayments:"",activemanagerapproval:""},

            payments : []
        }
    }

    // setting states according to the selections
    pendingpaymentNavPressed = () =>{
        this.setState({ activeNavLink : {pendingpayments : true , invoicedetails : false, manegerapproval: false }})
    }
    successfullpaymentsPressed = () =>{
        this.setState({activeNavLink: {pendingpayments : false , invoicedetails : true, manegerapproval: false }})
    }
    mangerapprovalPressed = () =>{
    this.setState({ activeNavLink:{pendingpayments : false , invoicedetails : false, manegerapproval: true }})
    }

    //rendering the component according to the selection
    renderMainForm=() =>{
        if(this.state.activeNavLink.invoicedetails === true ){

            return <SuccessfullPayments AllSampleCenters = {this.state.samplecenters}/>

        }else if(this.state.activeNavLink.manegerapproval === true){

            return <ManagerApproval AllSampleCenters = {this.state.samplecenters}/>

        }
       else if(this.state.activeNavLink.pendingpayments === true){

           return <PendingPayments llSampleCenters = {this.state.samplecenters}/>

       }
    }
    render() {

        return <div>

            <div style={{color:"black"}}>
                <div className="container col-md-10" style={{
                    margin: "-20px 0px 0px 0px",
                    backgroundColor: "#FFF",
                    opacity: "0.9",
                    height: "700px"
                }} >
                    <ul className="nav nav-tabs">
                        <li className={this.state.navBarEvent.activependingpayments}><a onClick={this.pendingpaymentNavPressed}>Pending Payments</a></li>
                        <li className={this.state.navBarEvent.activesuccessfullpayments}><a onClick={this.successfullpaymentsPressed}>Invoice Details</a></li>
                        <li className={this.state.navBarEvent.activemanagerapproval}><a onClick={this.mangerapprovalPressed}>Manager Approval</a></li>

                    </ul>

                    {
                        // rendering the main form containing the main components of sample center management
                        this.renderMainForm()
                    }
                </div>
            </div>
        </div>
    }


}
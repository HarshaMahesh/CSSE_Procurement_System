import React, {Component} from 'react';
import axios from 'axios';


export default class SuccessfullPayments extends Component{

    constructor(props){
        super(props);
        this.state={
            order:[],
            NewOrder:{},


        }
    }

    componentWillMount(){

        this.getAllOrders();
    }

    onidChange(event){
        this.id= event.target.value;

    }

    onpriorityChange(event){
        this.priority= event.target.value;

    }

    onstatusChange(event){
        this.status= event.target.value;
    }

    onpnoChange(event){
        this.pNO= event.target.value;
    }

    ontestNameChange(event){
        this.testName= event.target.value;
    }

    onreqDateChange(event){
        this.reqDate= event.target.value;
    }

    ondueDateChange(event){
        this.dueDate= event.target.value;
    }

    onpTYpeChange(event){
        this.ptype= event.target.value;
    }

    onreqPersonChange(event){
        this.reqPerson= event.target.value;
    }

    oncomChange(event){
        this.com= event.target.value;
    }

    formSub(event){
        event.preventDefault();
        event.stopPropagation();

        this.setState({ NewOrder : {requestId:this.id,priority : this.priority , status: this.status,pNO:this.pNO,testName:this.testName,reqDate:this.reqDate,dueDate:this.dueDate,ptype:this.ptype,reqPerson:this.reqPerson,com:this.com }});

        this.insertLabOrder(this.state.NewOrder)

    }

    formUpdateSub(event){
        event.preventDefault();
        event.stopPropagation();

        this.setState({ NewOrder : {priority : this.priority , status: this.status,pNO:this.pNO,testName:this.testName,reqDate:this.reqDate,dueDate:this.dueDate,ptype:this.pType,reqPerson:this.reqPerson,com:this.com }});

        this.updateLabOrder(this.id,this.state.NewOrder)
    }



    formDeleteSub(event){
        event.preventDefault();
        event.stopPropagation();

        this.deleteLabOrder(this.id).then(function(){
            this.getAllOrders();
        });
    }

    updateSearch(event){
        this.setState({search : event.target.value.substr(0,20)});
    }

    render(){



        return <div>





            <div align="center" style={{ color:"black" }}>
                <center>
                    <h1><b>Invoice Details</b></h1><br/><br/>
                </center>

                <table className="table"  style={{ padding:"10px"}}>
                    <thead>
                    <tr>
                        <th> Invoice Id</th>
                        <th>Issue Date</th>
                        <th>Items </th>
                        <th>Total Amount</th>
                        <th>Supplier</th>

                    </tr>
                    </thead>
                    <tbody>
                    {
                        this.state.order.map(function(manageorder)  {
                            return (
                                <tr key={manageorder.requestId}>
                                    <td style={{paddingLeft:"10Px"}}>{manageorder.orderid}</td>
                                    <td style={{paddingLeft:"10Px"}}>{manageorder.date}</td>
                                    <td style={{paddingLeft: "10px"}}>{manageorder.amount}</td>
                                    <td style={{paddingLeft: "10px"}}>{manageorder.amount}</td>


                                </tr>
                            );
                        })
                    }

                    </tbody>
                </table>



            </div>




        </div>
    }


    getAllOrders() {
        axios.get('http://localhost:3001/Laboratory/order')
            .then(function (res) {
                let order = res.data.data;
                this.setState({order: order});
                console.log(order);
            }.bind(this)).catch(function(err){
            console.log(err);
        });

    }}









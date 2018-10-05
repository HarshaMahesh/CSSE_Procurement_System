import React,{Component} from 'react';
import axios from 'axios';

export default class PayNow extends Component{

    constructor(props){
        super(props);
        this.state={
            order:[],
            NewOrder:{}

        }
    }

    onidChange(event){
        this.id= event.target.value;

    }

    onsupplierChange(event){
        this.supplier= event.target.value;

    }

    onbankChange(event){
        this.bank= event.target.value;
    }

    onamountChange(event){
        this.amount= event.target.value;
    }







    formSub(event){
        event.preventDefault();
        event.stopPropagation();

        this.setState({ NewOrder : {orderid:this.id,supplier : this.supplier , bankaccount: this.bank,amount:this.amount,status:"pending"}});

        this.insertLabOrder(this.state.NewOrder)

    }







    render(){

        return  (
            <div>

                <button type="button" className="btn btn-info btn-md" data-toggle="modal" data-target={`#myModal${this.props.orderid}`}>Pay Now</button>

                {/* <!-- Modal --> */}
                <div id={`myModal${this.props.orderid}`} className="modal fade" role="dialog"  style={{zIndex:"5"}} data-backdrop="false">
                    <div className="modal-dialog">

                        {/* <!-- Modal content--> */}
                        <div className="modal-content">
                            <div className="modal-header">
                                <button type="button" className="close" data-dismiss="modal">&times;</button>
                                <h4 className="modal-title">Order Manage Section</h4>
                            </div>
                            <div className="modal-body">
                                <div>
                                    <hr/>
                                    <form onSubmit={event=>this.formSub(event)}>
                                        <tr> <td><label>Order Id:</label></td>
                                            <td><input type="text" defaultValue={this.props.orderid} disabled  /></td>
                                        </tr>
                                        <tr> <td><label>Supplier:</label></td>
                                            <td><input type="text" onChange={event=>this.onsupplierChange(event)} required /></td>
                                        </tr>
                                        <tr><td><label>Bank Account:</label></td>
                                            <td><input type="text" onChange={event=>this.onbankChange(event)} required/></td>
                                        </tr>
                                        <tr><td><label>Amount:</label></td>
                                            <td><input type="text" onChange={event=>this.onamountChange(event)} required/></td>
                                        </tr>

                                        <input type="submit" value="Pay"/>
                                    </form>
                                </div>


                            </div>
                            <div className="modal-footer">
                                <button type="button" className="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                        </div>

                    </div>
                </div>

            </div>
        );
    }


    insertLabOrder(obj){
        axios.post('http://localhost:3001/Laboratory/order', obj)
            .then(function (res) {
                console.log(res);
            }).catch(function(err){
            console.log(err);
        });
    }




}
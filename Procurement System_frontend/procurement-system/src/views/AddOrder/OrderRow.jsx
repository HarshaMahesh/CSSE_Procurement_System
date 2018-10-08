import React, { Component } from 'react'

class OrderRow extends Component{
    componentDidMount(){
        console.log(this.props);
    }

    render(){
        return(
            <tr>
                <td>{this.props.orderID}</td>
                <td>{this.props.sequential_Reference}</td>
                <td>{this.props.items}</td>
                <td>{this.props.orderStatus}</td>
                <td>{this.props.date}</td>
                <td>{this.props.isDraftPurchaseOrder}</td>
                <td>{this.props.onHold}</td>
            </tr>
        )
    }
}

export default OrderRow;
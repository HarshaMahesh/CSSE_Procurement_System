import React, { Component } from 'react'

class ViewItemRow extends Component{
    componentDidMount(){
        console.log(this.props);
    }

    render(){
        return(
            <tr>
                <td>{this.props.itemID}</td>
                <td>{this.props.itemName}</td>
                <td>{this.props.categoryID}</td>
                <td>{this.props.price}</td>
                <td>{this.props.delivaryInformation}</td>
                <td>{this.props.restrictedItem}</td>
                <td>{this.props.unit}</td>
            </tr>
        )
    }
}

export default ViewItemRow;
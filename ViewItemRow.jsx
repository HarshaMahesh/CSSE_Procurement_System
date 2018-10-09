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
                
            </tr>
        )
    }
}

export default ViewItemRow;
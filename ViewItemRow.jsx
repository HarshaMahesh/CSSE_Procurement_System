import React, { Component } from 'react'

class ViewItemRow extends Component{
    componentDidMount(){
        console.log(this.props);
    }

    render(){
        return(
            <tr>
                <td>{this.props.logID}</td>
                <td>{this.props.logDetail}</td>
                <td>{this.props.dateTime}</td>
                
            </tr>
        )
    }
}

export default ViewItemRow;
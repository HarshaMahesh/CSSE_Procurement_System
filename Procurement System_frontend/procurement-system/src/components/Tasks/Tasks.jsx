import React, { Component } from "react";
import avatar from "../../assets/img/construction_trends_bimcommunity.jpg";

import { UserCard } from "components/UserCard/UserCard.jsx";
import { Tooltip, OverlayTrigger } from "react-bootstrap";
import Checkbox from "components/CustomCheckbox/CustomCheckbox.jsx";
import Button from "components/CustomButton/CustomButton.jsx";

export class Tasks extends Component {
  handleCheckbox = event => {
    const target = event.target;
    console.log(event.target);
    this.setState({
      [target.name]: target.checked
    });
  };
  render() {
    return<div>


        <UserCard
            bgImage="https://ununsplash.imgix.net/photo-1431578500526-4d9613015464?fit=crop&fm=jpg&h=300&q=75&w=400"
            avatar={avatar}
            name="access engineering"
            address=" No. 159/10, Hewagama, Colombo"
            description={
                <span>
                    "To be the foremost Sri Lankan
                    <br />
                    business enterprise
                    <br />
                    in value engineering"
                  </span>
            }
            socials={
                <div>
                    <Button simple>
                        <i className="fa fa-facebook-square" />
                    </Button>
                    <Button simple>
                        <i className="fa fa-twitter" />
                    </Button>
                    <Button simple>
                        <i className="fa fa-google-plus-square" />
                    </Button>
                </div>
            }
        />

        </div>

  }
}

export default Tasks;

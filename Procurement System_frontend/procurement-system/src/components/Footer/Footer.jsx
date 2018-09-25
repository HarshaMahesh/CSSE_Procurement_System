import React, { Component } from "react";
import { Grid } from "react-bootstrap";

class Footer extends Component {
  render() {
    return (
      <footer className="footer">
        <Grid fluid>
          <nav className="pull-left">
            <ul>
              <li>
                <a href="#pablo">Home</a>
              </li>
              <li>
                <a href="#pablo">Site</a>
              </li>
              <li>
                <a href="#pablo">Contact</a>
              </li>
              <li>
                <a href="#pablo">Email</a>
              </li>
            </ul>
          </nav>
          <p className="copyright pull-right">
            &copy; {new Date().getFullYear()}{" "}
            <a href="http://www.creative-tim.com"> Code by Team Seekers</a>,
              Sri Lanka Institute of Information Technology (SLIIT)
          </p>
        </Grid>
      </footer>
    );
  }
}

export default Footer;

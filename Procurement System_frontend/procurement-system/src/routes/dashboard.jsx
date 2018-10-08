import Dashboard from "views/Dashboard/Dashboard";
import AddOrder from "views/AddOrder/AddOrder.jsx";
import ViewOrders from "views/AddOrder/ViewOrders.jsx";
import AddItem from "views/AddItem/AddItem.jsx";
import ManageSiteManager from "views/ManageSiteManagers/ManageSiteManager.jsx";
import ManageSupplier from "views/ManageSupplier/ManageSupplier";
import ManageAuthEmployee from "views/ManageAuthorizedEmployee/ManageAuthEmployee.jsx";


import TableList from "views/TableList/TableList";
import Typography from "views/Typography/Typography";
import Icons from "views/Icons/Icons";
import Maps from "views/Maps/Maps";
import Notifications from "views/Notifications/Notifications";
import Upgrade from "views/Upgrade/Upgrade";

const dashboardRoutes = [
  {
    path: "/dashboard",
    name: "Dashboard",
    icon: "pe-7s-graph",
    component: Dashboard
  },
    {
        path: "/AddItem",
        name: "Add Items",
        icon: "pe-7s-user",
        component: AddItem
    },
  {
    path: "/AddOrder",
    name: "Add Order",
    icon: "pe-7s-user",
    component: AddOrder
  },
    {
        path: "/ViewOrders",
        name: "View previous Orders",
        icon: "pe-7s-note2",
        component: ViewOrders
    },


  { path: "/icons", name: "Approved Order", icon: "pe-7s-science", component: Icons },

    {
        path: "/notifications",
        name: "Reject Orders",
        icon: "pe-7s-bell",
        component: Notifications
    },
    {
    //upgrade: true,
    path: "/upgrade",
    name: "Pending Order",
    icon: "pe-7s-rocket",
    component: Upgrade
  },
    { path: "/maps", name: "Site Map", icon: "pe-7s-map-marker", component: Maps },

    {
        path: "/table",
        name: "Payment",
        icon: "pe-7s-note2",
        component: TableList
    },
    {
        path: "/table",
        name: "previous Order",
        icon: "pe-7s-note2",
        component: TableList
    },
    {
        path: "/typography",
        name: "My Notification",
        icon: "pe-7s-news-paper",
        component: Typography
    },

    {
        path: "/ManageSiteManager",
        name: "Manage SiteManager",
        icon: "pe-7s-graph",
        component: ManageSiteManager
    },
    {
        path: "/ManageSupplier",
        name: "Manage Supplier",
        icon: "pe-7s-graph",
        component: ManageSupplier
    },
    {
        path: "/ManageAuthorizedEmp",
        name: "Authorized Employee",
        icon: "pe-7s-graph",
        component: ManageAuthEmployee
    },

  { redirect: true, path: "/", to: "/dashboard", name: "Dashboard" }
];

export default dashboardRoutes;

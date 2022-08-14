import React from "react";
import DashboardContent from "../../components/Dashboard/Dashboard";

const PurchaseDashboard = () => {
  const sidebarData = {
    Dashboard: "Dashboard",
    Purchase: [
      "Material Request",
      "Purchase Order",
      "Purchase Invoice",
      "Request for Quatation",
    ],
    Invoices: [
      "Material Request",
      "Purchase Order",
      "Purchase Invoice",
      "Request for Quatation",
    ],
    "Items & Pricing": [
      "Material Request",
      "Purchase Order",
      "Purchase Invoice",
      "Request for Quatation",
    ],
    Supplier: [
      "Material Request",
      "Purchase Order",
      "Purchase Invoice",
      "Request for Quatation",
    ],
    Project: [
      "Material Request",
      "Purchase Order",
      "Purchase Invoice",
      "Request for Quatation",
    ],
    Deliveries: [
      "Material Request",
      "Purchase Order",
      "Purchase Invoice",
      "Request for Quatation",
    ],
    Reports: [
      "Material Request",
      "Purchase Order",
      "Purchase Invoice",
      "Request for Quatation",
    ],
  };
  return (
    <div>
      <DashboardContent data={sidebarData} />
    </div>
  );
};

export default PurchaseDashboard;

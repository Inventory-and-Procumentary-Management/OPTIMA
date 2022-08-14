// import DashboardContent from "./components/Dashboard/Dashboard";
import Dashboard from "./pages/Dashboard";
import PurchaseDashboard from "./pages/PurchasingManager/PurchaseDashboard";
import Purchase from "./pages/PurchasingManager/Purchase";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import SignInSide from "./pages/SignIn";

const App = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<SignInSide />} />
        <Route index element={<SignInSide />} />

        <Route path="dashboard" element={<Dashboard />}>
          {/* <Route path="purchaseDashboard" element={<PurchaseDashboard />} /> */}
          <Route path="purchase" element={<Purchase />} />
          {/* <Route path="contact" element={<Contact />} /> */}
          {/* <Route path="*" element={<NoPage />} /> */}
        </Route>
      </Routes>
    </BrowserRouter>
  );
};

export default App;

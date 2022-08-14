import React from 'react'
import DashboardItem from '../components/Dashboard/Dashboard'
import PurchaseDashboard from './PurchasingManager/PurchaseDashboard'

const Dashboard = (props) => {
  return (
    <div>
      <PurchaseDashboard />
      {/* meka one venne na
      sign in eken passe kelinma user anuva dashboard ekata redirect karanava */}
    </div>
  )
}

export default Dashboard
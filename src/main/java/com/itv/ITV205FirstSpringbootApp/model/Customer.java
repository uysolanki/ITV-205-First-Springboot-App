package com.itv.ITV205FirstSpringbootApp.model;


public class Customer {

		private int custId;
		private String custName;
		private String custGender;
		private String custEmail;
		
		public Customer() {}
		public Customer(int custId, String custName, String custGender, String custEmail) {
			this.custId = custId;
			this.custName = custName;
			this.custGender = custGender;
			this.custEmail = custEmail;
		}
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getCustGender() {
			return custGender;
		}
		public void setCustGender(String custGender) {
			this.custGender = custGender;
		}
		public String getCustEmail() {
			return custEmail;
		}
		public void setCustEmail(String custEmail) {
			this.custEmail = custEmail;
		}
		
		@Override
		public String toString() {
			return "Customer [custId=" + custId + ", custName=" + custName + ", custGender=" + custGender
					+ ", custEmail=" + custEmail + "]";
		}
		
		
}

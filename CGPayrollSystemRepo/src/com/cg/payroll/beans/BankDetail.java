package com.cg.payroll.beans;

public class BankDetail {
		public long accountNumber;
		public String IFSC,bankName;
		
		public BankDetail() {
			super();
		}

		public BankDetail(long accountNumber, String iFSC, String bankName) {
			super();
			this.accountNumber = accountNumber;
			IFSC = iFSC;
			this.bankName = bankName;
		}

		public long getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getIFSC() {
			return IFSC;
		}

		public void setIFSC(String iFSC) {
			IFSC = iFSC;
		}

		public String getBankName() {
			return bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		
}

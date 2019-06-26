package com.cg.payroll.beans;

public class Salary {
			float basicSalary,hra,conveyenceAllowance,otherAllowance,monthlyTax,epf,companyPf,netSalary;

			
			public Salary() {
				super();
			}

			public Salary(float basicSalary, float hra, float conveyenceAllowance, float otherAllowance,
					float monthlyTax, float epf, float companyPf, float netSalary) {
				super();
				this.basicSalary = basicSalary;
				this.hra = hra;
				this.conveyenceAllowance = conveyenceAllowance;
				this.otherAllowance = otherAllowance;
				this.monthlyTax = monthlyTax;
				this.epf = epf;
				this.companyPf = companyPf;
				this.netSalary = netSalary;
			}

			public float getBasicSalary() {
				return basicSalary;
			}

			public void setBasicSalary(float basicSalary) {
				this.basicSalary = basicSalary;
			}

			public float getHra() {
				return hra;
			}

			public void setHra(float hra) {
				this.hra = hra;
			}

			public float getConveyenceAllowance() {
				return conveyenceAllowance;
			}

			public void setConveyenceAllowance(float conveyenceAllowance) {
				this.conveyenceAllowance = conveyenceAllowance;
			}

			public float getOtherAllowance() {
				return otherAllowance;
			}

			public void setOtherAllowance(float otherAllowance) {
				this.otherAllowance = otherAllowance;
			}

			public float getMonthlyTax() {
				return monthlyTax;
			}

			public void setMonthlyTax(float monthlyTax) {
				this.monthlyTax = monthlyTax;
			}

			public float getEpf() {
				return epf;
			}

			public void setEpf(float epf) {
				this.epf = epf;
			}

			public float getCompanyPf() {
				return companyPf;
			}

			public void setCompanyPf(float companyPf) {
				this.companyPf = companyPf;
			}

			public float getNetSalary() {
				return netSalary;
			}

			public void setNetSalary(float netSalary) {
				this.netSalary = netSalary;
			}

}

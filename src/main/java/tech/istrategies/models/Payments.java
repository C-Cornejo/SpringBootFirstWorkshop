package tech.istrategies.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payments")
public class Payments {

	@Id
	@Column(name="customerNumber")
	private Integer customerNumber;
	
	private String checkNumber;
	private java.util.Date paymentDue;
	private Double amount;
	
	
	public Payments() {}


	public Integer getCustomerNumber() {
		return customerNumber;
	}


	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}


	public String getCheckNumber() {
		return checkNumber;
	}


	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}


	public java.util.Date getPaymentDue() {
		return paymentDue;
	}


	public void setPaymentDue(java.util.Date paymentDue) {
		this.paymentDue = paymentDue;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
}

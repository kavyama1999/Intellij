package com.xworkz.formvalidation.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;

public class TvRechargeDTO {

    @NotNull(message = "CustomerName cannot be null")
    @Size(min=3,max=20,message = "CustomerName should contain only alphabetic characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "CustomerName should contain only alphabetic characters")
    private String customerName;

    @Size(message = "Id should contain Exact 8 numbers")
    @Pattern(regexp = "\\d{8}", message = "custId  must be 8 digits")
    private String customer;

    @NotEmpty(message = "please select vendor")
    private String vendor;

    @NotNull(message = "Recharge amount is required")
    @Min(value = 10, message = "Recharge amount must be at least 10")
    @Max(value = 10000, message = "Recharge amount must be at most 10000")
    private  Integer recharge;

    @NotEmpty(message = "Please select RechargeType")
    private String rechargetype;

    @NotEmpty(message = "please accept")
    private  String accept;


    public TvRechargeDTO()
    {
        System.out.println("No parameters In TvRechargeDTO");
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Integer getRecharge() {
        return recharge;
    }

    public void setRecharge(Integer recharge) {
        this.recharge = recharge;
    }

    public String getRechargetype() {
        return rechargetype;
    }

    public void setRechargetype(String rechargetype) {
        this.rechargetype = rechargetype;
    }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    @Override
    public String toString() {
        return "TvRechargeDTO{" +
                "CustomerName='"+customerName+'\''+
                "customer='" + customer + '\'' +
                ", vendor='" + vendor + '\'' +
                ", recharge='" + recharge + '\'' +
                ", rechargetype='" + rechargetype + '\'' +
                ", accept='" + accept + '\'' +
                '}';
    }
}

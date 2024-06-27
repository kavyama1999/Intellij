package com.xworkz.formvalidation.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;

public class ComputerPartsDTO {

@NotEmpty(message = "Select Brand Name")
private  String brandName;


    @NotEmpty(message = "please enter Model Name")
    private String model;

    @NotEmpty(message = "please select color")
    private String color;

    @NotEmpty(message = "please select type")
    private String type;

    @NotEmpty(message = "please select RAM")
    private String ram;

    @NotEmpty(message = "please select HardDisk")
    private String hardDisk;

    @NotEmpty(message = "please select Processor")
    private String processor;

@NotEmpty(message = "please select CacheSize")
    private String cacheSize;

    @NotNull(message = "Cost is required")
    @Min(value = 10, message = "Recharge amount must be at least 10")
    @Max(value = 10000, message = "Recharge amount must be at most 10000")
    private Integer cost;


    public ComputerPartsDTO()
    {
        System.out.println("ComputerPartsDTO..........");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(String cacheSize) {
        this.cacheSize = cacheSize;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ComputerPartsDTO{" +
                "brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", ram='" + ram + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", processor='" + processor + '\'' +
                ", cacheSize='" + cacheSize + '\'' +
                ", cost=" + cost +
                '}';
    }
}

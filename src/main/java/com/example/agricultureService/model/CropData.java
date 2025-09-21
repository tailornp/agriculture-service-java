package com.example.agricultureService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CropData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String state;
    private String district;
    private String crop;
    private String cropYear;
    private String season;
    private Double area;
    private String area_units;
    private Double production;
    private String production_units;
    private Double  yeild;

    public Long getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }

    public String getCrop() {
        return crop;
    }

    public String getYear() {
        return cropYear;
    }

    public String getSeason() {
        return season;
    }

    public Double getArea() {
        return area;
    }

    public String getArea_units() {
        return area_units;
    }

    public Double getProduction() {
        return production;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setYeild(Double yeild) {
        this.yeild = yeild;
    }

    public void setProduction_units(String production_units) {
        this.production_units = production_units;
    }

    public void setProduction(Double production) {
        this.production = production;
    }

    public void setArea_units(String area_units) {
        this.area_units = area_units;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setYear(String year) {
        this.cropYear = year;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProduction_units() {
        return production_units;
    }

    public Double getYeild() {
        return yeild;
    }
}

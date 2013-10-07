package com.talios.frege;

public class MutableWidget {
  private String description;
  private Double salePrice;
  public MutableWidget(String description, Double salePrice) {
    this.description = description;
    this.salePrice = salePrice;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Double getSalePrice() {
    return salePrice;
  }
  public void setSalePrice(Double salePrice) {
    this.salePrice = salePrice;
  }
}

package com.talios.frege;

public class Widget {
  private String description;
  private Double salePrice;
  public Widget(String description, Double salePrice) {
    this.description = description;
    this.salePrice = salePrice;
  }
  public String getDescription() {
    return description;
  }
  public Double getSalePrice() {
    return salePrice;
  }
}

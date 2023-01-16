package com.assignment.evamp.user.client.dto;

import com.assignment.evamp.user.client.response.ProductResponse;

public class PurchaseDTO {

    private ProductResponse product;
    private String message;

    public ProductResponse getProduct() {
        return product;
    }

    public void setProduct(ProductResponse product) {
        this.product = product;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

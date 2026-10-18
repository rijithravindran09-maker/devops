package com.example.productapi;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

/** The JSON body for creating a product. Invalid input is rejected with 400. */
public record ProductRequest(
        @NotBlank @Size(max = 64) String sku,
        @NotBlank @Size(max = 200) String name,
        @NotNull @DecimalMin("0.00") BigDecimal price,
        @Min(0) int stock) {
}

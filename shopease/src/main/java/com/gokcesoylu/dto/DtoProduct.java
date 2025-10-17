package com.gokcesoylu.dto;

import java.util.List;

import com.gokcesoylu.model.Category;
import com.gokcesoylu.model.OrderItem;
import com.gokcesoylu.model.Review;
import com.gokcesoylu.model.Stock;
import com.gokcesoylu.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoProduct {
    private Long id;
    private String description;
    private Double price;
    private User seller;
    private Category category;
    private Stock stock;
    private List<Review> reviews;
    private List<OrderItem> orderItems;
}

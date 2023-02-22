package com.nada.project.mongodemo.category;

import com.nada.project.mongodemo.product.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@AllArgsConstructor
@Builder
@Document
public class Category {
    @Id
    private String id;
    private String name;

    private String description;
    @DBRef
    private List<Product> products;
}

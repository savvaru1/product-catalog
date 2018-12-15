package com.nisum.productcatalog.controller;

import com.nisum.productcatalog.data.Product;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    ResponseEntity<List<Product>>  getProducts(){
        List<Product> list = new ArrayList<>();
        list.add(new Product(UUID.randomUUID(),"T-Shirt"));
        list.add(new Product(UUID.randomUUID(),"Polo-Shirt"));
        return new ResponseEntity(list,HttpStatus.OK);
    }

}

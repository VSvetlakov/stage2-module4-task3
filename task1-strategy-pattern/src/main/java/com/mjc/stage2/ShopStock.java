package com.mjc.stage2;

import java.util.List;
import java.util.stream.Collectors;

public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public List executeFilteringStrategy(FilteringStrategy filteringStrategy){
        return productList.stream().filter(product -> filteringStrategy.filter(product)).collect(Collectors.toList());
    }

}

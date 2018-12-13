package com.alisnoba.alisnoba;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {

    private List<LineItem> items = new ArrayList<>();
    //private LineItem item = new LineItem();

    public List<LineItem> getProducts(){
        return items;
    }

    public List<String> getQuantity(LineItem item){
        List<String> prodQuantity = new ArrayList<>();
        return items.stream()
                .filter(i -> item.equals(i))
                .map((i) -> String.format("%s - %s", item.getProduct().getName(), item.getQuantity())).collect(Collectors.toList());
    }


    public LineItem addQuantity(Product product) {
        LineItem prod = items.stream()
                .filter(p -> product.equals(p)).findFirst().get();
        prod.setQuantity(prod.getQuantity()+1);
        return prod;
    }

    public LineItem removeQuantity(Product product) {
        LineItem prod = items.stream()
                .filter(p -> product.equals(p)).findFirst().get();
        if(prod.getQuantity() == 0){

        }
        else{
            prod.setQuantity(prod.getQuantity()-1);
        }

        return prod;
    }


}

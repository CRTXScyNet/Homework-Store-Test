package com.example.storetest.dto;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Scope(scopeName = "prototype")
public class Basket {
    private final Map<Integer, Integer> itemsInBasket = new HashMap<>();

    public Basket() {
    }

    public void add(List<String> id) {
        for (String s :
                id) {
            if (StringUtils.isNumeric(s)) {
                int i = Integer.parseInt(s);
                if (itemsInBasket.containsKey(i)) {
                    itemsInBasket.put(i, itemsInBasket.get(i) + 1);
                } else {
                    itemsInBasket.put(i, 1);
                }
            }
        }
    }

    public Map<Integer, Integer> getItems() {
        return itemsInBasket;
    }

}

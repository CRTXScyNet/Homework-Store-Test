package com.example.storetest.dto;

import com.example.storetest.castomExeptions.InvalidIdValueException;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Scope(scopeName = "prototype")
public class Basket {
    private final Map<Integer, Integer> itemsInBasket = new HashMap<>();

    public Basket() {
    }

    public void add(List<Integer> id) {
        for (Integer i : id) {
            try {
                if (i == null) {
                    throw new InvalidIdValueException();
                }
                if (itemsInBasket.containsKey(i)) {
                    itemsInBasket.put(i, itemsInBasket.get(i) + 1);
                } else {
                    itemsInBasket.put(i, 1);
                }
            } catch (InvalidIdValueException e) {
                System.out.println("Id is incorrect");
            }
        }
    }

    public Map<Integer, Integer> getItems() {
        return itemsInBasket;
    }

}

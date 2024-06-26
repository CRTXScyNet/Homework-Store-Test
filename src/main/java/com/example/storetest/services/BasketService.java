package com.example.storetest.services;

import java.util.List;
import java.util.Map;

public interface BasketService {
    public void add(List<Integer> id);

    public Map<Integer, Integer> get();

    public void init();
}

package com.example.storetest.services;

import com.example.storetest.dto.Basket;
import jakarta.annotation.PostConstruct;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private Basket basket;

    @Override
    public void add(List<String> id) {
        System.out.println(id);
        basket.add(id);
    }

    @Override
    public Map<Integer, Integer> get() {
        return basket.getItems();
    }

    @Override
    @PostConstruct
    public void init() {
        basket = new Basket();
    }
}

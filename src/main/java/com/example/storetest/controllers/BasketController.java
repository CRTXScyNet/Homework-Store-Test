package com.example.storetest.controllers;

import com.example.storetest.services.BasketServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/order")
public class BasketController {
    private final BasketServiceImpl basketService;

    public BasketController(BasketServiceImpl basketService) {
        this.basketService = basketService;
    }

    @RequestMapping(path = "/add")
    public void add(@RequestParam("id") List<String> id) {
        basketService.add(id);
    }

    @RequestMapping(path = "/get")
    public Map<Integer, Integer> get() {
        return basketService.get();
    }
}

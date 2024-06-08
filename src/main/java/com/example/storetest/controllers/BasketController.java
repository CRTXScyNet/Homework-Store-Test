package com.example.storetest.controllers;

import com.example.storetest.services.BasketServiceImpl;
import jakarta.validation.Valid;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
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
    public void add(@RequestParam("id") List<Integer> id) {
        basketService.add(id);
    }

    @RequestMapping(path = "/get")
    public Map<Integer, Integer> get() {
        return basketService.get();
    }
}

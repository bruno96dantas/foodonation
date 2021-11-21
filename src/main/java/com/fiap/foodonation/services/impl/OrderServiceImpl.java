package com.fiap.foodonation.services.impl;

import com.fiap.foodonation.models.Order;
import com.fiap.foodonation.repositories.OrderRepository;
import com.fiap.foodonation.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements BaseService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List getAll() {
        ArrayList<Order> result = new ArrayList<Order>(orderRepository.findAll());
        return result;
    }

    @Override
    public Object get(Long id) {
        return null;
    }

    @Override
    public void create(Object o) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Object o) {

    }
}

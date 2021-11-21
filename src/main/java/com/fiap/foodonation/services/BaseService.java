package com.fiap.foodonation.services;

import java.util.List;

public interface BaseService <MODEL, DTO> {
    List<MODEL> getAll();
    MODEL get(Long id);
    void create(DTO dto);
    void delete(Long id);
    void update(DTO dto);
}

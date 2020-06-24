package es.leroymerlin.oms.stock.api.service;

import es.leroymerlin.oms.stock.api.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<User> findAll();
    User findById(UUID uuid);
    List<User> findAllByName(String name);
}

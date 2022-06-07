package com.defitech.tpVente.service;

import com.defitech.tpVente.modele.User;


public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

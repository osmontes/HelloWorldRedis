package es.leroymerlin.oms.stock.api.service;

import es.leroymerlin.oms.stock.api.model.User;
import es.leroymerlin.oms.stock.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findById(UUID uuid) {
        Optional<User> userOptional = userRepository.findById(uuid);
        User user = null;
        if(userOptional.isPresent())
            user = userOptional.get();
        return user;
    }

    @Override
    public List<User> findAllByName(String name) {
        return userRepository.findAllByName(name);
    }
}

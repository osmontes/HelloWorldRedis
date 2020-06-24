package es.leroymerlin.oms.stock.api.controller;

import es.leroymerlin.oms.stock.api.model.Hello;
import es.leroymerlin.oms.stock.api.model.User;
import es.leroymerlin.oms.stock.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "user/all", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public List<User> getAllUsers() {
        log.info("Get All Users");
        return userService.findAll();
    }

    @RequestMapping(value = "/user/name/{name}", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public List<User> getUserByName(@PathVariable("name") String name){
        return userService.findAllByName(name);
    }

    @RequestMapping(value = "/user/create/{name}", method = RequestMethod.POST, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public User createUserByName(@PathVariable("name") String name){
        return userService.save(name);
    }
}

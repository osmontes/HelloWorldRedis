package es.leroymerlin.oms.stock.api.controller;

import es.leroymerlin.oms.stock.api.model.Hello;
import es.leroymerlin.oms.stock.api.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "Hello", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public Hello sayHello() {
        log.info("Say Hello");
        return helloService.sayHello();
    }
}

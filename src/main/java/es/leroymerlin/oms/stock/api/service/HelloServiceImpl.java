package es.leroymerlin.oms.stock.api.service;

import es.leroymerlin.oms.stock.api.model.Hello;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public Hello sayHello() {
        Hello hello = new Hello();
        hello.setDate(new Date());
        hello.setMessage("Hello World");
        return hello;
    }
}

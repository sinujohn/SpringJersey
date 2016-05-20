package me.sinu.api.resource;

import me.sinu.api.payload.IdPayload;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet() {
        return "Hello World!";
    }

    @Override
    public IdPayload greetWithId() {
        return new IdPayload("HelloId");
    }

}

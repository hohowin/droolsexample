package com.example.drools;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaOfferController {
    @Autowired
    private KieSession session;

    @PostMapping("/v1/order")
    public Order orderNow(@RequestBody Order order) {
        session.insert(order);
        session.fireAllRules();
        return order;
    }

}


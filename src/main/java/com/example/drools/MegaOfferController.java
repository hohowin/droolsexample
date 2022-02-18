package com.example.drools;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaOfferController {

    private final KieContainer kieContainer;

    public MegaOfferController(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @PostMapping("/v1/order")
    public Order orderNow(@RequestBody Order order) {
        KieSession session = kieContainer.newKieSession();
        session.insert(order);
        session.fireAllRules();
        session.dispose();
        return order;
    }
}


package com.scarry.plan.web;

import com.scarry.plan.MongoRepository.PlanRepository;
import com.scarry.plan.domain.Plans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlanController {

    @Autowired
    PlanRepository planRepository;


    @GetMapping(value = "/getAllPlan")
    public List<Plans> getPlans()
    {
        return planRepository.findAll();
    }

    @GetMapping(value = "/getstring")
    public String getSuccessString(){
        return "Success";
    }

}

package com.scarry.plan.MongoRepository;

import com.scarry.plan.domain.Plans;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;



public interface PlanRepository extends MongoRepository<Plans, String> {

}

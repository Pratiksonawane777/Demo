package com.sunnytech.in.mongorepository;

import com.sunnytech.in.vo.HomeMadeUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface HomeMadeMongoRepository extends MongoRepository<HomeMadeUser, String> {

}

package com.sunnytech.in.mongorepository;

import com.sunnytech.in.vo.HomeMadeUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HomeMadeMongoRepository extends MongoRepository<HomeMadeUser, String> {

    List<HomeMadeUser> findByPinCode(String pincode);

}

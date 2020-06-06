package com.sunnytech.in.mongorepository;

import com.sunnytech.in.vo.WorkTheyCanDO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkTheyCanDoMongoRepository extends MongoRepository<WorkTheyCanDO , String> {

}

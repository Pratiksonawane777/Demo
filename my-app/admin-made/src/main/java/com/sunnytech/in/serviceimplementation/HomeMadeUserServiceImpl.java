package com.sunnytech.in.serviceimplementation;

import com.sunnytech.in.mongorepository.HomeMadeMongoRepository;
import com.sunnytech.in.mongorepository.WorkTheyCanDoMongoRepository;
import com.sunnytech.in.service.HomeMadeService;
import com.sunnytech.in.vo.HomeMadeUser;
import com.sunnytech.in.vo.WorkTheyCanDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class HomeMadeUserServiceImpl implements HomeMadeService {

    @Autowired
    HomeMadeMongoRepository homeMadeMongoRepository;

    @Autowired
    WorkTheyCanDoMongoRepository workTheyCanDoMongoRepository;

    @Override
    public HomeMadeUser saveHomeMadeUser(HomeMadeUser homeMadeUser) {
        return  homeMadeMongoRepository.save(homeMadeUser);
    }

    @Override
    public List<HomeMadeUser> getAllHomeMadeUsers() {
        return homeMadeMongoRepository.findAll();
    }

    @Override
    public List<HomeMadeUser> getUsersByPinCode(String pinCode) {
        return homeMadeMongoRepository.findByPinCode(pinCode);
    }

    @Override
    public WorkTheyCanDO saveWorkTheyCanDo(WorkTheyCanDO workTheyCanDO) {
        WorkTheyCanDO workTheyCanDO1= workTheyCanDoMongoRepository.save(workTheyCanDO);

        HomeMadeUser homeMadeUsers = null;

        Optional<HomeMadeUser> homeMadeUser = homeMadeMongoRepository.findById(workTheyCanDO.getUserId());
        if(homeMadeUser.isPresent())
        {
            homeMadeUsers = homeMadeUser.get();
            homeMadeUsers.setWorkTheyCanDO(workTheyCanDO1);
            homeMadeMongoRepository.save(homeMadeUsers);

        }
        return workTheyCanDO1;

    }


}

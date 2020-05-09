package com.sunnytech.in.serviceimplementation;

import com.sunnytech.in.mongorepository.HomeMadeMongoRepository;
import com.sunnytech.in.service.HomeMadeService;
import com.sunnytech.in.vo.HomeMadeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HomeMadeUserServiceImpl implements HomeMadeService {

    @Autowired
    HomeMadeMongoRepository homeMadeMongoRepository;

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


}

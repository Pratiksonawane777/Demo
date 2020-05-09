package com.sunnytech.in.service;

import com.sunnytech.in.vo.HomeMadeUser;

import java.util.List;

public interface HomeMadeService {

    HomeMadeUser saveHomeMadeUser(HomeMadeUser homeMadeUser);

    List<HomeMadeUser> getAllHomeMadeUsers();

    List<HomeMadeUser> getUsersByPinCode(String pinCode);
}

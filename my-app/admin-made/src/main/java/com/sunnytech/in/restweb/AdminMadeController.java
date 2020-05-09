package com.sunnytech.in.restweb;

import com.sunnytech.in.service.HomeMadeService;
import com.sunnytech.in.vo.HomeMadeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminMadeController {

    @Autowired
    HomeMadeService homeMadeService;


    @GetMapping("/enter/homeMade")
    public String entryHomeMade()
    {
        System.out.println("Printed /enter/homeMade");
        return "Sunny";
    }

    @PostMapping("/homemade/add")
    public HomeMadeUser saveHomeMadeUser(@RequestBody HomeMadeUser homeMadeUser) {
        return homeMadeService.saveHomeMadeUser(homeMadeUser);

    }

    @GetMapping("/homemade/getAll/users")
    public List<HomeMadeUser> getAllHomeMadeUsers() {
        return homeMadeService.getAllHomeMadeUsers();
    }

    @GetMapping("/homemade/getByPinCode")
    public List<HomeMadeUser> getHomeeMadeUserByPincode(@RequestParam String pincode) {
        return homeMadeService.getUsersByPinCode(pincode);
    }


}

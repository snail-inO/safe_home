package com.cusehack.safe_home.controller.user;

import com.cusehack.safe_home.constant.ErrorEnum;
import com.cusehack.safe_home.dao.mapper.HonestyMapper;
import com.cusehack.safe_home.dao.mapper.UserMapper;
import com.cusehack.safe_home.service.RegisterServiceImpl;
import com.cusehack.safe_home.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    HonestyMapper honestyMapper;

    @PostMapping("/register")
    public Json register(@RequestParam String userName, @RequestParam String password) {
        RegisterServiceImpl registerService = new RegisterServiceImpl(userMapper, honestyMapper);
        long uid = registerService.userRegister(userName, password);
        if (uid >= 0)
            return new Json(uid);
        return new Json(ErrorEnum.BAD_REQUEST);
    }

}

package com.cusehack.safe_home.controller.user;

import com.cusehack.safe_home.dao.constant.ErrorEnum;
import com.cusehack.safe_home.dao.mapper.UserMapper;
import com.cusehack.safe_home.service.LoginServiceImpl;
import com.cusehack.safe_home.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    public Json login(@RequestParam String userName, @RequestParam String password) {
        LoginServiceImpl loginService = new LoginServiceImpl(userMapper);
        long uid = loginService.userLogin(userName, password);
        if (uid >= 0)
            return new Json(uid);

        return new Json(ErrorEnum.BAD_REQUEST);
    }
}

package com.moka.magiccar.api.controller;

import com.moka.magiccar.api.service.UserService;
import com.moka.magiccar.result.Result;
import com.moka.magiccar.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户Controller
 *
 * @author by kunlun
 * @version <0.1>
 * @created on 2018/5/12.
 */
@RestController
@RequestMapping("user")
public class UserController {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 登录
     *
     * @param phone
     * @param verifyCode
     * @return
     */
    @GetMapping("/doLogin")
    public Result<String> doLogin(String phone, String verifyCode) {

        return Result.success();
    }

    /**
     * 注册
     *
     * @return
     */
    @PostMapping("/registry")
    public Result registry(@RequestBody User user) {
        userService.registry(user);
        return Result.success();
    }


}

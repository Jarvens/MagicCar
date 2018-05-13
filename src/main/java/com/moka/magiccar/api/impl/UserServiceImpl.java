package com.moka.magiccar.api.impl;

import com.moka.magiccar.api.service.UserService;
import com.moka.magiccar.result.Result;
import com.moka.magiccar.vo.User;
import org.springframework.stereotype.Service;

/**
 * @author by kunlun
 * @version <0.1>
 * @created on 2018/5/12.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public Result<String> doLogin(String phone, String verifyCode) {
        return null;
    }


    @Override
    public Result<String> registry(User user) {
        return null;
    }


}

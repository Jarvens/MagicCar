package com.moka.magiccar.api.service;

import com.moka.magiccar.result.Result;
import com.moka.magiccar.vo.User;

/**
 * @author by kunlun
 * @version <0.1>
 * @created on 2018/5/12.
 */
public interface UserService {

    /**
     * 用户登录
     *
     * @param phone
     * @param verifyCode
     * @return
     */
    Result<String> doLogin(String phone, String verifyCode);

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    Result<String> registry(User user);


}

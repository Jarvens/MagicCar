package com.moka.magiccar.result;

import java.io.Serializable;

/**
 * @author by kunlun
 * @version <0.1>
 * @created on 2018/5/12.
 */
public class CodeMsg implements Serializable {

    private static final long serialVersionUID = -2989487276735303015L;


    private int code;

    private String message;

    public static CodeMsg SUCCESS = new CodeMsg(0, "success");

    public static CodeMsg SERVER_EXCEPTION = new CodeMsg(100001, "服务异常");

    public static CodeMsg PARAMETER_ISNULL = new CodeMsg(100002, "参数为空");

    public static CodeMsg NOT_FOUND = new CodeMsg(100003, "暂无数据");


    public CodeMsg(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

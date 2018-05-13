package com.moka.magiccar.result;

import java.io.Serializable;

/**
 * @author by kunlun
 * @version <0.1>
 * @created on 2018/5/12.
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -6128167739698370575L;

    private String message;

    private int retCode;

    private T data;

    public Result(T data) {
        this.retCode = 0;
        this.message = "success";
        this.data = data;
    }

    public Result(CodeMsg codeMsg) {
        if (codeMsg == null) {
            return;
        }
        this.retCode = codeMsg.getCode();
        this.message = codeMsg.getMessage();
    }

    /**
     * success
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(data);
    }

    @SuppressWarnings("unchecked")
    public static <T> Result<T> success() {
        return (Result<T>) success("");
    }

    /**
     * fail
     *
     * @param codeMsg
     * @param <T>
     * @return
     */
    public static <T> Result<T> error(CodeMsg codeMsg) {
        return new Result<>(codeMsg);
    }

    /**
     * fail  extend
     *
     * @param codeMsg
     * @param message
     * @param <T>
     * @return
     */
    public static <T> Result<T> error(CodeMsg codeMsg, String message) {
        codeMsg.setMessage(codeMsg.getMessage() + "---" + message);
        return new Result<T>(codeMsg);
    }

    public String getMessage() {
        return message;
    }

    public int getRetCode() {
        return retCode;
    }

    public T getData() {
        return data;
    }
}

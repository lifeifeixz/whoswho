package com.character.model.vo;

import com.character.model.enums.ResultType;

/**
 * @author flysLi
 */
public class Result<T> {

    private ResultType status = null;
    private String code = null;
    private T content;

    public Result(){}

    public Result(ResultType status, String code){
        this.status = status;
        this.code = code;
    }

    public Result(ResultType status, String code, T content){
        this.status = status;
        this.code = code;
        this.content = content;
    }

    public ResultType getStatus() {
        return status;
    }

    public void setStatus(ResultType status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

}

package com.adGenAIpha.utils;

import lombok.Data;

@Data
public class R<T> {
    private String code;
    private String message;
    private T data;
    R(){

    }
    R(String code,String message){
        this.code = code;
        this.message = message;
    }

    R(String code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public static <T> R<T> build(String code, String message, T data){
        return new R<T>(code,message,data);
    }
    public static <T> R<T> failure(String message){
        return new R<T>("300",message);
    }
    public static <T> R<T> success(String message,T data){
        return new R<T>("200",message,data);
    }


    @Override
    public String toString() {
        return "R{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}

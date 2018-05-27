package org.User.utils;

public class ResultUtil {
    public static Result success(){
        return  new Result().setMsg("成功").setCode(0);
    }

    @SuppressWarnings("unchecked")
    public static Result success(Object o){
        return new Result().setMsg("成功").setCode(0).setData(o);
    }

    public static Result error(int errorCode,String msg){
        return new Result().setMsg(msg).setCode(errorCode);
    }


}
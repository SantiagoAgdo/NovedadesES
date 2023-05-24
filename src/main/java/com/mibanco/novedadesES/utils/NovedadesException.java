package com.mibanco.novedadesES.utils;

public class NovedadesException extends  RuntimeException{
    public static final long serialVersionUID =1L;

    public NovedadesException(){
        super();
    }

    public NovedadesException(String msm){
        super(msm);
    }

    public NovedadesException(String msm, Exception exception){
        super(msm, exception);
    }


}

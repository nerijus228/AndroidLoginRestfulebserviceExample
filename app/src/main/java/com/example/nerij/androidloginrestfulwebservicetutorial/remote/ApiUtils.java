package com.example.nerij.androidloginrestfulwebservicetutorial.remote;

import retrofit2.Retrofit;

public class ApiUtils {
    public  static  final String BASE_URL = "http://192.168.20.110/demo/";
    public  static  UserService getUserService(){
        return RettrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}

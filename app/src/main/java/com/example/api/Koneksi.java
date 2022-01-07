package com.example.api;

public class Koneksi {
    public static final String BASE_URL_API = "http://192.168.137.1/myWeb/public/api/";

    public static BaseApiService getAPIService() {
        return RetrofitClient.getClient(BASE_URL_API)
                .create(BaseApiService.class);
    }
}

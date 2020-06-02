package com.example.startandroidretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MessagesApi {
    @GET("messages1.json")
    Call<List<Message>> messeges();
    //@GET("getProducts")
    //List<Product> getProductList();
}

package com.qodeigence.prakash.ecommerce_server_app.Remote;

import com.qodeigence.prakash.ecommerce_server_app.Model.MyResponse;
import com.qodeigence.prakash.ecommerce_server_app.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAFUs3sj4:APA91bEVQhoZFBxGkCfoM2uVbxxNkW02IkaEyLve5JV1z_-9fb2tPcocEy164wWwTfOsDZ5EIrv-HVyYpy04nvaSwiBNxChJxMKrP0WCH8u93tElH-C47Mp-nRfqL2A3SijxSO849_pZ"
    })
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

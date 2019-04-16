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
            "Authorization:key=AAAAQmaNX0s:APA91bG8LGpPfmSBLaVhQIwYowj3WnvCQoXDxY0hCE0FXF-even6rmyKxX4ntYE_jjNspJaB6EqNO1Mo_BuYB3Ef2wvVLg1TReuIwFUJb8RAdMQ_u8NgYC-9torJyPZswiK_tUbM1kvsnRhHcRQTnClp8sQHMZ5lCg"
    })
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

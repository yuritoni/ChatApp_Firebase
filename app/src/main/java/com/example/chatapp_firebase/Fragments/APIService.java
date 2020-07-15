package com.example.chatapp_firebase.Fragments;

import com.example.chatapp_firebase.Notifications.MyResponse;
import com.example.chatapp_firebase.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface  APIService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAA4Van-Sg:APA91bGZyXwVfsPtvQ-ZF5xpm4ObdL7aKmbvonoyno6v_84og_Nf3hTWXtT0O03Seml6EV8SbcU62Y8aEVE9qGI3caO97ee9OGZkdMCC9YvJ9KfL4qxt3-5s-siiaAXYR9pNDwZCtQWm"

    })
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

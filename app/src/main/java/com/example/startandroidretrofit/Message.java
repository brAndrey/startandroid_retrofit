package com.example.startandroidretrofit;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message {
    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("time")
    @Expose
    public Long time;
    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("image")
    @Expose
    public String image;

    public Message withId(Long id) {
        this.id = id;
        return this;
    }

    public Message withTime(Long time) {
        this.time = time;
        return this;
    }

    public Message withText(String text) {
        this.text = text;
        return this;
    }

    public Message withImage(String image) {
        this.image = image;
        return this;
    }

}



package com.example.todoapp.data.remote

import com.google.gson.annotations.SerializedName

data class TodoDto(
    @SerializedName("userId") val id: Int,
    @SerializedName("user_id") val userId: Int,
    @SerializedName("title") val title: String,
    @SerializedName("completed") val completed: Boolean
) {

}
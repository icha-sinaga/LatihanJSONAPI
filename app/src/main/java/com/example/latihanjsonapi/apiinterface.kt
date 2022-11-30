package com.example.latihanjsonapi

import retrofit2.Call
import retrofit2.http.Path

interface apiinterface {
    fun getData(): Call<List<MyDataItem>>

    fun getDataOne(@Path("id") id: Int): Call<List<MyDataItem>>
}
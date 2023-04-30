package com.ratnaglobaltech.exoplayerdemo.api

import com.ratnaglobaltech.exoplayerdemo.dto.MyDataClass
import com.ratnaglobaltech.exoplayerdemo.dto.MyDataClassItem
import retrofit2.http.GET

interface ApiService {
    @GET("9822b585-5d56-439a-ab1f-75c365039ac0")
    suspend fun getPosts(): List<MyDataClassItem>
}

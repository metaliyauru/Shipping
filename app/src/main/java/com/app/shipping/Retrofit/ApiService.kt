package com.example.festival.Retrofit

import com.example.festival.*
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

var BASE_URL = "https://festivalpost.in/apiv5/"

interface ApiInterface {


    @FormUrlEncoded
    @POST("login.php")
    fun login(
        @Field("mobile") mobile: String,
        @Field("device_id") device_id: String,
        @Field("device") device: String,
        @Field("device_token") device_token: String
    ): Call<login>


    @GET("getHomePage.php")
    fun getHomePageData(
        @Query("token") token: String,
    ): Call<slider>


    @GET("getHomePage.php")
    fun getNewFestival(
        @Query("token") token: String,
    ): Call<festival>


    @GET("getHomePage.php")
    fun getGeneralcategories(
        @Query("token") token: String,
    ): Call<cateogry>

    @FormUrlEncoded
    @POST("getAllFestivalImages.php")
    fun getnewfestcatImages(
        @Field("postcategoryid") postcategoryid: String,
        @Field("languageid") languageid: String,
        @Field("subcategory_id") subcategory_id: String,
    ): Call<new_post_details_image>


    @FormUrlEncoded
    @POST("getHomeVideo.php")
    fun getVideoPageData(
        @Field("token") token: String
    ): Call<VideoPage>


    @FormUrlEncoded
    @POST("getHomeGreetings.php")
    fun getCustomCategory(
        @Field("token") token: String
    ): Call<CustomCategoryResponse>


    @FormUrlEncoded
    @POST("getAllVideoPost.php")
    fun getVideoLanguageData(
        @Field("videoid") videoid: String,
        @Field("subcategory_id") subcategoryId: String,
        @Field("languageid") languageid: String,
        @Field("token") token: String
    ): Call<VideoLanguageItemResponse>


    @FormUrlEncoded
    @POST("getAllGreetings.php")
    fun getLanguageCustomeCategoryPost(
        @Field("catid") catid: String,
        @Field("token") token: String,
        @Field("languageid") languageid: String = "0"
    ): Call<CustomCategoryPostResponse>


    @FormUrlEncoded
    @POST("getSticker.php")
    fun getSticker(
        @Field("token") token:String
    ):Call<StickerListResponse>


}
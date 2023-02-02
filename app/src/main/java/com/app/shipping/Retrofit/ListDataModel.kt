package com.example.festival

import java.io.Serializable

data class UserDataItem(

    val id: Int? = 0,
    val user_credit: Int? = 0,
    val default_business_id: Int? = 0,
    val name: String? = null,
    val ref_users: String? = null,
    val email: String? = null,
    val mobile: String? = null,
    val email_verified_at: String? = null,
    val status: Int? = 0,
    val created_at: String? = null,
    val updated_at: String? = null,
    val ref_code: String? = null,
    val device_id: String? = null,
    val device: String? = null,
    val device_token: String? = null,

    )

data class Sliderlist(

    var id: String? = null,
    var adv_type: String? = null,
    var adv_sequence: String? = null,
    var adv_image: String? = null,
    var adv_number: String? = null,
    var adv_link: String? = null,
    var adv_whatsapp_number: String? = null,
    var adv_category_id: String? = null,
    var category_fest_id: String? = null,
    var category_fest_name: String? = null,
    var category_fest_date: String? = null,

    )

data class newfestivallist(

    var fest_id: String? = null,
    var fest_name: String? = null,
    var fest_image: String? = null,
    var fest_type: String? = null,
    var fest_date: String? = null,
    var fest_day: String? = null

)

data class generalCategoriesList(

    var fest_id: String? = null,
    var fest_name: String? = null,
    var fest_image: String? = null,
    var fest_type: String? = null,
    var fest_date: String? = null,
    var fest_day: String? = null

)

data class CategoryItem(

    val post_id: Int? = 0,
    val post_category_id: Int? = 0,
    val post_is_deleted: Int? = 0,
    val post_content: String? = null,
    val fest_image: String? = null,
    var is_selected: Boolean? = false,
    var image_type: Int? = null,
    var language_id: String? = null,
    var subcategory_id: String? = null,

    )

data class SubCategoryResponse(
    val id: String? = null,
    val name: String? = null,
    var is_selected: Boolean? = false,
    var image_type: Int? = null,
    var language_id: Int? = null,
)

data class LanguageResponse(
    val id: String? = null,
    val name: String? = null,
    var is_selected: Boolean? = false,
    var image_type: Int? = null,
    var language_id: Int? = null,
)

data class VideoPageItem(

    val id: String? = null,
    val video_name: String? = null,
    val video_date: String? = null,
    val video_image: String? = null

)

data class highlightsItem(

    val id: String? = null,
    val video_name: String? = null,
    val video_date: String? = null,
    val video_image: String? = null,
    val video_type: String? = null,
    val is_new: String? = null,
    val is_highlight: String? = null,
    val post: ArrayList<VideoPageItem> = ArrayList()

)

data class CustomCategoryItem(

    val custom_cateogry_id: String? = null,
    val name: String? = null,
    val custom_image: String? = null,

    )

data class VideoLanguageItem(
    val id: String? = null,
    val image: String? = null,
    val video: String? = null,
    val language_id: String? = null,
    val subcategory_id: String? = null,
    val type: String? = null,
    var isIs_selected: Boolean = false

)

data class bannerItem(

    val id: String? = null,
    val banner_image: String? = null,
    val image: String? = null,
    val language_id: String? = null,
    val position_x: String? = null,
    val position_y: String? = null,
    val img_position_x: String? = null,
    val img_position_y: String? = null,
    val img_height: String? = null,
    val img_width: String? = null,
    val type: String? = null,

    )

data class CustomCategoryPostItem(
    val id: String? = null,
    val banner_image: String? = null,
    val language_id: String? = null,
    val image: String? = null,
    val position_x: String? = null,
    val position_y: String? = null,
    val img_position_x: String? = null,
    val img_position_y: String? = null,
    val img_height: String? = null,
    val img_width: String? = null,
    val type: String? = null,
    var is_selected: Boolean? = false,
)

data class StickerListItem(

    val id: String? = null,
    val title: String? = null,
    val image: String? = null,
    val stickers: ArrayList<StickerListDataItem> = ArrayList(),
    var is_selected: Boolean? = false

)

data class StickerListDataItem(

    val id: String? = null,
    val image: String? = null,
    var is_selected: Boolean? = false,

)

data class FontCategoryList(
    val name: String? = null,
    var is_selected: Boolean? = false
)

data class FontList(
    val name: String? = null,
)

data class TutorialItem (
    var title : String = "",
    var videoLink : String = "",
)
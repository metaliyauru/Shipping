package com.example.festival

data class login(

    //data are in array
    //var data : ArrayList<UserDataItem> = ArrayList(),
    //data are not in array
    val data: UserDataItem,
    var token: String? = null,
    var status: Boolean? = false,
    var message: String? = null,

    )

data class slider(

    var slider: ArrayList<Sliderlist> = ArrayList(),
    var status: Boolean? = null,
    var message: String? = null,

    )

data class festival(

    var festival: ArrayList<newfestivallist> = ArrayList(),
    var status: Boolean? = null,
    var message: String? = null,

    )

data class cateogry(

    var cateogry: ArrayList<generalCategoriesList> = ArrayList(),
    var status: Boolean? = null,
    var message: String? = null,

    )

data class new_post_details_image(

    val data: ArrayList<CategoryItem> = ArrayList(),
    val status: Boolean? = false,
    val message: String? = null,
    val subcategory:  ArrayList<SubCategoryResponse> = ArrayList(),
    val language: ArrayList<LanguageResponse> = ArrayList(),

    )

data class VideoPage(

    val festival: ArrayList<VideoPageItem> = ArrayList(),
    val category: ArrayList<VideoPageItem>  = ArrayList(),
    val status: Boolean? = null,
    val message: String? = null,
    val highlights: ArrayList<highlightsItem>  = ArrayList(),

    )

data class CustomCategoryResponse(
    val data: ArrayList<CustomCategoryItem> = ArrayList(),
    val status: Boolean? = false,
    val message: String? = null
)

data class VideoLanguageItemResponse(
    val data: ArrayList<VideoLanguageItem>,
    val status: Boolean? = false,
    val message: String? = null,
    val subcategory :ArrayList<SubCategoryResponse> = ArrayList(),
    val language: ArrayList<LanguageResponse> = ArrayList(),
)

data class BannerItemResponse(
    val data: ArrayList<bannerItem>,
    val status: Boolean? = false,
    val message: String? = null,
    val language: ArrayList<LanguageResponse> = ArrayList(),
)

data class CustomCategoryPostResponse(
    val data: ArrayList<CustomCategoryPostItem>,
    val status: Boolean? = false,
    val message: String? = null,
    val language: ArrayList<LanguageResponse> = ArrayList()
)

data class StickerListResponse(

    val status : Boolean? = false,
    val message : String? = null,
    val records: ArrayList<StickerListItem>,
    var is_selected: Boolean? = false

)



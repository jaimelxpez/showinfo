package com.jaimelxpez.data.model

import com.google.gson.annotations.SerializedName

data class ShowModel(
    @SerializedName("id")
    val id: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("language")
    val language: String?,
    @SerializedName("genres")
    val genres: List<String?>?,
    @SerializedName("status")
    val status: String,
    @SerializedName("averageTime")
    val averageTime: Int?,
    @SerializedName("premiered")
    val premiered: String?,
    @SerializedName("ended")
    val ended: String?,
    @SerializedName("rating")
    val rating: RatingModel?,
    @SerializedName("image")
    val image: ImageModel?,
    @SerializedName("summary")
    val summary: String?
)

data class ImageModel(
    @SerializedName("medium")
    val medium: String?,
    @SerializedName("original")
    val original: String?
)

data class RatingModel(
    val average: Double?
)

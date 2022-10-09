package com.jaimelxpez.domain.model

data class Show(
    val id: String?,
    val url: String?,
    val name: String?,
    val language: String?,
    val genres: List<String?>?,
    val isEnded: Boolean,
    val averageTime: Int?,
    val premieredDate: String?,
    val endedDate: String?,
    val rating: Double?,
    val image: Image?,
    val summary: String?
)

data class Image(
    val medium: String?,
    val original: String?
)

package com.jaimelxpez.data.extensions

import com.jaimelxpez.data.model.ImageModel
import com.jaimelxpez.data.model.ShowModel
import com.jaimelxpez.domain.model.Image
import com.jaimelxpez.domain.model.Show

fun ShowModel.toDomain(): Show = Show(
    id = this.id,
    url = this.url,
    name = this.name,
    language = this.language,
    genres = this.genres,
    isEnded = this.status == "Ended",
    averageTime = this.averageTime,
    premiered = this.premiered,
    ended = this.ended,
    rating = this.rating,
    image = this.image?.toDomain(),
    summary = this.summary
)

fun ImageModel.toDomain(): Image = Image(
    medium = this.medium,
    original = this.original
)
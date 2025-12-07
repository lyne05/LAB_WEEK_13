package com.example.lab_week_13.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
@Entity(tableName = "movies")
data class Movie(

    @PrimaryKey
    val id: Int = 0,

    val adult: Boolean = false,

    // Room butuh default value, Moshi boleh nullable
    val backdrop_path: String? = "",

    @Json(name = "original_language")
    val originalLanguage: String? = "",

    @Json(name = "original_title")
    val originalTitle: String? = "",

    val overview: String? = "",

    val popularity: Float = 0f,

    @Json(name = "poster_path")
    val posterPath: String? = "",

    @Json(name = "release_date")
    val releaseDate: String? = "",

    val title: String? = "",

    val video: Boolean = false,

    @Json(name = "vote_average")
    val voteAverage: Float = 0f,

    @Json(name = "vote_count")
    val voteCount: Int = 0
)

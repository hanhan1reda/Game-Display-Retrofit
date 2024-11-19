package com.example.retrofit.data.model


import com.google.gson.annotations.SerializedName


data class Game (

    @SerializedName("id"                     ) var id                   : Int?    = null,
    @SerializedName("title"                  ) var title                : String? = null,
    @SerializedName("thumbnail"              ) var thumbnail            : String? = null,
    @SerializedName("short_description"      ) var shortDescription     : String? = null,
    @SerializedName("game_url"               ) var gameUrl              : String? = null,
    @SerializedName("genre"                  ) var genre                : String? = null,
    @SerializedName("platform"               ) var platform             : String? = null,
    @SerializedName("publisher"              ) var publisher            : String? = null,
    @SerializedName("developer"              ) var developer            : String? = null,
    @SerializedName("release_date"           ) var releaseDate          : String? = null,
    @SerializedName("freetogame_profile_url" ) var freetogameProfileUrl : String? = null

)
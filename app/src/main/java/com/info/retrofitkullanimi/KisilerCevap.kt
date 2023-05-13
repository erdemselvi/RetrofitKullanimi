package com.info.retrofitkullanimi

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class KisilerCevap(
    //@SerializedName("kisiler")
    @SerializedName("movies")
    @Expose
    var kisiler:List<Kisiler>,
   // @SerializedName("success")
    //@Expose
    var success:Int) {
}
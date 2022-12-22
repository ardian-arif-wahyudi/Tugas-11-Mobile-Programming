package com.ardian.tugas11mvvmarchitecture.data.model

import com.google.gson.annotations.SerializedName

data class ListResponse<T>(
    @SerializedName("results")
    val results: List<T>
)

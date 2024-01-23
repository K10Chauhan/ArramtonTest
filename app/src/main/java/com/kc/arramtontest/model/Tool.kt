package com.kc.arramtontest.model


import com.google.gson.annotations.SerializedName

data class Tool(
    @SerializedName("back_image")
    val backImage: String, // https://arramton-s3-bucket.s3.ap-south-1.amazonaws.com/key-enzy/website/1704275971.jpg
    @SerializedName("created_at")
    val createdAt: String, // 2024-01-03T09:59:42.000000Z
    @SerializedName("front_image")
    val frontImage: String?, // https://arramton-s3-bucket.s3.ap-south-1.amazonaws.com/key-enzy/website/1704276201.jpg
    @SerializedName("id")
    val id: Int, // 26
    @SerializedName("name")
    val name: String, // dfg
    @SerializedName("serial_no")
    val serialNo: String, // cvgh
    @SerializedName("updated_at")
    val updatedAt: String, // 2024-01-03T09:59:42.000000Z
    @SerializedName("user_id")
    val userId: Int // 1
)
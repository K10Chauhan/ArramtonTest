package com.kc.arramtontest.model


import com.google.gson.annotations.SerializedName

data class Borrower(
    @SerializedName("created_at")
    val createdAt: String, // 2024-01-06T07:22:41.000000Z
    @SerializedName("id")
    val id: Int, // 14
    @SerializedName("is_verified")
    val isVerified: Int, // 1
    @SerializedName("mobile_no")
    val mobileNo: Long, // 8104668815
    @SerializedName("name")
    val name: String, // aman
    @SerializedName("otp")
    val otp: Int, // 6656
    @SerializedName("otp_time")
    val otpTime: String, // 2024-01-06 13:04:40
    @SerializedName("updated_at")
    val updatedAt: String // 2024-01-06T07:34:40.000000Z
)
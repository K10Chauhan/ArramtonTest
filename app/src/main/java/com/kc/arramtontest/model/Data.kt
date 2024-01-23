package com.kc.arramtontest.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("borrower")
    val borrower: Borrower,
    @SerializedName("borrower_id")
    val borrowerId: Int, // 14
    @SerializedName("created_at")
    val createdAt: String, // 2024-01-06T07:28:45.000000Z
    @SerializedName("end_date")
    val endDate: Any?, // null
    @SerializedName("id")
    val id: Int, // 1
    @SerializedName("is_received")
    val isReceived: Int, // 0
    @SerializedName("received_date")
    val receivedDate: Any?, // null
    @SerializedName("start_date")
    val startDate: String, // 2024-01-06 12:58:45
    @SerializedName("tool")
    val tool: Tool,
    @SerializedName("tool_id")
    val toolId: Int, // 26
    @SerializedName("updated_at")
    val updatedAt: String, // 2024-01-06T07:28:45.000000Z
    @SerializedName("user_id")
    val userId: Int // 1
)
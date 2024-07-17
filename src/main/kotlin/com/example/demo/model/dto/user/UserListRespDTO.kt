package com.example.demo.model.dto.user

data class UserListRespDTO(
    val count: Int,
    val users: List<UserRespDTO>
)

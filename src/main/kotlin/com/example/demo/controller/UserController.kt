package com.example.demo.controller

import com.example.demo.model.dto.user.UserListRespDTO
import com.example.demo.model.dto.user.UserRespDTO
import com.example.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping("/api/v1/users")
    fun getAllUsers(): ResponseEntity<UserListRespDTO> {
        val users = userService.findAll()

        val dto = UserListRespDTO(
            count = users.size,
            users = users.map { user ->
                UserRespDTO(
                    id = user.id,
                    username = user.username,
                    email = user.email,
                )
            }
        )

        return ResponseEntity.ok(dto)
    }
}
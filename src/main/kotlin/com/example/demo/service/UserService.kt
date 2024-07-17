package com.example.demo.service

import com.example.demo.model.EUser
import com.example.demo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun findAll(): List<EUser> {
        return userRepository.findAll()
    }
}
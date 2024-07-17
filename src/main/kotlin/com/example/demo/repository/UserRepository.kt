package com.example.demo.repository

import com.example.demo.model.EUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<EUser, Long>
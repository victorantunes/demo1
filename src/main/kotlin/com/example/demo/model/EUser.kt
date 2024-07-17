package com.example.demo.model

import jakarta.persistence.*

@Entity(name = "User")
@Table(name = "user", schema = "public")
class EUser: ETrace() {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    var id: Long = 0

    @Column(name = "username", nullable = false, unique = true)
    var username: String = ""

    @Column(name = "cpf", nullable = false, length = 11, unique = true)
    var cpf: String = ""

    @Column(name = "email", nullable = false, unique = true)
    var email: String = ""

    @Column(name = "phone", nullable = false)
    var phone: String = ""

    @Column(name = "password", nullable = false, length = 150)
    var password: String = ""
}
package com.userservicekotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UserServiceKotlinApplication

fun main(args: Array<String>) {
	runApplication<UserServiceKotlinApplication>(*args)
}

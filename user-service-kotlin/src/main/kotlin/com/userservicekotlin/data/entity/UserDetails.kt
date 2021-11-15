package com.userservicekotlin.data.entity


data class UserDetails(
    val Id : Int,
    val name : String,
    val age : Int,
    val address : List<Address>
)

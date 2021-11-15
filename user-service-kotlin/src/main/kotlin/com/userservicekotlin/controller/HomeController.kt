package com.userservicekotlin.controller

import com.userservicekotlin.data.entity.UserDetails
import org.springframework.web.bind.annotation.*


@RestController
class HomeController {

    @GetMapping("/users/all")
    fun getAllUsers() : String {
        return "this controller is for getting all users details"
    }

    @GetMapping("/users/{Id}")
    fun getById(@PathVariable Id : Int) : String {
        return "this controller is for getting details of User $Id"
    }

    @DeleteMapping("/users/delete/{Id}")
    fun deleteUserById(@PathVariable Id : Int) : String{
        return "this controller is for deleting user with Id = $Id"
    }

    @PostMapping("/users/add")
    fun addUser(@RequestBody user : UserDetails) : String {
        return "this controller is for saving new user details"
    }

    @PostMapping("/users/{Id}/update")
    fun updateUser(@PathVariable Id : Int, @RequestBody user: UserDetails) : String{
        return "this user is for updating user details"
    }
}
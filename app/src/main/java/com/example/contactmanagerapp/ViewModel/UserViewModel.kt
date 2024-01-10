package com.example.contactmanagerapp.ViewModel


import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.contactmanagerapp.room.User
import com.example.contactmanagerapp.room.UserRepository

class UserViewModel(private val repository : UserRepository) : ViewModel(), Observable {

    val users = repository.users
    private val isUpdateOrDelete = false
    private lateinit var userToUpdateOrDelete : User

    @Bindable
    var inputName = MutableLiveData<String>()

    @Bindable
    var inputEmail = MutableLiveData<String>()


}
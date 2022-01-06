package com.example.helloviewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;
import java.util.List;

public class MyViewModel extends ViewModel {
    private MutableLiveData<List<User>> users ;

    public MutableLiveData<List<User>> getUsers() {
        if (users == null){
            users  = new MutableLiveData<List<User>>();
            loadUsers();
        }
        return users;
    }

    void loadUsers(){
//        Do any Asynchronous operation to fetch users
        LinkedList<User> list = new
                LinkedList<User>();
        list.add(new User("Kobby", "001"));
        list.add(new User("Junior", "002"));
        list.add(new User("James", "003"));
        users.setValue(list);
    }
}

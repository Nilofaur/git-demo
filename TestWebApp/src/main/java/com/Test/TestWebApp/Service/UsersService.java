package com.Test.TestWebApp.Service;

import com.Test.TestWebApp.Model.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {
    private final List<Users> userApplication = new ArrayList<>();

    //it adds a Users object (submitted form data) to the list
    public void saveUsers(Users users) {
        userApplication.add(users);
    }

    public List<Users> getAllApplications() {
        return userApplication;
    }

    //Two methods here -
    //an empty list calls 'add' predefined method and adds the users (parameter) entered by the user on saveUsers method
    //getAllApplications() returns this list after adding

}

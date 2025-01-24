package com.Test.TestWebApp.Controller;

import com.Test.TestWebApp.Model.Users;
import com.Test.TestWebApp.Service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {

    //A variable of type UsersService
    private final UsersService usersService;

    //Constructor where UsersSerice obj is passed and constr inject is happening to create an object using spring
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }



    // POST request to handle form submission and navigate to the userApplications page
    @PostMapping("/userApplication")

    //userApplication is a variable of type Users(class) and a model variable. its the data which is submitted by the customer on index.html page. it will be binding with Users class.
    // This variable will have the users data and will be sent to the saveUsers method on UsersService class
    //Model is used to pass the data to the HTML.
    public String submitApplication(@ModelAttribute Users userApplication, Model model) {
        // Save the user application data
        usersService.saveUsers(userApplication);

        // Fetch all applications and pass them to the view
        //The List from UsersService returns the data from index.html and then now it will be passed on to next html by using "userApplications" attribute on html.
        model.addAttribute("userApplications", usersService.getAllApplications());

        return "userApplication"; // This returns userApplication.html to show the submitted data
    }


}

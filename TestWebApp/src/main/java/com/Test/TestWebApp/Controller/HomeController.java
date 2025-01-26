package com.Test.TestWebApp.Controller;

import com.Test.TestWebApp.Model.Users;
import com.Test.TestWebApp.Service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    //Variable of Type JobServive
    private final JobService jobService;

    //constructor and passing the JobService as a parameter to get an object of JS class- constr injection
    public HomeController(JobService jobService) {
        this.jobService = jobService;
    }

    // GET request for index page
    @GetMapping("/")
    //the Model object is used to pass the data from here to the HTML (index)
    //so need to add some data to that model by using 'addAttribute'
    public String home(Model model) {
        model.addAttribute("jobs", jobService.getAllJobs()); // Fetch all jobs for the form
        model.addAttribute("userApplication", new Users()); // Empty userApplication object to bind form

        return "index"; // This returns the index.html
    }

// "jobs" and "userApplication" are attributes defined here which are used on html to access them.eg) object="${userApplication}"

    //jobService.getAllJobs() are for index.html to display the pre defined jobs
    //new Users() creates an empty object to get the data from customer from index page and then display them on the next page -userApplication.html page

// testing sourcetree

}

package com.Test.TestWebApp.Service;

import com.Test.TestWebApp.Model.Job;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    private final List<Job> jobs = new ArrayList<>();

    //contructor with some pre definded data
    public JobService() {
        jobs.add(new Job(1, "Software Developer", "Develop and maintain software applications."));
        jobs.add(new Job(2, "Data Analyst", "Analyze data and create meaningful insights."));
        jobs.add(new Job(3, "UI/UX Designer", "Design user-friendly interfaces and experiences."));
    }

    public List<Job> getAllJobs() {
        //there are some pre definded jobs which are written inside an object (Job) in its constructor
        return jobs;
    }

// Got an empty List, Constructor and 1 method
    //getAllJobs returns the list (jobs) which are defined in the constructor


}

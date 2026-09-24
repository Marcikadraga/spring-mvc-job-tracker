package com.marton.jobtracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobApplicationListController {
    
    @GetMapping("/job-applications")
    public String showJobApplicationList() {
        return "job-application-list";
    }
}
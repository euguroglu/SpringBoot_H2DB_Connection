package com.springboot.fundamentals.service;

import com.springboot.fundamentals.entity.Application;
import java.util.List;
import java.util.Optional;


public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(long id);
}

package com.Anish.Create.a.Portal.service;

import com.Anish.Create.a.Portal.repository.AddressRepo;
import com.Anish.Create.a.Portal.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;
}

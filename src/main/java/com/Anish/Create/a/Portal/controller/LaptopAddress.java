package com.Anish.Create.a.Portal.controller;

import com.Anish.Create.a.Portal.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laptops")

public class LaptopAddress {
    @Autowired
    LaptopService laptopService;
}

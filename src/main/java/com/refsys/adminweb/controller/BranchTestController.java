package com.refsys.adminweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchTestController {

    @GetMapping
    public String branchTest() {
        return "branch test";
    }
}

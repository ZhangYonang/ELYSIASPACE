package com.elysia.controller;
import com.elysia.service.AdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "管理员接口")
@RestController("/background/admin")
@CrossOrigin
public class adminController {
    @Autowired
    private AdminService adminService;

}

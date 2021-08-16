package tz.co.pesapal.interview.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tz.co.pesapal.interview.beans.Admin;
import tz.co.pesapal.interview.services.AdminService;
import tz.co.pesapal.interview.services.AdminServiceImpl;

/**
 * @project interview
 * @Author frances on 15/06/2021
 * For Softnet Technologies Limited
 * +255745470673
 */

@RestController
@CrossOrigin
public class WebController {
    
    @Autowired
    AdminService adminService;

    @PostMapping(value = "/users/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String postUser(@RequestBody Admin admin){

        //AdminServiceImpl adminService = new AdminServiceImpl();

        return adminService.saveAdmin(admin).toString();
    }
}

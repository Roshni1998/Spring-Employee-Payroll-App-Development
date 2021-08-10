package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

/*
* @author ROSHNI
* EmployeePayrollController
* */

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    /*
    * Purpose : To Get the Employee Payroll Data using HTTP GET Method
    * @return
    * */
    @RequestMapping(value = {",", "/", "/get"})
    public ResponseEntity<String> getEmployeePayrollData() {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    /*
     * Purpose : To Get the Data from the database with the ID using HTTP GET Method
     * @return
     * */
    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Get Call Success for id: " +empId, HttpStatus.OK);
    }

    /*
     * Purpose : To Create Employee Payroll Data using HTTP POST Method
     * @return
     * */
    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
        return new ResponseEntity<String>("Created Employee Payroll Data for: " +empPayrollDTO, HttpStatus.OK);
    }

    /*
     * Purpose : To Update Employee Payroll Data using HTTP PUT Method
     * @return
     * */
    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
        return new ResponseEntity<String>("Created Employee Payroll Data for: " +empPayrollDTO, HttpStatus.OK);
    }

    /*
     * Purpose : To Delete Employee Payroll Data with the id using HTTP DELETE Method
     * @return
     * */
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable ("empId") int empId) {
        return new ResponseEntity<String>("Delete Call Success for id: " +empId, HttpStatus.OK);
    }
}
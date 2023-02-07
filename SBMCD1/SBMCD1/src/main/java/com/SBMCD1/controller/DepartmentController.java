package com.SBMCD1.controller;

import com.SBMCD1.Entity.Department;
import com.SBMCD1.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentservice;



        @PostMapping("/department")
        public Department saveDepartment( @RequestBody Department department)
        {
            return departmentservice.saveDepartment(department);
        }

        @GetMapping("/department")
        public List<Department> getDepartment()
        {
            return departmentservice.getDepartment();
        }
        @GetMapping("/department/{id}")
        public Department getDepartmentByID(@PathVariable("id")Long departmentId)
        {
            return departmentservice.getDepartmentByID(departmentId);
        }
        @DeleteMapping("/department/{id}")
        public String deleteDepartmentByID(@PathVariable("id")Long departmentId)
        {
            departmentservice.deleteDepartmentByID(departmentId);
            return "Department Delete Successfully!!!";
        }

        @PutMapping("/department/{id}")
        public Department updateDepartment(@PathVariable ("id")Long departmentId,
                                           @RequestBody  Department department)
        {
         return departmentservice.updateDepartment(departmentId,department);
        }

        @GetMapping("/department/name/{name}")
        public Department getDepartmentByName(@PathVariable("name") String departmentName)
    {
        return departmentservice.getDepartmentByName(departmentName);
    }



}

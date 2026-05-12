package com.project.ems.controller;

import com.project.ems.dto.EmployeeDto;
import com.project.ems.entity.Employee;
import com.project.ems.mapper.EmployeeMapper;
import com.project.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee , HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id){
        EmployeeDto getEmployeeById = employeeService.getEmployeeById(id);
        return new ResponseEntity<>(getEmployeeById , HttpStatus.FOUND);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employeeDtos = employeeService.getAllEmployees();
        return new ResponseEntity<>(employeeDtos , HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployeeInfo(@PathVariable("id") Long employeeId ,@RequestBody EmployeeDto updatedEmployee){
        EmployeeDto employeeDto = employeeService.updatedEmployeeInfo(employeeId , updatedEmployee);

        return new ResponseEntity<>(employeeDto , HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployeeById(employeeId);

        return new ResponseEntity<>("Deleted SuccessFully" , HttpStatus.OK);
    }
}

package mx.dm.kotlinrest.controllers

import mx.dm.kotlinrest.models.Employee
import mx.dm.kotlinrest.services.EmployeeService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController(private val employeeService: EmployeeService) {

    @GetMapping("/employees")
    fun getAllEmployees(): List<Employee> = employeeService.getAllEmployees()

    @GetMapping("/employees/{id}")
    fun getEmployeeById(@PathVariable("id") employeeId: Long): Employee =
        employeeService.getEmployeeById(employeeId)

    @PostMapping("/employees")
    fun createEmployee(@RequestBody employee: Employee): Employee =
        employeeService.createEmployee(employee)

    @PutMapping("/employees/{id}")
    fun updateEmployeeById(@PathVariable("id") employeeId: Long, @RequestBody employee: Employee): Employee =
        employeeService.updateEmployeeById(employeeId, employee)

    @DeleteMapping("/employees/{id}")
    fun deleteEmployeeById(@PathVariable("id") employeeId: Long): Unit =
        employeeService.deleteEmployeeById(employeeId)
}
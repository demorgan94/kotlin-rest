package mx.dm.kotlinrest.exceptions

import org.springframework.http.HttpStatus

class EmployeeNotFoundException(status: HttpStatus, message: String): Exception(message)
package Entities;

import EntitiesInterface.IRequestEmployeesDTO;
import lombok.Data;

/**
 * FI-001
 * Author: Andrés Alvarado Matamoros
 * Class to manage the request of employees params in a stored procedure
 */
@Data
public class RequestEmployeesDTO implements IRequestEmployeesDTO {

    private int employeeId;
    private String employeeName;
    private String city;
    
    // Constructor
    public RequestEmployeesDTO(int employeeId, String employeeName, String city) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.city = city;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    } 
}

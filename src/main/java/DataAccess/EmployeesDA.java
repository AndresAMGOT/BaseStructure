package DataAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import DataAccessInterface.IEmployeesDA;
import Entities.RequestEmployeesDTO;

/**
 * FI-001
 * Author: Andrés Alvarado Matamoros
 * Class to manage employees data.
 */

public class EmployeesDA  implements IEmployeesDA {
   private final JdbcTemplate jdbcTemplate;

    
    /**
    * FI-001
    * Author: Andrés Alvarado Matamoros
    * Constructor to fill the data base conection    * 
    * @param jdbcTemplate
    */    
    @Autowired
    public EmployeesDA(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    /**
    * FI-001
    * Author: Andrés Alvarado Matamoros
    * Metho to handle the save information of employee table in data base.
    * @param RequestEmployees Here came the necesary information to save employee information like id, name and city
    */    
   @Override
    public void Save (RequestEmployeesDTO RequestEmployees) {
        String sql = "CALL insertar_empleado(?, ?, ?)";
        jdbcTemplate.update(sql, RequestEmployees.getEmployeeId(), RequestEmployees.getEmployeeName(), RequestEmployees.getCity());
    }
    
}

 
package DataAccessInterface;

import EntitiesInterface.IRequestEmployeesDTO;

/**
 * FI-001
 * Author: Andrés Alvarado Matamoros
 * Interface to manage employees data.
 */
public interface IEmployeesDA {
     /**
    * FI-001
    * Author: Andrés Alvarado Matamoros
    * Metho to handle the save information of employee table in data base.
    * @param RequestEmployees Here came the necesary information to save employee information like id, name and city
    */
    void Get(IRequestEmployeesDTO RequestEmployees);
}

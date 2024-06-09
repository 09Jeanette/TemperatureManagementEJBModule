/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Employee;

@Stateless
public class EmployeeFacade extends AbstractFacade<Employee> implements EmployeeFacadeLocal {

    @PersistenceContext(unitName = "TemperatureEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeeFacade() {
        super(Employee.class);
    }

    @Override
    public List<Employee> findHigh() {
        Query query = em.createQuery("SELECT e FROM Employee e JOIN e.temperatures t WHERE t > 38");
        List<Employee> emp = query.getResultList();
        return emp;
    }

    @Override
    public List<Employee> findAccepatable() {
        Query query = em.createQuery("SELECT e FROM Employee e JOIN e.temperatures t WHERE t <= 38");
        List<Employee> emp = query.getResultList();
        return emp;
    }

    @Override
    public List<Employee> findHigh2() {
        Query query = em.createQuery("SELECT e FROM Employee e JOIN e.temperatures t WHERE t >=38  GROUP BY e HAVING COUNT(t) > 1");
        List<Employee> emp = query.getResultList();
        return emp;
    }

}

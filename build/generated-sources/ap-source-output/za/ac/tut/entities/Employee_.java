package za.ac.tut.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-06-07T21:52:57")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile ListAttribute<Employee, Double> temperatures;
    public static volatile SingularAttribute<Employee, String> name;
    public static volatile ListAttribute<Employee, String> statuses;
    public static volatile SingularAttribute<Employee, Long> id;
    public static volatile SingularAttribute<Employee, Date> creation_date;
    public static volatile SingularAttribute<Employee, Date> hire_date;

}
package stevens.week.seven;

import java.util.Calendar;

/**
 * 
 * @author Paul Deitel; Harvey M. Deitel
 * @author Kyle Stevens
 *
 */
public class PayrollSystemTest {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
        int currentMonth = 1 + Calendar.getInstance().get(Calendar.MONTH);
        
        System.out.println("Kyle Stevens - Assignment 8: Program 1");

		// create subclass objects                                          
		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, 10, 01, 1988);    
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, 06, 03, 1994);  
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06, 01, 01, 1979);                      
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300, 11, 12, 2001);                  
		
		System.out.println("Employees processed individually:");
		
		System.out.printf("%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
		
		// create four-element Employee array
		Employee[] employees = new Employee[4];  
		
		// initialize array with Employees          
		employees[0] = salariedEmployee;            
		employees[1] = hourlyEmployee;              
		employees[2] = commissionEmployee;          
		employees[3] = basePlusCommissionEmployee;  
		
		System.out.println("Employees processed polymorphically:\n");
		
		// generically process each element in array employees
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee); // invokes toString
			
			// determine whether element is a BasePlusCommissionEmployee
			if(currentEmployee instanceof BasePlusCommissionEmployee) {
				// downcast Employee reference to
				// BasePlusCommissionEmployee reference
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee ;

				employee.setBaseSalary(1.10 * employee.getBaseSalary());

				System.out.printf("new base salary with 10%% increase is: $%,.2f%n",employee.getBaseSalary());
			}
			
			System.out.printf("earned without bonus $%,.2f\n", currentEmployee.earnings());

			// add bonus if birth month = current birth month
            System.out.printf("earned with bonus $%,.2f\n\n", (currentEmployee.getBirthday().getMonth() == currentMonth) ?  currentEmployee.earnings() + 100.0 : currentEmployee.earnings());

			
		}

		// get type name of each object in employees array
		for (int j = 0; j < employees.length; j++) {      
			System.out.printf("Employee %d is a %s%n", j,employees[j].getClass().getName());         
		}                                                 
	}
}


/**
 * BasePlusCommissionEmployee
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    // six-argument constructor

    private double baseSalary;
    public BasePlusCommissionEmployee( String first, String last, String ssn, double sales, double rate, double salary ){
        // explicit call to superclass CommissionEmployee constructor
        super(first, last, ssn, sales, rate);
        setBaseSalary(salary); // validate and store base salary

    } // end six-argument BasePlusCommissionEmployee constructor
    
    // set base salary
    public void setBaseSalary( double salary ){
        if ( salary >= 0.0 )
            baseSalary = salary;
        else
            throw new IllegalArgumentException("Base salary must be >= 0.0" );
    } // end method setBaseSalary
   
    // return base salary
    public double getBaseSalary(){
        return baseSalary;
    } // end method getBaseSalary

    // calculate earnings
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    } // end method earnings

    // return String representation of BasePlusCommissionEmployee
        // indicates that this method overrides a superclass method
    @Override 
    public String toString(){
        return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    } // end method toString
     
}// end class BasePlusCommissionEmployee   
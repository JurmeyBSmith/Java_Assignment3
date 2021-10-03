
public class PieceWorker extends Employee {

	 private double wage; // wage per hour
	 private double pieces; // hours worked for week
	 
	// constructor
	   public PieceWorker(String firstName, String lastName,
	      String socialSecurityNumber, double wage, double pieces)
	   {
	      super(firstName, lastName, socialSecurityNumber);

	      if (wage < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "Hourly wage must be >= 0.0");

	      if ((pieces < 0.0)) // validate hours
	         throw new IllegalArgumentException(
	            "Hours worked must be >= 0.0 ");

	      this.wage = wage;
	      this.pieces = pieces;
	      
	   } 
	   public void setWage(double wage)
	   {
	      if (wage < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "Hourly wage must be >= 0.0");

	      this.wage = wage;
	   } 

	   // return wage
	   public double getWage()
	   {
	      return wage;
	   } 

	   // set hours worked
	   public void setPieces(double pieces)
	   {
	      if ((pieces < 0.0)) // validate hours
	         throw new IllegalArgumentException(
	            "Hours worked must be >= 0.0");

	      this.pieces = pieces;
	   } 

	   // return hours worked
	   public double getPieces()
	   {
	      return pieces;
	   } 
	   
	   // calculate earnings; override abstract method earnings in Employee
	   @Override                                                           
	   public double earnings()                                            
	   {                                                                                            
	         return getWage() * getPieces();                                
	      
	   }                                          

	   // return String representation of HourlyEmployee object 
	   @Override                                                             
	   public String toString()                                              
	   {                                                                     
	      return String.format("Piece Worker: %s%n%s: $%,.2f; %s: %,.2f",
	         super.toString(), "hourly wage", getWage(),                     
	         "pieces made", getPieces());                                   
	   }               
}

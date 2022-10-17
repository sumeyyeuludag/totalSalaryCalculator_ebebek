package maasToplamDeneme;

public class Employee {
	
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		if (salary >= 1000){
			return salary * 0.03;
		}
		else {
			return 0;
		}
	}
	
	public int bonus() {
		if (workHours >= 40){
			return 30*(workHours-40);
		}
		else {
			return 0;
		}
	}
	public double raiseSalary() {
		double salaryWithTaxAndBonus=taxAndBonusSalary();
		if (2021-hireYear < 10 ){
			return salaryWithTaxAndBonus*0.05;
		}
		else if(2021-hireYear >= 10 && 2021-hireYear<20){
			return salaryWithTaxAndBonus*0.10;
		}
		else if(2021-hireYear >= 20 ) {
			return salaryWithTaxAndBonus*0.15;
		}
		else {
			return 0;
		}
	}
	

	public double taxAndBonusSalary() {
		return salary+bonus()-tax();
	}

	public double totalSalary() {
		return salary+raiseSalary()+bonus()-tax();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear=" + hireYear
				+ ", tax()=" + tax() + ", taxAndBonusSalary()=" + taxAndBonusSalary() + ", totalSalary()="
				+ totalSalary() + "]";
	}
	public static void main(String[] args) {
	 Employee sum=new Employee("süm",4000,45,2012);
	 System.out.println(sum.toString());
	}

}
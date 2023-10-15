package for2;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Deekshi";
		e.age = 19;
		e.salary = 20000;
		e.gender = "Female";

		Employee e1 = new Employee();
		e1.name = "David";
		e1.age = 21;
		e1.salary = 40000;
		e1.gender = "Male";

		Employee e2 = new Employee();
		e2.name = "Sneha";
		e2.age = 29;
		e2.salary = 10000;
		e2.gender = "Female";

		Employee e3 = new Employee();
		e3.name = "Christy";
		e3.age = 21;
		e3.salary = 20000;
		e3.gender = "Female";

		Employee e4 = new Employee();
		e4.name = "Diya";
		e4.age = 20;
		e4.salary = 25000;
		e4.gender = "Female";

		Employee e5 = new Employee();
		e5.name = "Moniha";
		e5.age = 21;
		e5.salary = 30000;
		e5.gender = "Female";

		Employee e6 = new Employee();
		e6.name = "Surya";
		e6.age = 22;
		e6.salary = 22000;
		e6.gender = "Male";

		Employee e7 = new Employee();
		e7.name = "Priya";
		e7.age = 20;
		e7.salary = 20000;
		e7.gender = "Female";

		Employee e8 = new Employee();
		e8.name = "Guru";
		e8.age = 25;
		e8.salary = 28000;
		e8.gender = "Male";

		Employee e9 = new Employee();
		e9.name = "Viper";
		e9.age = 20;
		e9.salary = 38500;
		e9.gender = "Male";

		
		Employee[] emp = { e, e1, e2, e3, e4, e5, e6, e7, e8, e9 };
//		for (int i = 0; i < emp.length; i++) {
//			System.out.println(emp[i].name + ","+ emp[i].age+","+emp[i].gender+","+emp[i].salary);
//			
//		}                                                                                               //to print all data in an object
		
		
//		for(int i =0; i < emp.length; i++) {
//			if(emp[i].salary > 25000) {
//				System.out.println(emp[i].name);
//			}
//		}                                                                        //finding salary more than 25k and printing their names
		
		
//		Employee temp = emp[0];
//		for (int i = 0; i < emp.length; i++) {
//			if (emp[i].salary > temp.salary) {
//				temp = emp[i];
//			}
//		}
//		System.out.println(temp.name);                                                     //finding max salary and printing their names
		
		
//		for(int i = 0; i < emp.length; i++) {
//			if(emp[i].gender.equals("Male")) {
//				System.out.println(emp[i].name);
//			}
//		}                                                                                 //finding male gender and printing their names
		
		
//		Employee temp = emp[0];
//		for(int i = 0; i < emp.length; i++) {
//			if(emp[i].age > temp.age) {
//				temp = emp[i];
//			}
//		}
//		System.out.println(temp.name);                                                        //finding max age and printing their names
		
		
//		Employee temp1 = emp[0];
//		for(int i = 0; i < emp.length; i++) {
//			if(emp[i].age < temp1.age) {
//				temp1 = emp[i];
//			}
//		}
//		System.out.println(temp1.name);                                                       //finding min age and printing their names
		
		
//		Employee max = emp[0];
//		for (int i = 0; i < emp.length; i++) {
//			if (emp[i].salary > max.salary) {
//				max = emp[i];
//			}
//		}
//		System.out.println(max.name+" "+max.age+" "+max.gender+" "+max.salary);                                                             //find max salary and print their name

		
//		Employee min = emp[0];
//		for (int i = 0; i < emp.length; i++) {
//			if (emp[i].salary < min.salary) {
//				min = emp[i];
//			}
//		}
//		System.out.println(min.name);
		
		
//		for (int i = 0; i < emp.length; i++) {
//			if (emp[i].name.length() % 2 == 0) {
//				System.out.println(emp[i].name+ " is Even");
//			}
//			else {
//				System.out.println(emp[i].name+ " is Odd");
//			}
//		}
	 	
		
//		for(int  i= 0; i < emp.length; i++) {
//			if(emp[i].name.startsWith("S")) {
//				System.out.println("Name = "+emp[i].name);
//			}
//		}
		
		
//		Employee max = emp[0];
//		for(int i = 0; i < emp.length; i++) {
//			if(emp[i].name.length() > max.name.length()) {
//				max = emp[i];
//			}
//		}
//		System.out.println(max.name);
		
		for(Employee i : emp) {
			System.out.println(i.name+" "+i.age+" "+i.salary+" "+i.gender);
		}
//		
		
		
	}
	
}

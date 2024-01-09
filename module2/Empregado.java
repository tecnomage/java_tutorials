package module2;

import java.util.Objects;

public class Empregado {

	private String name;
	private int age;
	private String jobTitle;
	private int salary;
	private String address;
	private String phoneNumber;

	/**
	 * Creates a new Empregado object with the specified information.
	 *
	 * @param name        The name of the employee.
	 * @param age         The age of the employee.
	 * @param jobTitle    The job title of the employee.
	 * @param salary      The salary of the employee.
	 * @param address     The address of the employee.
	 * @param phoneNumber The phone number of the employee.
	 */
	/**
	 * Creates a new Empregado object with default information.
	 */
	public Empregado(String name, int age, String jobTitle, int salary, String address, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(address, age, jobTitle, name, phoneNumber, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empregado other = (Empregado) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(jobTitle, other.jobTitle)
				&& Objects.equals(name, other.name) && Objects.equals(phoneNumber, other.phoneNumber)
				&& salary == other.salary;
	}

	public static void main(String[] args) {

		Empregado jose = new Empregado("jose", 40, "programador", 6000, "rua 3 com a rua 2", "232443 ");
		Empregado maria = new Empregado("maria", 33, "publicitaria", 3000, "rua 62", "232443 ");
		Empregado joao = new Empregado("joao", 25, "programador", 5000, "rua 3 com a rua 2", "232443 ");

		System.out.println(jose.getName());
		System.out.println(maria.getName());
		System.out.println(joao.getName());

		System.out.println(jose.getSalary());
		jose.setSalary(7000);
		System.out.println(jose.getSalary());
		
		System.out.println(jose.hashCode());
		System.out.println("Jose equals Joao: " + jose.equals(joao));
		

	}

}
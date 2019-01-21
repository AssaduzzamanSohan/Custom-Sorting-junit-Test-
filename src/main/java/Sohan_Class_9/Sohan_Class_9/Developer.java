package Sohan_Class_9.Sohan_Class_9;

import java.math.BigDecimal;

public class Developer {
	private String name;
	private BigDecimal salry;
	private int age;

	public Developer(String name, BigDecimal salry, int age) {
		this.name = name;
		this.salry = salry;
		this.age = age;
	}

	// Setter getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalry() {
		return salry;
	}

	public void setSalry(BigDecimal salry) {
		this.salry = salry;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", salry=" + salry + ", age=" + age + "]";
	}
}

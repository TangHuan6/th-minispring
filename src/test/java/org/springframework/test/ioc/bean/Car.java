package org.springframework.test.ioc.bean;

/**
 * @author th
 * @date 2025/6/24
 */
public class Car {

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				'}';
	}
}

package in.ineuron.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Car;

public class TestApp {
	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("**********CONTAINER STARTED**************");
		
		System.in.read();
		
		Car car1 = factory.getBean("car1", Car.class);
		System.out.println(car1);
		System.out.println("Car1 hashcode is :: " + car1.hashCode());
		
		Car car2 = factory.getBean("car2", Car.class);
		System.out.println(car1);
		System.out.println("\nCar2 hashcode is :: " + car2.hashCode());
		
		Car baseCar = factory.getBean("baseCar", Car.class);
		System.out.println(baseCar);
		
		factory.close();
		
		System.out.println("************CONTAINER STOPPED************");
	}

}

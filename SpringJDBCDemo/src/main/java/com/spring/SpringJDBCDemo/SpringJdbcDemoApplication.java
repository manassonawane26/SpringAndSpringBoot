package com.spring.SpringJDBCDemo;

import com.spring.SpringJDBCDemo.model.Student;
import com.spring.SpringJDBCDemo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);
		Student student = context.getBean(Student.class);
		student.setRollNo(104);
		student.setName("XYZ");
		student.setMarks(90);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(student);
		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}

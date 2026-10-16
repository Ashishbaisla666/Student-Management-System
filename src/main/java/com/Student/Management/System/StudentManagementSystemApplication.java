package com.Student.Management.System;

import com.Student.Management.System.Entity.Student;
import com.Student.Management.System.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Service
	@RequiredArgsConstructor
	public class StudentService {

		private final StudentRepository studentRepository;

		public List<Student> getAllStudents() {

			return studentRepository.findAll();

		}
		public Student getStudentById(Integer id){
			return studentRepository.findById(id).orElse(null);
		}
		public Student updateStudent(Integer id, Student student) {
			Student existingStudent = studentRepository.findById(id).orElse(null);

			if (existingStudent != null) {
				existingStudent.setName(student.getName());
				existingStudent.setEmail(student.getEmail());

				return studentRepository.save(existingStudent);
			}
			return null;

		}
	}
}

package com.Student.Management.System.Service;
import com.Student.Management.System.Entity.Student;
import com.Student.Management.System.Repository.StudentRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public Student createStudent(Student student) {
        student.setName(student.getName().toUpperCase());
        student.setEmail(student.getEmail().toUpperCase());
        student.setDepartment(student.getDepartment().toUpperCase());

       return studentRepository.save(student);
    }


    public List<Student> getAllStudents() {

        return studentRepository.findAll();

    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(Integer id, Student student) {
        Student existingStudent = studentRepository.findById(id).orElse(null);

        if (existingStudent != null) {

            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setDepartment(student.getDepartment());

            return studentRepository.save(existingStudent);
        }
        return null;
    }
    public Student updateStudentEmail(Integer id, Student student) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent != null) {
            existingStudent.setEmail(student.getEmail());
            return studentRepository.save(existingStudent);
        }
        return null;
    }
    @DeleteMapping
    public String deleteStudent(Integer id) {
        studentRepository.deleteById(id);
        return "Student Deleted Successfully";
    }

    public String deleteAllStudent() {
        studentRepository.deleteAll();
        return "All student entries r deleted";

    }
}

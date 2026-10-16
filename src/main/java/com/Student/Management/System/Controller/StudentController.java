package com.Student.Management.System.Controller;

import com.Student.Management.System.Entity.Student;
import com.Student.Management.System.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService ;
    @PostMapping("/save")
    public ResponseEntity<?> createStudent(@RequestBody Student student)
    {
      studentService.createStudent(student);
       return new ResponseEntity<>("saved succesfully !!", HttpStatus.OK);
    }
        @GetMapping("/all")
        public ResponseEntity<List<Student>> getAllStudents() {

            List<Student> students = studentService.getAllStudents();

            return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student ){
        return studentService.updateStudent(id, student);
    }
    @PatchMapping("/{id}")
    public Student updateStudentEmail(@PathVariable Integer id,@RequestBody Student student){
        return studentService.updateStudentEmail(id,student);
    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }
    @DeleteMapping("/all")
    public String deleteAllStudent(){
        return studentService.deleteAllStudent();
    }

}

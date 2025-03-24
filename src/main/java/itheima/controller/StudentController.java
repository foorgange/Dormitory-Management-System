package itheima.controller;

import itheima.pojo.Student;
import itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> findAll() { return studentService.findAll(); }

    @PostMapping
    public int insert(@RequestBody Student student) { return studentService.insert(student); }
}

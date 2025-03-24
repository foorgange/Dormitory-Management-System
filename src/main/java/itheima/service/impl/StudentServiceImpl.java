package itheima.service.impl;

import itheima.mapper.StudentMapper;
import itheima.pojo.Student;
import itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> findAll() { return studentMapper.findAll(); }
    public Student findById(Integer id) { return studentMapper.findById(id); }
    public int insert(Student student) { return studentMapper.insert(student); }
    public int update(Student student) { return studentMapper.update(student); }
    public int delete(Integer id) { return studentMapper.delete(id); }
}

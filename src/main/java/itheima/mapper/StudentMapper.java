package itheima.mapper;

import itheima.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM student")
    List<Student> findAll();

    @Select("SELECT * FROM student WHERE id = #{id}")
    Student findById(Integer id);

    @Insert("INSERT INTO student (name, student_number, dorm_id, phone) VALUES (#{name}, #{studentNumber}, #{dormId}, #{phone})")
    int insert(Student student);

    @Update("UPDATE student SET name = #{name}, student_number = #{studentNumber}, dorm_id = #{dormId}, phone = #{phone} WHERE id = #{id}")
    int update(Student student);

    @Delete("DELETE FROM student WHERE id = #{id}")
    int delete(Integer id);
}

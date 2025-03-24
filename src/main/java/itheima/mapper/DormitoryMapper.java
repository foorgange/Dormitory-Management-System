package itheima.mapper;

import itheima.pojo.Dormitory;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DormitoryMapper {
    @Select("SELECT * FROM dormitory")
    List<Dormitory> findAll();

    @Select("SELECT * FROM dormitory WHERE id = #{id}")
    Dormitory findById(Integer id);

    @Insert("INSERT INTO dormitory (dorm_number, capacity, current_occupancy, floor) VALUES (#{dormNumber}, #{capacity}, #{currentOccupancy}, #{floor})")
    int insert(Dormitory dormitory);

    @Update("UPDATE dormitory SET dorm_number = #{dormNumber}, capacity = #{capacity}, current_occupancy = #{currentOccupancy}, floor = #{floor} WHERE id = #{id}")
    int update(Dormitory dormitory);

    @Delete("DELETE FROM dormitory WHERE id = #{id}")
    int delete(Integer id);
}

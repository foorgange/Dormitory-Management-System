package itheima.service;

import itheima.pojo.Dormitory;

import java.util.List;

public interface DormitoryService {
    List<Dormitory> findAll();
    Dormitory findById(Integer id);
    int insert(Dormitory dormitory);
    int update(Dormitory dormitory);
    int delete(Integer id);
}

package itheima.service.impl;

import itheima.mapper.DormitoryMapper;
import itheima.pojo.Dormitory;
import itheima.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormitoryServiceImpl implements DormitoryService {
    @Autowired
    private DormitoryMapper dormitoryMapper;

    public List<Dormitory> findAll() { return dormitoryMapper.findAll(); }
    public Dormitory findById(Integer id) { return dormitoryMapper.findById(id); }
    public int insert(Dormitory dormitory) { return dormitoryMapper.insert(dormitory); }
    public int update(Dormitory dormitory) { return dormitoryMapper.update(dormitory); }
    public int delete(Integer id) { return dormitoryMapper.delete(id); }
}

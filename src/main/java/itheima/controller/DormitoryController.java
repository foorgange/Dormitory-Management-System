package itheima.controller;

import itheima.pojo.Dormitory;
import itheima.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dormitory")
public class DormitoryController {
    @Autowired
    private DormitoryService dormitoryService;

    @GetMapping
    public List<Dormitory> findAll() { return dormitoryService.findAll(); }

    @PostMapping
    public int insert(@RequestBody Dormitory dormitory) { return dormitoryService.insert(dormitory); }
}

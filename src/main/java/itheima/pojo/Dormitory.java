package itheima.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data  // 自动生成 Getter、Setter、toString、equals 和 hashCode 方法
@NoArgsConstructor // 生成无参构造
@AllArgsConstructor // 生成全参构造
public class Dormitory {
    private Integer id;
    private String dormNumber;
    private Integer capacity;
    private Integer currentOccupancy;
    private Integer floor;
}

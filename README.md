# Dormitory-Management-System

基于 **Spring Boot 3** 的宿舍管理系统，提供用户登录认证、学生信息管理和宿舍信息管理等核心功能。

## 技术栈

- **核心框架**：Spring Boot 3.1.3（Java 17）
- **数据访问**：MyBatis、PageHelper 分页插件
- **数据库**：MySQL 8（mysql-connector-j）
- **缓存**：Redis（spring-boot-starter-data-redis）
- **认证授权**：JWT（java-jwt 4.4.0）登录拦截器
- **文件存储**：阿里云 OSS（aliyun-sdk-oss）
- **其他**：Lombok、Spring Boot Validation、json-smart

## 功能模块

- **用户认证**：注册、登录、JWT 签发与登录拦截校验（`UserController`、`LoginInterceptor`、`JwtUtil`）
- **学生管理**：学生信息的增删改查（`StudentController`、`StudentService`）
- **宿舍管理**：宿舍信息的增删改查（`DormitoryController`、`DormitoryService`）
- **统一异常处理**：全局异常捕获与统一响应格式（`GlobalExceptionHandler`、`Result`）
- **密码加密**：MD5 加盐处理（`Md5Util`）

## 项目结构

```text
Dormitory-Management-System/
├── src/
│   ├── main/
│   │   ├── java/itheima/
│   │   │   ├── config/          # 配置类（如 WebConfig）
│   │   │   ├── controller/      # 控制器层
│   │   │   ├── exception/       # 全局异常处理
│   │   │   ├── interceptors/    # 登录拦截器
│   │   │   ├── mapper/          # MyBatis Mapper 接口
│   │   │   ├── pojo/            # 实体类
│   │   │   ├── service/         # 服务层
│   │   │   ├── utils/           # 工具类（JWT、MD5、ThreadLocal）
│   │   │   └── suseApplication.java  # 启动类
│   │   └── resources/
│   │       └── application.yml  # 全局配置
│   └── test/                    # 测试代码
├── pom.xml                      # Maven 依赖配置
└── .gitignore
```

## 快速开始

### 环境要求

- JDK 17+
- Maven 3.6+
- MySQL 8+
- Redis

### 运行步骤

1. **克隆仓库**

   ```bash
   git clone https://github.com/foorgange/Dormitory-Management-System.git
   cd Dormitory-Management-System
   ```

2. **修改数据库配置**

   编辑 `src/main/resources/application.yml`，配置 MySQL 与 Redis 连接信息。

3. **启动应用**

   ```bash
   mvn spring-boot:run
   ```

   服务默认在 `http://localhost:9090` 启动。

## 说明

本项目为学习用途的示例项目，实际部署时请勿使用配置文件中硬编码的数据库口令。

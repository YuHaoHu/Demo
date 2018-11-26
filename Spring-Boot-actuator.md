## #SpringBoot-Actuator

#1.Actuator 简介：

主要是完成微服务的监控，完成监控治理。可以查看微服务间的数据处理和调用，当它们之间出现了异常，就可以快速定位到出现问题的地方。

# 2.添加依赖

maven 项目 在 pom.xml 文件中加入 actuator 的依赖：

    <dependency>
     	 <groupId>org.springframework.boot</groupId>
     	 <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>

# 3.写yml文件

    management: 
      security:
   		 enabled: false #关闭安全认证
      port: 8888 #管理端口
      context-path: /abc #配置actuator 只有在设置了 management.server.port 时才有效 
  
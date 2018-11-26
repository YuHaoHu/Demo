## #相关注解

#一、注解(annotations)列表 
@SpringBootApplication：包含了@ComponentScan、@Configuration和@EnableAutoConfiguration注解。其中@ComponentScan让spring Boot扫描到Configuration类并把它加入到程序上下文。

@Configuration 等同于spring的XML配置文件；使用Java代码可以检查类型安全。

@EnableAutoConfiguration 自动配置。

@ComponentScan 组件扫描，可自动发现和装配一些Bean。

@Component可配合CommandLineRunner使用，在程序启动后执行一些基础任务。

@RestController注解是@Controller和@ResponseBody的合集,表示这是个控制器bean,并且是将函数的返回值直 接填入HTTP响应体中,是REST风格的控制器。

@Autowired自动导入。

@PathVariable获取参数。

@JsonBackReference解决嵌套外链问题。

@RepositoryRestResourcepublic配合spring-boot-starter-data-rest使用。

# 二、注解(annotations)详解

@SpringBootApplication：申明让spring boot自动给程序进行必要的配置，这个配置等同于：@Configuration ，@EnableAutoConfiguration 和 @ComponentScan 三个配置。

    @SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan 
    public class Application { 
    public static void main(String[] args) { 
    SpringApplication.run(Application.class, args); 
    } 
    }

@ResponseBody：表示该方法的返回结果直接写入HTTP response body中，一般在异步获取数据时使用，用于构建RESTful的api。在使用@RequestMapping后，返回值通常解析为跳转路径，加上@responsebody后返回结果不会被解析为跳转路径，而是直接写入HTTP response body中。比如异步获取json数据，加上@responsebody后，会直接返回json数据。该注解一般会配合@RequestMapping一起使用。示例代码：

        @RequestMapping("hello")
		@ResponseBody
    	public String hello() {
    		return "Hello,World!"+name+age;
    	}

@RestController：用于定义控制器类，在spring 项目中由控制器负责将用户发来的URL请求转发到对应的服务接口（service层），一般这个注解在类中，通常方法需要配合注解@RequestMapping。@ResponseBody和@Controller的合集示例代码：

    	@RestController
    	public class HelloSpringService {
    
    	@RequestMapping("/hello")
    	public String name() {
    		return "Hello world";
    	}
    }

@Autowired：自动导入依赖的bean

@Service：一般用于修饰service层的组件

@Repository：使用@Repository注解可以确保DAO或者repositories提供异常转译，这个注解修饰的DAO或者repositories类会被ComponetScan发现并配置，同时也不需要为它们提供XML配置项。

@Bean：用@Bean标注方法等价于XML中配置的bean。

@Value：注入Spring boot application.properties配置的属性的值




**@ConfigurationProperties(prefix="user") 扫描yml文件中的内容**

	（application.yml中的内容）

    user:
      name: 胡玉浩
      age: 22
      number: ${random.int[100,999]}
      greeting: Hi,I'm ${user.name}
      
    beans:
      zzzz: 中国石油大学胜利学院
      aaaa: name：${beans.zzzz}

****@PropertySource(value="classpath:test.properties")
@ConfigurationProperties(prefix="com.example")
@PropertySource :目的是加载指定的属性文件,扫描test.propertie文件中的内容**

    (test.propertie文件中的内容)

    com.example.name=太极公司
    com.example.age=18



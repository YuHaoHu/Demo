## #Profiles

# 1.什么是profile

   一般在开发项目的时候要有多个环境，如开发环境、测试环境、生产环境，他们的配置文件一般不同。当我们要向各个环境发布程序时，需要人工处理这些配置文件，这显然麻烦且易错。简单讲profile就是一组配置，不同profile提供不同组合的配置，程序运行时可以选择使用哪些profile来适应环境。

# 2.yml文件配置
application.yml

	spring: 
		profiles:
			active: hello

	---
	spring: 
   		profiles： hello
	name: everyone
	
	---
	spring:
		profiles: goodbye,dev
	name: myself 

MessageService.java(接口)

	public interface MessageService {

	 String getmessageService();

	}

HellowoldService.java（实现类）

    @Component
    @Profile({"hello","default","dev"})
    public class HellowoldService implements MessageService{
    
    	@Value("${name:huyuhao}")
    	private String name;
    	
    	@Override
    	public String getmessageService() {
    		// TODO Auto-generated method stub
    		return "Hello:"+this.name ;
    	}
    }
	


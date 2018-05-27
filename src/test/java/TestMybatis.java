import com.alibaba.fastjson.JSON;
import org.User.model.User;
import org.User.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/spring-*.xml"})
public class TestMybatis {
    private static Logger logger=Logger.getLogger(TestMybatis.class);
    @Resource
    private UserService userService;
    @Test
    public void Test1(){
//
//        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/spring/spring-*.xml");
//         context.getBean("userService");
        List<User> users=userService.getUserList();
        logger.info(JSON.toJSONString(users.get(0))+"hhh");

    }

}

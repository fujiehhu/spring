package test;

import com.spring.MessageServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fujie on 20/8/3.
 */
public class testSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");

        // 从 context 中取出我们的 Bean，而不是用 new MessageServiceImpl() 这种方式
        MessageServiceImpl messageService = context.getBean(MessageServiceImpl.class);

        System.out.println(messageService.getMessage());
        // System.out.println(((MessageServiceImpl)context.getBean("messageService")).getMessage());

    }
}

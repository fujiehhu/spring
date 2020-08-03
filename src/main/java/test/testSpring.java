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

        MessageServiceImpl messageService = context.getBean(MessageServiceImpl.class);
        System.out.println(messageService.getMessage());

    }
}

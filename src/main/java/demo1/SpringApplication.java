package demo1;

import demo1.model.Speaker;
import demo1.service.SpeakerService;
import demo1.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService = context.getBean("speakerService",SpeakerServiceImpl.class);
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        Speaker speaker = speakerService.addSpeaker(1,"lawson",date,time);
        System.out.println(speaker. getId()+": "+speaker.getName()+" "+speaker.getSesssionDate());
    }
}

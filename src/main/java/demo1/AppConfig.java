package demo1;

import demo1.model.Speaker;
import demo1.service.SpeakerService;
import demo1.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"demo1"})
public class AppConfig {

//    @Bean(name = "speakerService")
//    public SpeakerService getSpeakerService(){
//        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
//        return speakerService;
//    }

//    @Bean(name = "speaker")
//    public Speaker getSpeaker(){
//        return new Speaker();
//    }
}

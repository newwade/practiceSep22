package demo1;

import demo1.model.Speaker;
import demo1.repository.SpeakerRepository;
import demo1.repository.SpeakerRepositoryImpl;
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

//      @Bean(name="speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//          SpeakerRepositoryImpl speakerRepository = new SpeakerRepositoryImpl();
//          return speakerRepository;
//      }

//    @Bean(name = "speaker")
//    public Speaker getSpeaker(){
//        return new Speaker();
//    }
}

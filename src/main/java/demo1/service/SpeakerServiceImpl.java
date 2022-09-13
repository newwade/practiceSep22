package demo1.service;

import demo1.model.Speaker;
import demo1.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository speakerRepository;

    public SpeakerRepository getSpeaker() {
        return speakerRepository;
    }

    public void setSpeaker(SpeakerRepository speakerRepository) {
        System.out.println("setter based injection");
        this.speakerRepository = speakerRepository;
    }

    public SpeakerServiceImpl(){
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("Constructor based injection");
        this.speakerRepository = speakerRepository;
    }

    @Override
    public Speaker addSpeaker(long id, String name, LocalDate date, LocalTime time){
        Speaker speaker = speakerRepository.addSpeaker(id,name,date,time);
        return speaker;
    }

}

package demo1.service;

import demo1.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    private Speaker speaker;

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        System.out.println("setter based injection");
        this.speaker = speaker;
    }

    public SpeakerServiceImpl(){
    }

    @Autowired
    public SpeakerServiceImpl(Speaker speaker) {
        System.out.println("Constructor based injection");
        this.speaker = speaker;
    }

    @Override
    public Speaker addSpeaker(long id, String name, LocalDate date, LocalTime time){
        speaker.setId(id);
        speaker.setName(name);
        speaker.setSesssionDate(date);
        speaker.setSessionTime(time);
        return speaker;
    }

}

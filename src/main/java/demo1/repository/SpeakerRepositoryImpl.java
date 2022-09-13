package demo1.repository;

import demo1.model.Speaker;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;

@Repository("speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public Speaker addSpeaker(long id, String name, LocalDate date, LocalTime time){
        Speaker speaker = new Speaker();
        speaker.setId(id);
        speaker.setName(name);
        speaker.setSesssionDate(date);
        speaker.setSessionTime(time);
        return speaker;
    }
}

package demo1.repository;

import demo1.model.Speaker;
import java.time.LocalDate;
import java.time.LocalTime;

public interface SpeakerRepository {

    public Speaker addSpeaker(long id, String name, LocalDate date, LocalTime time);
}

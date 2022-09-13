package demo1.service;

import demo1.model.Speaker;

import java.time.LocalDate;
import java.time.LocalTime;

public interface SpeakerService {
    Speaker addSpeaker(long id, String name, LocalDate date, LocalTime time);
}

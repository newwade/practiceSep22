package demo1.model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class Speaker {

    public Speaker(){

    }

    public Speaker(long id, String name, LocalDate sesssionDate, LocalTime sessionTime) {
        this.id = id;
        this.name = name;
        this.sesssionDate = sesssionDate;
        this.sessionTime = sessionTime;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getSesssionDate() {
        return sesssionDate;
    }

    public LocalTime getSessionTime() {
        return sessionTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSesssionDate(LocalDate sesssionDate) {
        this.sesssionDate = sesssionDate;
    }

    public void setSessionTime(LocalTime sessionTime) {
        this.sessionTime = sessionTime;
    }

    private long id;
    private String name;
    private LocalDate sesssionDate;
    private LocalTime sessionTime;

}

package com.example.projet.entities;

import java.time.LocalDateTime;
import java.util.Date;

public class Notifications {

    private String id ;
    private User user;
    private RendezVous rendezVous ;
    private String message;
    private LocalDateTime time;
    private  boolean lue ;

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public boolean isLue() {
        return lue;
    }

    public void setLue(boolean lue) {
        this.lue = lue;
    }
}

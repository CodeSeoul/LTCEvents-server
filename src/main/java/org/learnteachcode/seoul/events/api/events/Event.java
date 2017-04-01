package org.learnteachcode.seoul.events.api.events;

import io.swagger.annotations.ApiModel;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@ApiModel
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String host; // To be replaced with a user
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    // private List<String> tags; Not yet implemented

}

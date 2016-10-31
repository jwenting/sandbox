package com.captainduckman.sandbox.service.entity;

import javax.persistence.*;

/**
 * A flight.
 */
@Entity
@Table(name = "FLIGHT")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    @Column(length = 4, name = "ICAO_ORIGIN")
    private String origin;

    @Basic
    @Column(length = 4, name = "ICAO_DESTINATION")
    private String destination;


    public Flight() {
    }

    public Flight(String origin, String destination) {
        setOrigin(origin);
        setDestination(destination);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }


    public void setOrigin(String origin) {
        this.origin = origin==null?null:origin.toUpperCase();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination==null?null:destination.toUpperCase();
    }
}

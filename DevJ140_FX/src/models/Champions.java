/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Владимир
 */
public class Champions {
    
    private Integer season;
    private String racer;
    private Integer points;
    private String shassis;
    private String engine;

    public Champions(Integer season, String racer, Integer points, String shassis, String engine) {
        this.season = season;
        this.racer = racer;
        this.points = points;
        this.shassis = shassis;
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getRacer() {
        return racer;
    }

    public void setRacer(String racer) {
        this.racer = racer;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getShassis() {
        return shassis;
    }

    public void setShassis(String shassis) {
        this.shassis = shassis;
    }

    @Override
    public String toString() {
        return "Champions{" + "season=" + season + ", racer=" + racer + ", points=" + points + ", shassis=" + shassis + ", engine=" + engine + '}';
    }
    
    
    
    
}

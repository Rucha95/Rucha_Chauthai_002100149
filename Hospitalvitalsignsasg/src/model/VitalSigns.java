/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ruchachauthai
 */
public class VitalSigns {
    String patientName;
    String Community;
    String City;
    Integer Age;
    Integer HeartRate;
    Integer RespRate ;
      Integer BP;
       Integer weight;
       String EncDate;

    public String getEncDate() {
        return EncDate;
    }

    public void setEncDate(String EncDate) {
        this.EncDate = EncDate;
    }

    public Integer getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(Integer HeartRate) {
        this.HeartRate = HeartRate;
    }
       
               

    public Integer getRespRate() {
        return RespRate;
    }

    public void setRespRate(Integer RespRate) {
        this.RespRate = RespRate;
    }

    public Integer getBP() {
        return BP;
    }

    public void setBP(Integer BP) {
        this.BP = BP;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String community) {
        this.Community = community;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public Integer getAge() {
        return this.Age;
       
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }
      @Override
    public String toString() {
        return patientName;
        
    }
    
}

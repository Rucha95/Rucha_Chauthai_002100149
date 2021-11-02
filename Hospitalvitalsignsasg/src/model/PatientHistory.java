/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ruchachauthai
 */
public class PatientHistory {
      private ArrayList<VitalSigns> AllVitalSigns ;
    
    public PatientHistory() {
        this.AllVitalSigns = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getAllPatientHistory() {
        return AllVitalSigns;
    }

    public void setAllPatientHistory(ArrayList<VitalSigns> AllpersonList) {
        this.AllVitalSigns = AllVitalSigns;
    }
    
    public VitalSigns addVitalSigns(){
    VitalSigns person1=new VitalSigns();
    AllVitalSigns.add(person1);
    return person1;
    }
    
    public VitalSigns addNewPatientHistory(){
        VitalSigns vitalSigns = new VitalSigns();
       // requestItem requestItem = new requestItem(car);
        AllVitalSigns.add(vitalSigns);
        return vitalSigns;
    }
    public void delete(VitalSigns v){
    AllVitalSigns.remove(v);
    }
}

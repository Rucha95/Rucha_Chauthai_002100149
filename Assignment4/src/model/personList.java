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
public class personList {
       private ArrayList<Person> AllpersonList ;
    
    public personList() {
        this.AllpersonList = new ArrayList<Person>();
    }

    public ArrayList<Person> getAllpersonList() {
        return AllpersonList;
    }

    public void setAllpersonList(ArrayList<Person> AllpersonList) {
        this.AllpersonList = AllpersonList;
    }
    
    public Person addPerson(){
    Person person1=new Person();
    AllpersonList.add(person1);
    return person1;
    }
    
    public Person addNewpersonlist(){
        Person person = new Person();
       // requestItem requestItem = new requestItem(car);
        AllpersonList.add(person);
        return person;
    }
    public void delete(Person p){
    AllpersonList.remove(p);
    }
    
    
}

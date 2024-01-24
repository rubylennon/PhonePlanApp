/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoneplan;

//imports
import java.io.Serializable;

/*
 * @author Ruby Lennon
 * 3rd January 2021
 * Student Number: x19128355
 * PhonePlan.java
 */

//super class PhonePlan
//serialization required for file I/O
public class PhonePlan implements Serializable{
    //declare variables
    private String planName;
    private int numberMin;
    private String freeCallOfferIncluded;

    //overloaded constructor
    public PhonePlan(String planName, int numberMin, String freeCallOfferIncluded) {
        this.planName = planName;
        this.numberMin = numberMin;
        this.freeCallOfferIncluded = freeCallOfferIncluded;
    }
    
    //no args constructor
    public PhonePlan() {
        planName = " ";
        numberMin = 0;
        freeCallOfferIncluded = " ";
    }
    
    //getters and setters
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getNumberMin() {
        return numberMin;
    }

    public void setNumberMin(int numberMin) {
        this.numberMin = numberMin;
    }

    public String getFreeCallOfferIncluded() {
        return freeCallOfferIncluded;
    }

    public void setFreeCallOfferIncluded(String freeCallOfferIncluded) {
        this.freeCallOfferIncluded = freeCallOfferIncluded;
    }

}

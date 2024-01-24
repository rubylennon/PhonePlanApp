/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoneplan;

/*
 * @author Ruby Lennon
 * 3rd January 2021
 * Student Number: x19128355
 * MobilePhonePlanApp.java
 */

//MobilePhonePlan is a subclass of PhonePlan
public class MobilePhonePlan extends PhonePlan {
    //declare variables
    private int numberTexts;
    private String dataAllowance;
    
    //overloaded constructor
    public MobilePhonePlan(int numberTexts, String dataAllowance, String planName, int numberMin, String freeCallOfferIncluded) {
        //variables from super class PhonePlan
        super(planName, numberMin, freeCallOfferIncluded);
        //variables from HomePhonePlan
        this.numberTexts = numberTexts;
        this.dataAllowance = dataAllowance;
    }
    
    //no args constructor
    public MobilePhonePlan() {
    }
    
    //getters and setters
    public int getNumberTexts() {
        return numberTexts;
    }

    public void setNumberTexts(int numberTexts) {
        this.numberTexts = numberTexts;
    }

    public String getDataAllowance() {
        return dataAllowance;
    }

    public void setDataAllowance(String dataAllowance) {
        this.dataAllowance = dataAllowance;
    }

}

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
 * HomePhonePlan.java
 */
//HomePhonePlan is a subclass of PhonePlan
public class HomePhonePlan extends PhonePlan {
    //declare variables
    private int internationalMinutes;
    
    //overloaded constructor
    public HomePhonePlan(int internationalMinutes, String planName, int numberMin, String freeCallOfferIncluded) {
        //variables from super class PhonePlan
        super(planName, numberMin, freeCallOfferIncluded);
        //variables from HomePhonePlan
        this.internationalMinutes = internationalMinutes;
    }
    
    //no args constructor
    public HomePhonePlan() {
    }
    
    //getters and setters
    public int getInternationalMinutes() {
        return internationalMinutes;
    }

    public void setInternationalMinutes(int internationalMinutes) {
        this.internationalMinutes = internationalMinutes;
    }
    
}

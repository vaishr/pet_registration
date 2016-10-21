package com.sqa.vr;

import com.sqa.vr.helpers.*;

/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author      Reddy, Vaishnavi
 * @version     1.0.0
 * @since       1.0
 *
 */
public class PetRegistration {
    
    /**
     * @param args
     *
     */
    private static String petName;
    private static String breed;
    private static String animal;
    private static String streetAddress;
    private static String city;
    private static String phoneNumber;
    private static char sex;
    private static boolean rabiesShot;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        petName = RequestInput.getString("What is the pet's name?");
        sex = RequestInput.getChar("What's " +petName+ "'s sex? Enter M or F", 'M', 'F');
        animal = RequestInput.getString("What type of animal is " + petName);
        breed = RequestInput.getString("What breed is " + petName);
        streetAddress = RequestInput.getString("What's " +petName+ "'s street address?");
        city = RequestInput.getString("What city does " + petName + " live in?");
        phoneNumber = RequestInput.getString("What is " + petName+ "'s human's phone number?");
        rabiesShot = RequestInput.getBoolean("Has" + petName + "received Rabies shots?");
        
        System.out.println("Thanks for registering" + petName);
        
        System.out.println("\n" + "NAME: " +petName);
        System.out.println("SEX: " + sex);
        System.out.println("TYPE: " + animal);
        System.out.println("BREED: " + breed);
        System.out.println("ADDRESS: " + streetAddress);
        System.out.println("CITY: " + city);
        System.out.println("PHONE NUMBER: " + phoneNumber);
        System.out.println("RABIES SHOT: " + rabiesShot);
        
        
        System.exit(0);
    }
    
}

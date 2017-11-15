package hakathon;


import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Member {
    String name;
    int gender;
    int velocity;
    double motivationLevel = getRandomInteger(50, 90);
    int primarySkill;
    int secondarySkill;
    String sprimarySkill;
    String ssecondarySkill;
    
     public static int getRandomInteger(int maximum, int minimum)
        { 
            return ((int) (Math.random()*(maximum - minimum))) + minimum; }
    
    Member(String givenName, int gen, int primS, int secS, int velocity) {
        name = givenName;
        gender = gen;
        primarySkill = primS;
        secondarySkill = secS;
        this.velocity = velocity;
    }
    
    Member(String givenName, int gen, String primS, String secS, int velocity) {
        name = givenName;
        gender = gen;
        sprimarySkill = primS;
        ssecondarySkill = secS;
        this.velocity = velocity;
    }
    
    
    
    
}

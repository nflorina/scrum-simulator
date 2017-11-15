package hakathon;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author florence
 */
public class Project {
    
    public static int getRandomInteger(int maximum, int minimum)
        { 
            return ((int) (Math.random()*(maximum - minimum))) + minimum; }
    
    public static double getRandomDouble(double maximum, double minimum)
        { 
            return ((double) (Math.random()*(maximum - minimum))) + minimum; }


    Random r = new Random();
    public static int sprintSize;
    public static int numberMembers;
    public final int storyPoints = getRandomInteger(300, 500);
    public final int weeksExpectedCompletion = getRandomInteger(8, 15);
    public final int initialCustomerSatisfation = getRandomInteger(50, 90);
    public int initialProjectBudget = getRandomInteger(500, 1000);
    public double backlog = 100; 
    
    
    
}

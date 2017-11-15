package hakathon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class Team {
    double primarySkill = 0;
    double secondarySkill = 0;
    double genderMix;
    double teamSatisfaction = 100;
    double teamVelocity = 0;
    double teamMotivation;
    Member[] chosenMembers = new Member[8];
    int teamSize = 0;
    Events event = new Events();
    
    void getMotivation(){
        for(int i = 0; i < teamSize; i++)
            teamMotivation += chosenMembers[i].motivationLevel;
        teamMotivation = teamMotivation/teamSize;
        
    }
    void addMember( Member x) {
        chosenMembers[teamSize] = x;
        teamSize++;
    }
    
    void getVelocity() {
        for(int i = 0; i < teamSize; i++)
            teamVelocity += chosenMembers[i].velocity;
        
    }
    
    double estimateWeekComplet(int backlogSize) {
        return backlogSize / teamVelocity;
    }
    
    void getPrimarySkill() {
        for( int i = 0; i < teamSize; i++) {
            primarySkill += chosenMembers[i].primarySkill;
        }
        primarySkill = (2 * primarySkill / 3 * teamSize) * 100;
    }
    
    void getSecondarySkill() {
        for( int i = 0; i < teamSize; i++) {
            secondarySkill += chosenMembers[i].secondarySkill;
        }
        secondarySkill = (1 * secondarySkill / 3 * teamSize) * 100;
    }

    
}

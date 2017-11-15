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
public class Events {
    
    void sprint(Team t, double customerSatisfaction,int question, int response) {
        switch(question) {
            case 1:
                switch(response) {
                    case 1:
                        break;
                    case 2:
                       for(int i = 0; i < t.teamSize; i++){
                           t.chosenMembers[i].velocity *= 0.95;
                       }
                       t.getVelocity();
                        break;
                    case 3:
                        for(int i = 0; i < t.teamSize; i++){
                           t.chosenMembers[i].velocity *= 0.9;
                       }
                       t.getVelocity();
                        break;
                }
                break;
        }
    }
    
    void endSprint(Team t, Project pr, int procent){
        if(t.teamSatisfaction < 0.7){
            FinalGameNow fg = new FinalGameNow();
            fg.setVisible(true);
        }
            if(pr.initialCustomerSatisfation < 0.7){
                FinalGameNow fg = new FinalGameNow();
                fg.setVisible(true);
            }
                if(pr.initialProjectBudget < -1000){
                    FinalGameNow fg = new FinalGameNow();
                    fg.setVisible(true);
                }
        pr.backlog = pr.backlog*(100 - procent)/100;
    }
    
    void endGame(Team t, Project pr){
        if(pr.backlog < 15 && t.teamSatisfaction > 85 &&
                pr.initialCustomerSatisfation > 90
                && pr.initialProjectBudget > 0){
            HappyFinal hf = new HappyFinal();
            hf.setVisible(true);
        }
        FinalGameNow fg = new FinalGameNow();
        fg.setVisible(true);
        
           
    }
    
    void sprintReviewUnexpected(Team t, double customerSatisfaction,int question, int response) {
        switch(question) {
            case 1:
                switch(response) {
                    case 1:
                        break;
                    case 2:
                        customerSatisfaction *= 0.95 ;
                        break;
                    case 3:
                        customerSatisfaction *= 1.05;
                        break;
                }
                break;
        }
    }
    
    void sprintRetrospectiveUnexpected(Team t, double customerSatisfaction,int question, int response) {
        switch(question) {
            case 1:
                switch(response) {
                    case 1:
                        customerSatisfaction *= 1.03;
                        break;
                    case 2:
                        t.teamSatisfaction *= 0.95 ;
                        break;
                    case 3:
                        t.teamSatisfaction *= 1.05;
                        break;
                }
                break;
        }
    }
    
    void sprintPlanningEvents(Team t, double customerSatisfaction,int question, int response) {
        switch(question) {
            case 1:
                switch(response) {
                    case 1:
                        break;
                    case 2:
                        customerSatisfaction *= 0.97;
                        break;
                    case 3:
                        t.teamSatisfaction *= 0.97;
                        customerSatisfaction *= 0.97;
                        break;
                }
                break;
        }
    }
    
    void dailyScrumUnexpectedEvents(Team t, double customerSatisfaction,int question, int response) {
        switch(question) {
            case 1:
                switch(response) {
                    case 1:
                        t.teamSatisfaction *= 1.02;
                        break;
                    case 2:
                        t.teamSatisfaction *= 0.98;
                        t.teamVelocity *= 0.95;
                        break;
                    case 3:
                        t.teamVelocity *= 0.95;
                        break;
                }
                break;
        }
    }
    
    boolean genderPenalty(Team t) {
        int count = 0;
        for(int i = 0; i < t.teamSize; i++) {
            if(t.chosenMembers[i].gender == 1)
                count ++;
        }
        double perc = count*100 / t.teamSize;
        if(perc < 40 || perc > 60) {
           for(int i = 0; i < t.teamSize; i++){
               t.chosenMembers[i].velocity *= 0.8;
           }
           t.getVelocity();
            return true;
        }
        return false;
    }
    
    boolean sizePenalty(Team t) {
        if(t.teamSize >= 8){
            for(int i = 0; i < t.teamSize; i++){
               t.chosenMembers[i].velocity *= 0.8;
           }
           t.getVelocity();
        }
        
        else if(t.teamSize == 7){
              for(int i = 0; i < t.teamSize; i++){
               t.chosenMembers[i].velocity *= 0.85;
           }
           t.getVelocity();
        }
            
            else if(t.teamSize == 6){
                  for(int i = 0; i < t.teamSize; i++){
               t.chosenMembers[i].velocity *= 0.9;
           }
           t.getVelocity();
            }
                   
                else if(t.teamSize == 5){
                      for(int i = 0; i < t.teamSize; i++){
               t.chosenMembers[i].velocity *= 0.95;
           }
           t.getVelocity();
                }
                   
        if(t.teamSize >= 5)
            return true;
        else return false;
    }
    
    
    
}

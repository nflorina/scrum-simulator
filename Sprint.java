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
public class Sprint {
    String Sprint_Planning;
    String Daily_Scrum;
    String Sprint_Review;
    String Sprint_Retrospective;
    String Sprint_Size;
    int Sprint_Type;
    
    public Sprint(int type, int s_size){
        if(type==1){
            Sprint_Planning="on time";
            Daily_Scrum = "Done";
            Sprint_Review="Perfect";
            Sprint_Retrospective="Excellent";
            Sprint_Type=1;
        }
        if(type==2){
            Sprint_Planning="Delayed a few days.";
            Daily_Scrum = "Some tasks are undone";
            Sprint_Review="Could use some improvements";
            Sprint_Retrospective="Good";
            Sprint_Type=2;
        }
        if(type==3){
            Sprint_Planning="Seriously delayed";
            Daily_Scrum = "Half of the tasks are undone";
            Sprint_Review="Bad";
            Sprint_Retrospective="Bad";
            Sprint_Type=3;
        }
    }
    
     void HowTeamChangeDuringSprint(Team t){
         if(Sprint_Type==1){
             for(int i=0;i<t.teamSize;i++){
                 t.chosenMembers[i].velocity--;
                 t.chosenMembers[i].motivationLevel -=10;
             }
                 t.getVelocity();
         }
         
         if(Sprint_Type==2){
             for(int i=0;i<t.teamSize;i++){
                 t.chosenMembers[i].velocity-=2;
                 t.chosenMembers[i].motivationLevel -=20;
             }
                 t.getVelocity();
         }
         
         if(Sprint_Type==3){
             for(int i=0;i<t.teamSize;i++){
                 t.chosenMembers[i].velocity-=3;
                 t.chosenMembers[i].motivationLevel -=30;
             }
                 t.getVelocity();
         }
     
             
             
     }
    
}

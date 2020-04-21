package ProjectConway;

public class Rule {
    int team;
    int[] keep;
    int[] spawn;
    
    /*
    Constructor method
    Pre: N/A
    Post: New Boid type has been created
    Save the conditions of a new boid type
    */
    Rule(int team, int[] keep, int[] spawn){
        this.team = team;
        this.keep = keep;
        this.spawn = spawn;
    }    
}

package ProjectConway;

public class Rule {
    int team;
    int[] keep;
    int[] spawn;
    
    public Rule Rule(int team, int[] keep, int[] spawn){
        this.team = team;
        this.keep = keep;
        this.spawn = spawn;
        return this;
    }    
}


package ProjectConway;

public class Board {
    Boid[] stuff;
    Rule[] rules;
    
    public Board(Boid[] data, Rule[] rules){
        this.stuff = data;
        this.rules = rules;
    }
    
    public void massUpdate(){
        for(Boid boid:this.stuff){
            boid.update(this.stuff, this.rules);
        }
        for(Boid boid:this.stuff){
            boid.fix();
        }
    }
}

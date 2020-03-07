
package ProjectConway;

public class Board {
    Boid[] stuff;
    
    public Board(Boid[] data){
        this.stuff = data;
    }
    
    public void massUpdate(Rule[] rules){
        for(Boid boid:this.stuff){
            boid.update(this.stuff, rules);
        }
        for(Boid boid:this.stuff){
            boid.fix();
        }
    }
}

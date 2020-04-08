
package ProjectConway;

public class Board {
    Boid[] stuff;
    Rule[] rules;
    
    /*
    Constructor method
    Pre: N/A
    Post: Rules and boids have been saved
    Save the instance variables of the project
    */
    public Board(Boid[] data, Rule[] rules){
        this.stuff = data;
        this.rules = rules;
    }
    
    /*
    MassUpdate method
    Pre: All boids have been updated
    Post: Do it again
    Update boids repeatedly
    */
    public void massUpdate(){
        for(Boid boid:this.stuff){
            boid.update(this.stuff, this.rules);
        }
        for(Boid boid:this.stuff){
            boid.fix();
        }
    }
}


package ProjectConway;

public class Boid {
    
    int[] pos;
    int state;
    int territory;
    
    /*
    Constructor method
    Pre: Previous boid has been updataed
    Post: New boids data is saved
    Save the instance variables of a new boid
    */
    public Boid Boid(int[] pos){
        this.pos = pos;
        this.state = 0;
        this.territory = 0;
        return this;
    }

    void update() {
    }
}

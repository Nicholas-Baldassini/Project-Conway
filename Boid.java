
package ProjectConway;

public class Boid {
    
    int x;
    int y;
    int state;
    int territory;
    
    /*
    Constructor method
    Pre: Previous boid has been updataed
    Post: New boids data is saved
    Save the instance variables of a new boid
    */
    public Boid Boid(int[] data){
        this.x = data[0];
        this.y = data[1];
        this.state = data[2];
        this.territory = data[3];
        return this;
    }

    void update() {
    }
}

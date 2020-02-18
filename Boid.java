
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
    public Boid(int[] data){
        this.x = data[0];
        this.y = data[1];
        this.state = data[2];
        this.territory = data[3];
    }
    
    /*
    SAVE method
    Pre: Update has been called
    Post: Data has been sent to the required list
    Send instance variables to a new place
    */
    public int[] Save(){
        int[] data = {this.x, this.y, this.state, this.territory};
        return data;   
    }

    void update() {
    }
}

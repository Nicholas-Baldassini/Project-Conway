
package ProjectConway;

import java.util.Arrays;

public class Boid {
    
    int x;
    int y;
    int state;
    int newstate;
    int territory;
    
    /*
    Constructor method
    Pre: Previous boid has been updataed
    Post: New boids data is saved
    Save the instance variables of a new boid
    */
    public Boid Boid(int x, int y){
        this.x = x;
        this.y = y;
        this.state = 0;
        this.newstate = 0;
        this.territory = 0;
        return this;
    }

    void update(Boid[] check, Rule[] rules) {
        int[] count = new int[rules.length];
        for (Boid b : check) {
            if (b.state != 0 && b.x-1 <= this.x && this.x <= b.x+1 && b.y-1 <= this.y && this.y <= b.y+1) {
                if (b.x != this.x || b.y != this.y){
                    count[0] += 1;
                    count[b.state] += 1;
                }
            }
        }
        if (Arrays.binarySearch(rules[this.state].keep, count[0]) == -1){
            this.newstate = 0;
        }
        if (this.state == 0 && count[0] > 0){
            for (int q = 0; q<rules.length; q++){
                if (Arrays.binarySearch(rules[q].spawn, count[0]) != -1 && count[q] >= count[0]/2){
                    this.newstate = q;
                    break;
                }
            }
        }
    }
    
    void fix(){
        this.state = this.newstate;
    }
}

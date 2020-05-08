
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
    Pre: N/A
    Post: New boids data is saved
    Save the instance variables of a new boid
    */
    Boid(int x, int y){
        this.x = x;
        this.y = y;
        this.state = 0;
        this.newstate = 0;
        this.territory = 0;
    }
    
    /*
    Update method
    Pre: Boid has been asked to update
    Post: Boid knows what it will do next
    Check the surrounding of a boid
    */
    void update(Boid[] check, Rule[] rules) {
        int[] count = new int[rules.length + 1];
        
        for (int c = 0; c < count.length; c++) {
            count[c] = 0;
        }
        
        for (Boid b : check) {
            if (b.state != 0 && b.x-1 <= this.x && this.x <= b.x+1 && b.y-1 <= this.y && this.y <= b.y+1) {
                if (b.x != this.x || b.y != this.y){
                    count[0] += 1;
                    count[b.state] += 1;
                }
            }
        }
        if (this.state != 0){
            if (Arrays.binarySearch(rules[this.state-1].keep, count[0]) < 0){
                this.newstate = 0;
            }
        }
        if (this.state == 0 && count[0] > 0){
            for (int q = 0; q<rules.length; q++){
                if (Arrays.binarySearch(rules[q].spawn, count[0]) > -1 && count[q + 1] > count[0]/2){
                    this.newstate = rules[q].team;
                    break;
                }
            }
        }
    }
    
    /*
    Fix method
    Pre: Boid knows what it will do next
    Post: Boid has done the next thing
    Update the status of a boid
    */
    void fix(){
        this.state = this.newstate;
        if (this.newstate != 0) {
            this.territory = this.newstate;
        }
    }

    void tUpdate(Boid boid) {
        if (this.y == boid.y && boid.territory == 1 && this.territory == 0){
            this.territory = 1;
        }
    }
}

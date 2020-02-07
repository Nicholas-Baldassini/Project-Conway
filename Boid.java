
package ProjectConway;

public class Boid {
    
    int x;
    int y;
    int state;
    int territory;
    
    public Boid(int[] data){
        this.x = data[0];
        this.y = data[1];
        this.state = data[2];
        this.territory = data[3];
    }
    
    public void Save(){
        
    }
}

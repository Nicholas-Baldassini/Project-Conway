
package ProjectConway;

public class Board {
    Boid[] stuff;
    
    public Board(Boid[] data){
        this.stuff = data;
    }
    
    public void massUpdate(){
        for(Boid boid:this.stuff){
            boid.update();
        }
    }
}

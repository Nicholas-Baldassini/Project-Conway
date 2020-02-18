
package ProjectConway;

public class Board {
    int[][] stuff;
    
    public Board(int[][] data){
        this.stuff = data;
    }
    
    public void massUpdate(){
        for(int[] data:this.stuff){
            Boid boid = new Boid(data);
            boid.update();
        }
    }
}

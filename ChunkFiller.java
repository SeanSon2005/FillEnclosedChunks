public class ChunkFiller {
    private int[][] map;
    public ChunkFiller( int[][]map){
        this.map = map;
    }

    public Point update(int newX, int newY){
        map[newX][newY] = 1;
        return new Point(newX, newY);
    }
    
    public int[][] getMap(){
        return this.map;
    }
}

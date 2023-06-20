public class ChunkFiller {
    private Chunk[][] map;
    private boolean[][] visited;
    private int startX;
    private int startY;
    private int height;
    private int length;
    private int loops = 0;
    public ChunkFiller(Chunk[][] chunks, int startX, int startY){
        this.startX = startX;
        this.startY = startY;
        this.map = chunks;
        this.length = chunks[0].length;
        this.height = chunks.length;
        this.visited = new boolean[this.length][this.height];
    }
    public Chunk[][] getResult(){
        System.out.println(loops);
        return map;
    }
    public void run(){
        floodfill(startX, startY, 0);
    }
    public void floodfill(int x, int y, int iter){
        if (x < 0 || y < 0 || x == length || y == height){
            return;
        }
        if (x == startX && y == startY && iter > 2) { //check for loop completion
            loops++;
        }
        if (visited[x][y]){ //do not go to visited chunks
            return;
        }
        visited[x][y] = true;
        if (map[x][y].getVal() == 0) { //only traverse through claimed chunks
            return;
        }
        floodfill(x+1, y, iter+1);
        floodfill(x-1, y, iter+1);
        floodfill(x, y+1, iter+1);
        floodfill(x, y-1, iter+1);
    }
}

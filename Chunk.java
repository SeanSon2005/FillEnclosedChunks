class Chunk{
    private int x; //the x coordinate of a chunk
    private int y; //the y coordinate of a chunk
    private int val; //represents owner of chunk
    public Chunk(int val){
        this.val = val;
    }
    public void setVal(int val){
        this.val = val;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getVal(){
        return this.val;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
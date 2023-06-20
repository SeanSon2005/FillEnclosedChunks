import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

class Main {
  private static int map_length = 10;
  private static int map_height = 10;
  public static void main(String[] args) {
    Chunk[][] map = new Chunk[map_length][map_height];
    try{
      BufferedReader bufferedReader = new BufferedReader(new FileReader("map.in"));
      for(int y = 0; y < map_height; y++){
        String line = bufferedReader.readLine();
        for (int x = 0; x < map_length; x++){
          Chunk temp = map[x][y];
          //temp.setVal(1);
        }
        System.out.println(line);
      }
      bufferedReader.close();
    } catch (Exception e){
      System.out.println("bro what");
    }
  }
  public static void showMap(List<List<Chunk>> map){
    for (List<Chunk> chunkList : map) {
      for (Chunk chunk: chunkList){
        System.out.print(chunk.getVal() + " ");
      }
      System.out.println();
    }
  }
}
import java.io.BufferedReader;
import java.io.FileReader;

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
          map[x][y] = new Chunk(Character.getNumericValue(line.charAt(x)));
        }
      }
      bufferedReader.close();
      showMap(map);
      ChunkFiller filler = new ChunkFiller(map, 2, 1);
      System.out.println("START: " + map[2][1].getVal());
      filler.run();
      showMap(filler.getResult());
    } catch (Exception e){
      System.out.println(e);
    }
  }
  public static void showMap(Chunk[][] map){
    for (int y = 0; y < map_height; y++) {
      for (int x = 0; x < map_length; x++){
        int a = map[x][y].getVal();
        switch(a){
          case 0:
            System.out.print("  ");
            break;
          case 1:
            System.out.print("[]");
            break;
          default:
            break;
        }
      }
      System.out.println();
    }
  }
}
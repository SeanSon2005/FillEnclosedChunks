import java.io.BufferedReader;
import java.io.FileReader;

class Main {
  private static int map_length = 20;
  private static int map_height = 20;
  public static void main(String[] args) {
    int[][] map = new int[map_length][map_height];
    try{
      ChunkFiller filler = new ChunkFiller(map);
      BufferedReader bufferedReader = new BufferedReader(new FileReader("updates.in"));
      while(true){
        String line = bufferedReader.readLine();
        if (line == null){
          break;
        }
        String[] nums = line.split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        filler.update(a, b);
      }
      bufferedReader.close();
      map = filler.getMap();
      showMap(map);
      
    } catch (Exception e){
      System.out.println(e);
    }
  }
  public static void showMap(int[][] map){
    for (int y = 0; y < map_height; y++){ 
      for (int x = 0; x < map_length; x++){
        int a = map[x][y];
        switch(a){
          case 0:
            System.out.print("   ");
            break;
          default:
            System.out.print("[" + map[x][y]+ "]");
            break;
        }
      }
      System.out.println();
    }
  }
}

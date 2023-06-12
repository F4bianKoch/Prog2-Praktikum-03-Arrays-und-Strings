import java.util.Scanner;

public class ShipSalvage {

  private static final char[][] exampleMap = new char[][]
  {
    {'O','O', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    {' ',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    {' ',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    {' ',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    {' ',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    {' ',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    {' ',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    {' ',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    {' ',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    {' ',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
  };

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    FieldState[][] map = getExample();

    while (!allSalvaged(map)) {
      probeField(map, input.next());
      printMap(map, false);
    }

    input.close();
    System.out.println("Alle Schiffe geborgen!");
  } 

  public static FieldState[][] getExample() {
    final FieldState[][] exampleMapFieldState = new FieldState[10][10];
    for (int i = 0; i < exampleMap.length; i ++) {
      for (int j = 0; j < exampleMap[0].length; j++) {
        exampleMapFieldState[i][j] = FieldState.fromOutput(exampleMap[i][j]);
      }
    }

    return exampleMapFieldState;
  }

  public static void checkValidMap(FieldState[][] map) {
    if (map == null)
      throw new IllegalArgumentException("Map cannot be null!");

    for (FieldState[] mapRow : map) {
      if (mapRow == null)
        throw new IllegalArgumentException("Map rows cannot be null!");
      
      if (mapRow.length != 10)
        throw new IllegalArgumentException("Map needs 10 columns!");

      for (FieldState mapColumn : mapRow) {
        if (mapColumn == null) {
          throw new IllegalArgumentException("Map columns cannot be null!");
        }
      }
    }

    if (map.length != 10)
      throw new IllegalArgumentException("Map needs 10 rows");
  }

  public static void printMap(FieldState[][] map, boolean showHidden) {
    checkValidMap(map);   // validate map

    System.out.println("   ABCDEFGHIJ"); 
    System.out.println("+------------+");

    for (int i = 0; i < map.length; i++) {
      if (i + 1 < 10)
        System.out.print((i + 1) + " |");
      else
        System.out.print((i + 1) + "|");

      for (int j = 0; j < map[i].length; j++) {
        char value = map[i][j].getOutput();

        if (showHidden) {
          System.out.print(value);
        } else {
          if (value != 'O')
            System.out.print(value);
          else
            System.out.print(' ');
        }
      }
      
      System.out.print("|\n");
    }

    System.out.println("+-----------+");
  }

  public static boolean allSalvaged(FieldState[][] map) {
    checkValidMap(map);

    for (FieldState[] mapRow : map) {
      for (FieldState mapColumn : mapRow) {
        if (mapColumn == FieldState.OCCUPIED_HIDDEN)
          return false;
      }
    }
    return true;
  }

  public static void probeField(FieldState[][] map, String field) {
    checkValidMap(map);
    String[] chars = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    if(field.matches("([A-J,a-j][1-9])") || field.matches("([A-J,a-j][1][0])")){
      int col = 0;

      for (String character : chars) {
        if (field.toUpperCase().contains(character))
          break;
        col++;
      }

      switch (map[Integer.parseInt(field.substring(1)) - 1][col]) {
        case EMPTY:
          map[Integer.parseInt(field.substring(1)) - 1][col] = FieldState.MISS;
          System.out.println("Nichts zu finden!");
          break;
        case OCCUPIED_HIDDEN:
          map[Integer.parseInt(field.substring(1)) - 1][col] = FieldState.OCCUPPIED_SALVAGED;
          System.out.println("Wrack gefunden!");
          break;
        case OCCUPPIED_SALVAGED:
          map[Integer.parseInt(field.substring(1)) - 1][col] = FieldState.OCCUPPIED_SALVAGED;
          System.out.println("Bereits untersucht!");
          break;
        case MISS:
          map[Integer.parseInt(field.substring(1)) - 1][col] = FieldState.MISS;
          System.out.println("Bereits untersucht!");
          break;
      }

    } else {
      System.out.println("Fehlerhafte Eingabe!");
    }
  }

}

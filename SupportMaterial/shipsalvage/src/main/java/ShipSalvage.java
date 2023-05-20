public class ShipSalvage {

  private static final char[][] exampleMap = new char[][]
  {
    {'O','O', ' ', 'O', ' ', ' ', 'O', 'O', 'O', 'O'},
    {' ',' ', ' ', 'O', ' ', ' ', ' ', ' ', ' ', ' '},
    {'O',' ', ' ', 'O', ' ', 'O', 'O', 'O', ' ', 'O'},
    {'O',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'O'},
    {'O',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    {'O',' ', ' ', ' ', ' ', 'O', ' ', ' ', ' ', 'O'},
    {' ',' ', ' ', ' ', ' ', 'O', ' ', ' ', ' ', 'O'},
    {'O','O', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'O'},
    {' ',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    {' ',' ', ' ', ' ', 'O', 'O', 'O', 'O', 'O', 'O'},
  };

  public static void main(String[] args) {
    printMap(getExample(), true);      
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

    System.out.println(" ABCDEFGHIJ"); 
    System.out.println("+-----------+");

    for (int i = 0; i < map.length; i++) {
      System.out.print(i + "|");

      for (int j = 0; j < map[i].length; j++) {
        char value = map[i][j].getOutput();

        if (showHidden) {
          System.out.print(value);
        } else {
          if (value != '#')
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

}

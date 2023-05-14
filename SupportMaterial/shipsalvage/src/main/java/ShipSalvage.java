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

}

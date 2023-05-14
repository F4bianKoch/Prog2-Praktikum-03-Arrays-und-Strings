import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.*;

public class ShipSalvageTest {

  @Test
  public void testGetExample(){

    FieldState[][] map = ShipSalvage.getExample();

    assertNotNull("example must not be null", map);
    assertEquals("example must have 10 rows", 10, map.length);

    IntStream.range(0,10).forEach(
        i -> assertEquals("row " + i + " must have 10 columns", 10, map[i].length));

    assertEquals("field in row 0 and column 0 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[0][0]);
    assertEquals("field in row 0 and column 1 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[0][1]);
    assertEquals("field in row 0 and column 2 must be EMPTY",           FieldState.EMPTY,           map[0][2]);
    assertEquals("field in row 0 and column 3 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[0][3]);
    assertEquals("field in row 0 and column 4 must be EMPTY",           FieldState.EMPTY,           map[0][4]);
    assertEquals("field in row 0 and column 5 must be EMPTY",           FieldState.EMPTY,           map[0][5]);
    assertEquals("field in row 0 and column 6 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[0][6]);
    assertEquals("field in row 0 and column 7 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[0][7]);
    assertEquals("field in row 0 and column 8 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[0][8]);
    assertEquals("field in row 0 and column 9 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[0][9]);
    assertEquals("field in row 1 and column 0 must be EMPTY",           FieldState.EMPTY,           map[1][0]);
    assertEquals("field in row 1 and column 1 must be EMPTY",           FieldState.EMPTY,           map[1][1]);
    assertEquals("field in row 1 and column 2 must be EMPTY",           FieldState.EMPTY,           map[1][2]);
    assertEquals("field in row 1 and column 3 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[1][3]);
    assertEquals("field in row 1 and column 4 must be EMPTY",           FieldState.EMPTY,           map[1][4]);
    assertEquals("field in row 1 and column 5 must be EMPTY",           FieldState.EMPTY,           map[1][5]);
    assertEquals("field in row 1 and column 6 must be EMPTY",           FieldState.EMPTY,           map[1][6]);
    assertEquals("field in row 1 and column 7 must be EMPTY",           FieldState.EMPTY,           map[1][7]);
    assertEquals("field in row 1 and column 8 must be EMPTY",           FieldState.EMPTY,           map[1][8]);
    assertEquals("field in row 1 and column 9 must be EMPTY",           FieldState.EMPTY,           map[1][9]);
    assertEquals("field in row 2 and column 0 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[2][0]);
    assertEquals("field in row 2 and column 1 must be EMPTY",           FieldState.EMPTY,           map[2][1]);
    assertEquals("field in row 2 and column 2 must be EMPTY",           FieldState.EMPTY,           map[2][2]);
    assertEquals("field in row 2 and column 3 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[2][3]);
    assertEquals("field in row 2 and column 4 must be EMPTY",           FieldState.EMPTY,           map[2][4]);
    assertEquals("field in row 2 and column 5 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[2][5]);
    assertEquals("field in row 2 and column 6 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[2][6]);
    assertEquals("field in row 2 and column 7 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[2][7]);
    assertEquals("field in row 2 and column 8 must be EMPTY",           FieldState.EMPTY,           map[2][8]);
    assertEquals("field in row 2 and column 9 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[2][9]);
    assertEquals("field in row 3 and column 0 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[3][0]);
    assertEquals("field in row 3 and column 1 must be EMPTY",           FieldState.EMPTY,           map[3][1]);
    assertEquals("field in row 3 and column 2 must be EMPTY",           FieldState.EMPTY,           map[3][2]);
    assertEquals("field in row 3 and column 3 must be EMPTY",           FieldState.EMPTY,           map[3][3]);
    assertEquals("field in row 3 and column 4 must be EMPTY",           FieldState.EMPTY,           map[3][4]);
    assertEquals("field in row 3 and column 5 must be EMPTY",           FieldState.EMPTY,           map[3][5]);
    assertEquals("field in row 3 and column 6 must be EMPTY",           FieldState.EMPTY,           map[3][6]);
    assertEquals("field in row 3 and column 7 must be EMPTY",           FieldState.EMPTY,           map[3][7]);
    assertEquals("field in row 3 and column 8 must be EMPTY",           FieldState.EMPTY,           map[3][8]);
    assertEquals("field in row 3 and column 9 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[3][9]);
    assertEquals("field in row 4 and column 0 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[4][0]);
    assertEquals("field in row 4 and column 1 must be EMPTY",           FieldState.EMPTY,           map[4][1]);
    assertEquals("field in row 4 and column 2 must be EMPTY",           FieldState.EMPTY,           map[4][2]);
    assertEquals("field in row 4 and column 3 must be EMPTY",           FieldState.EMPTY,           map[4][3]);
    assertEquals("field in row 4 and column 4 must be EMPTY",           FieldState.EMPTY,           map[4][4]);
    assertEquals("field in row 4 and column 5 must be EMPTY",           FieldState.EMPTY,           map[4][5]);
    assertEquals("field in row 4 and column 6 must be EMPTY",           FieldState.EMPTY,           map[4][6]);
    assertEquals("field in row 4 and column 7 must be EMPTY",           FieldState.EMPTY,           map[4][7]);
    assertEquals("field in row 4 and column 8 must be EMPTY",           FieldState.EMPTY,           map[4][8]);
    assertEquals("field in row 4 and column 9 must be EMPTY",           FieldState.EMPTY,           map[4][9]);
    assertEquals("field in row 5 and column 0 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[5][0]);
    assertEquals("field in row 5 and column 1 must be EMPTY",           FieldState.EMPTY,           map[5][1]);
    assertEquals("field in row 5 and column 2 must be EMPTY",           FieldState.EMPTY,           map[5][2]);
    assertEquals("field in row 5 and column 3 must be EMPTY",           FieldState.EMPTY,           map[5][3]);
    assertEquals("field in row 5 and column 4 must be EMPTY",           FieldState.EMPTY,           map[5][4]);
    assertEquals("field in row 5 and column 5 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[5][5]);
    assertEquals("field in row 5 and column 6 must be EMPTY",           FieldState.EMPTY,           map[5][6]);
    assertEquals("field in row 5 and column 7 must be EMPTY",           FieldState.EMPTY,           map[5][7]);
    assertEquals("field in row 5 and column 8 must be EMPTY",           FieldState.EMPTY,           map[5][8]);
    assertEquals("field in row 5 and column 9 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[5][9]);
    assertEquals("field in row 6 and column 0 must be EMPTY",           FieldState.EMPTY,           map[6][0]);
    assertEquals("field in row 6 and column 1 must be EMPTY",           FieldState.EMPTY,           map[6][1]);
    assertEquals("field in row 6 and column 2 must be EMPTY",           FieldState.EMPTY,           map[6][2]);
    assertEquals("field in row 6 and column 3 must be EMPTY",           FieldState.EMPTY,           map[6][3]);
    assertEquals("field in row 6 and column 4 must be EMPTY",           FieldState.EMPTY,           map[6][4]);
    assertEquals("field in row 6 and column 5 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[6][5]);
    assertEquals("field in row 6 and column 6 must be EMPTY",           FieldState.EMPTY,           map[6][6]);
    assertEquals("field in row 6 and column 7 must be EMPTY",           FieldState.EMPTY,           map[6][7]);
    assertEquals("field in row 6 and column 8 must be EMPTY",           FieldState.EMPTY,           map[6][8]);
    assertEquals("field in row 6 and column 9 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[6][9]);
    assertEquals("field in row 7 and column 0 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[7][0]);
    assertEquals("field in row 7 and column 1 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[7][1]);
    assertEquals("field in row 7 and column 2 must be EMPTY",           FieldState.EMPTY,           map[7][2]);
    assertEquals("field in row 7 and column 3 must be EMPTY",           FieldState.EMPTY,           map[7][3]);
    assertEquals("field in row 7 and column 4 must be EMPTY",           FieldState.EMPTY,           map[7][4]);
    assertEquals("field in row 7 and column 5 must be EMPTY",           FieldState.EMPTY,           map[7][5]);
    assertEquals("field in row 7 and column 6 must be EMPTY",           FieldState.EMPTY,           map[7][6]);
    assertEquals("field in row 7 and column 7 must be EMPTY",           FieldState.EMPTY,           map[7][7]);
    assertEquals("field in row 7 and column 8 must be EMPTY",           FieldState.EMPTY,           map[7][8]);
    assertEquals("field in row 7 and column 9 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[7][9]);
    assertEquals("field in row 8 and column 0 must be EMPTY",           FieldState.EMPTY,           map[8][0]);
    assertEquals("field in row 8 and column 1 must be EMPTY",           FieldState.EMPTY,           map[8][1]);
    assertEquals("field in row 8 and column 2 must be EMPTY",           FieldState.EMPTY,           map[8][2]);
    assertEquals("field in row 8 and column 3 must be EMPTY",           FieldState.EMPTY,           map[8][3]);
    assertEquals("field in row 8 and column 4 must be EMPTY",           FieldState.EMPTY,           map[8][4]);
    assertEquals("field in row 8 and column 5 must be EMPTY",           FieldState.EMPTY,           map[8][5]);
    assertEquals("field in row 8 and column 6 must be EMPTY",           FieldState.EMPTY,           map[8][6]);
    assertEquals("field in row 8 and column 7 must be EMPTY",           FieldState.EMPTY,           map[8][7]);
    assertEquals("field in row 8 and column 8 must be EMPTY",           FieldState.EMPTY,           map[8][8]);
    assertEquals("field in row 8 and column 9 must be EMPTY",           FieldState.EMPTY,           map[8][9]);
    assertEquals("field in row 9 and column 0 must be EMPTY",           FieldState.EMPTY,           map[9][0]);
    assertEquals("field in row 9 and column 1 must be EMPTY",           FieldState.EMPTY,           map[9][1]);
    assertEquals("field in row 9 and column 2 must be EMPTY",           FieldState.EMPTY,           map[9][2]);
    assertEquals("field in row 9 and column 3 must be EMPTY",           FieldState.EMPTY,           map[9][3]);
    assertEquals("field in row 9 and column 4 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[9][4]);
    assertEquals("field in row 9 and column 5 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[9][5]);
    assertEquals("field in row 9 and column 6 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[9][6]);
    assertEquals("field in row 9 and column 7 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[9][7]);
    assertEquals("field in row 9 and column 8 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[9][8]);
    assertEquals("field in row 9 and column 9 must be OCCUPIED_HIDDEN", FieldState.OCCUPIED_HIDDEN, map[9][9]);

  }

  @Test
  public void testCheckValidMap(){

    assertThrows("must throw IllegalStateException on null", 
        IllegalArgumentException.class,
        () -> ShipSalvage.checkValidMap(null));

    assertThrows("must throw IllegalStateException on map with rows not equals to 10", 
        IllegalArgumentException.class,
        () -> ShipSalvage.checkValidMap(new FieldState[8][10]));

    assertThrows("must throw IllegalStateException on map with columns not equals to 10", 
        IllegalArgumentException.class,
        () -> ShipSalvage.checkValidMap(new FieldState[10][13]));

    assertThrows("must throw IllegalStateException on map with a null row ", 
        IllegalArgumentException.class,
        () -> {
          FieldState[][] map = new FieldState[10][10];
          map[4] = null;
          ShipSalvage.checkValidMap(map);
        });

    assertThrows("must throw IllegalStateException on map with a row having not 10 columns", 
        IllegalArgumentException.class,
        () -> {
          FieldState[][] map = new FieldState[10][10];
          map[4] = new FieldState[3];
          ShipSalvage.checkValidMap(map);
        });

    assertThrows("must throw IllegalStateException on map with a null entry", 
        IllegalArgumentException.class,
        () -> {
          FieldState[][] map = new FieldState[10][10];
          map[4][2] = null;
          ShipSalvage.checkValidMap(map);
        });
  }

  @Test
  public void testAllSalvaged(){

    FieldState[][] map = new FieldState[10][10];

    for (int row = 0; row < 10; row++){
      for (int col = 0; col < 10; col++){
        map[row][col] = FieldState.EMPTY;
      }
    }

    assertTrue("must return true on an empty field",
        ShipSalvage.allSalvaged(map));

    map[5][5] = FieldState.OCCUPIED_HIDDEN;

    assertFalse("must return false on a field with hidden ships",
        ShipSalvage.allSalvaged(map));

    map[8][2] = FieldState.MISS;
    assertFalse("must return false on a field with hidden ships and missed fields",
        ShipSalvage.allSalvaged(map));

    map[5][5] = FieldState.OCCUPPIED_SALVAGED;
    assertTrue("must return true on a field with salvaged ships and missed fields",
        ShipSalvage.allSalvaged(map));

  }

  @Test
  public void testProbeFieldValid(){
    FieldState[][] original = ShipSalvage.getExample();
    FieldState[][] map = ShipSalvage.getExample();

    ShipSalvage.probeField(map, "A1");
    original[0][0] = FieldState.OCCUPPIED_SALVAGED;
    assertTrue("field A1 must be changed to OCCUPPIED_SALVAGED",
        Arrays.deepEquals(original, map));

    ShipSalvage.probeField(map, "c4");
    original[3][2] = FieldState.MISS;
    assertTrue("field c1 must be changed to MISS",
        Arrays.deepEquals(original, map));

  }

  @Test
  public void testProbeFieldInvalid(){

    FieldState[][] original = ShipSalvage.getExample();
    FieldState[][] map = ShipSalvage.getExample();

    // test invalid inputs
    ShipSalvage.probeField(map, "");

    assertTrue("must not change map on empty input",
        Arrays.deepEquals(original, map));

    ShipSalvage.probeField(map, "   \t \t");

    assertTrue("must not change map on blank input",
        Arrays.deepEquals(original, map));

    String[] invalidInputs = {"C", "5", "AVier", "B0", "B11", "P9", "A9A", "G  8", "   A2", "E9    "};
    for (String invalidInput : invalidInputs){
    
        ShipSalvage.probeField(map, invalidInput);

        assertTrue("must not change map on "+invalidInput,
            Arrays.deepEquals(original, map));

    }


  }



  
}

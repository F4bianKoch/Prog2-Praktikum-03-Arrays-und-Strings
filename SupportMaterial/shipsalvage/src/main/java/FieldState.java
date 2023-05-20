import com.google.common.cache.Cache;

public enum FieldState {
    // initialize Field States
    EMPTY(' '),
    MISS('X'),
    OCCUPIED_HIDDEN('O'),
    OCCUPPIED_SALVAGED('#');

    private final char output;
    
    private FieldState(char output) {
        this.output = output;
    }

    public static FieldState fromOutput(char output) {
        try {
            // find corrisponding FieldState to output
            for (FieldState state : FieldState.values()) {
                if (state.output == output)
                    return state;
            }
        } catch (Exception e) { // TODO: Specific exception
            e.printStackTrace();
            // TODO: IllegalArgumentException
        } 
        return null;
    }

    public char getOutput() {
        return output;
    }

}

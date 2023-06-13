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
        // find corrisponding FieldState to output
        for (FieldState state : FieldState.values()) {
            if (state.output == output)
                return state;
        }
        throw new IllegalArgumentException("No FieldState for: " + output);
    }

    public char getOutput() {
        return output;
    }

}

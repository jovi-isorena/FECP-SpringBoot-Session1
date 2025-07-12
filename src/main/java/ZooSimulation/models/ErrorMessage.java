package ZooSimulation.models;

public enum ErrorMessage {
    INVALID_INPUT("Invalid input. Try again."),
    MISSING_INPUT("All fields are required.");

    private final String description;
    ErrorMessage(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}

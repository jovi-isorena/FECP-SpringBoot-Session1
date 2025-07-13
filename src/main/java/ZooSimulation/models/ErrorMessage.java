package ZooSimulation.models;

public enum ErrorMessage {
    INVALID_INPUT("Invalid input. Try again."),
    MISSING_INPUT("Input cannot be empty."),
    NON_NUMERIC("Input must be numerical."),
    NEGATIVE_NUMBER("Cannot be less than 0."),
    INCORRECT_LOGIN("Incorrect username or password."),
    HANDLER_NOT_FOUND("Handler not found."),
    VENDOR_NOT_FOUND("Vendor not found."),
    PERSON_ALREADY_EXISTS("Person is already assigned to a role."),
    PRODUCT_ALREADY_EXISTS("Product is in the list."),
    EMPTY_SHOP("No available products."),
    HOSPITAL_NOT_FOUND("Hospital is not established.");

    private final String description;
    ErrorMessage(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}

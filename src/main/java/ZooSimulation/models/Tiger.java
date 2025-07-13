package ZooSimulation.models;

public class Tiger extends Feline {
    public Tiger(String name) {
        super(name); // ✅ this now works correctly
    }

    @Override
    public void makeSound() {
        System.out.println("Grrr!");
    }
}
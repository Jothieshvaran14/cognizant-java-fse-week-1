public class BuilderPatternExample {

    public static void main(String[] args) {

        Computer computer = new Computer.Builder()
                .setCPU("Intel Core i7")
                .setRAM("16 GB")
                .setStorage("512 GB SSD")
                .build();

        computer.display();
    }
}
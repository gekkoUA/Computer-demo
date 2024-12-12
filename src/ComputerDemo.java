public class ComputerDemo {
  public static void main(String[] args) {
      // Creating different types of computers
      Computer pc = new PersonalComputer("Intel Core i7", 8, "Z490", 16, 512, 
                                          "ATX Mid Tower", true);
      Computer laptop = new Laptop("AMD Ryzen 5", 6, "B550", 8, 256, 
                                   15.6, 4500);
      Computer tablet = new Tablet("Apple A14", 6, "M1", 4, 128, 
                                   true, true);

      // Demonstrating polymorphism by calling displaySpecs() method
      System.out.println("Displaying Computer Specifications:");
      pc.displaySpecs();
      System.out.println("\n");
      laptop.displaySpecs();
      System.out.println("\n");
      tablet.displaySpecs();
  }
}
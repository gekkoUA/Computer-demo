public class Laptop extends Computer {
  private double screenSize;
  private int batteryCapacity;

  public Laptop(String processorModel, int processorCores, String chipset, 
                int ramMemory, int storageMemory, 
                double screenSize, int batteryCapacity) {
      super(processorModel, processorCores, chipset, ramMemory, storageMemory);
      this.screenSize = screenSize;
      this.batteryCapacity = batteryCapacity;
  }

  @Override
  public void displaySpecs() {
      System.out.println("Laptop Specifications:");
      System.out.println("Processor: " + processorModel);
      System.out.println("Processor Cores: " + processorCores);
      System.out.println("Chipset: " + chipset);
      System.out.println("RAM: " + ramMemory + " GB");
      System.out.println("Storage: " + storageMemory + " GB");
      System.out.println("Screen Size: " + screenSize + " inches");
      System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
  }
}
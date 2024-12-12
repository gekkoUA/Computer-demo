public class Tablet extends Computer {
  private boolean stylus;
  private boolean cellular;

  public Tablet(String processorModel, int processorCores, String chipset, 
                int ramMemory, int storageMemory, 
                boolean stylus, boolean cellular) {
      super(processorModel, processorCores, chipset, ramMemory, storageMemory);
      this.stylus = stylus;
      this.cellular = cellular;
  }

  @Override
  public void displaySpecs() {
      System.out.println("Tablet Specifications:");
      System.out.println("Processor: " + processorModel);
      System.out.println("Processor Cores: " + processorCores);
      System.out.println("Chipset: " + chipset);
      System.out.println("RAM: " + ramMemory + " GB");
      System.out.println("Storage: " + storageMemory + " GB");
      System.out.println("Stylus Support: " + (stylus ? "Yes" : "No"));
      System.out.println("Cellular Connectivity: " + (cellular ? "Yes" : "No"));
  }
}
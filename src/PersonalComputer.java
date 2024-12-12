public class PersonalComputer extends Computer {
  private String formFactor;
  private boolean dedicatedGPU;

  public PersonalComputer(String processorModel, int processorCores, String chipset, 
                           int ramMemory, int storageMemory, 
                           String formFactor, boolean dedicatedGPU) {
      super(processorModel, processorCores, chipset, ramMemory, storageMemory);
      this.formFactor = formFactor;
      this.dedicatedGPU = dedicatedGPU;
  }

  @Override
  public void displaySpecs() {
      System.out.println("Personal Computer Specifications:");
      System.out.println("Processor: " + processorModel);
      System.out.println("Processor Cores: " + processorCores);
      System.out.println("Chipset: " + chipset);
      System.out.println("RAM: " + ramMemory + " GB");
      System.out.println("Storage: " + storageMemory + " GB");
      System.out.println("Form Factor: " + formFactor);
      System.out.println("Dedicated GPU: " + (dedicatedGPU ? "Yes" : "No"));
  }
}
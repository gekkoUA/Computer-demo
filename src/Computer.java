public abstract class Computer {
    protected String processorModel;
    protected int processorCores;
    protected String chipset;
    protected int ramMemory;
    protected int storageMemory;

    public Computer(String processorModel, int processorCores, String chipset, 
                    int ramMemory, int storageMemory) {
        this.processorModel = processorModel;
        this.processorCores = processorCores;
        this.chipset = chipset;
        this.ramMemory = ramMemory;
        this.storageMemory = storageMemory;
    }

    public abstract void displaySpecs();

    // Getters and setters (same as in previous example)
    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

}
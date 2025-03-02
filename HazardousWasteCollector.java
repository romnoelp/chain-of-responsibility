class HazardousWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Hazardous")) {
            System.out.println("Hazardous waste collected and disposed of safely.");
            return;
        }
        if (nextCollector != null) {
            nextCollector.collectWaste(container);
            return;
        }
        System.out.println("No collector found for this type of waste.");
    }
}

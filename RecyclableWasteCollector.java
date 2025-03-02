class RecyclableWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Recyclable")) {
            System.out.println("Recyclable waste collected and sent for recycling.");
            return;
        }
        if (nextCollector != null) {
            nextCollector.collectWaste(container);
            return;
        }
        System.out.println("No collector found for this type of waste.");
    }
}

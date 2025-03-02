class Main {
    public static void main(String[] args) {
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);

        WasteContainer organicWaste = new WasteContainer("Organic", 50);
        WasteContainer recyclableWaste = new WasteContainer("Recyclable", 40);
        WasteContainer hazardousWaste = new WasteContainer("Hazardous", 30);
        WasteContainer unknownWaste = new WasteContainer("Electronic", 20);

        System.out.println("Processing waste containers.");

        organicCollector.collectWaste(organicWaste);
        organicCollector.collectWaste(recyclableWaste);
        organicCollector.collectWaste(hazardousWaste);
        organicCollector.collectWaste(unknownWaste);
    }
}

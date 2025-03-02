class WasteContainer {
    private final String type;
    private final int capacity;

    public WasteContainer(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

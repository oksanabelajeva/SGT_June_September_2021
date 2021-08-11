package lesson16;

public class Computer {
    private float sizeInches;
    private float weightKg;
    private String color;
    private short capacityRam;
    private float priceEur;

    public Computer() {
        this.sizeInches = 15.4f;
        this.weightKg = 3.2f;
        this.color = "White";
        this.capacityRam = 4;
        this.priceEur = 450.99f;
    }

    public Computer(float sizeInches, float weightKg, String color, short capacityRam, float priceEur) {
        this.sizeInches = sizeInches;
        this.weightKg = weightKg;
        this.color = color;
        this.capacityRam = capacityRam;
        this.priceEur = priceEur;
    }

    public float getSizeInches() {
        return sizeInches;
    }

    public float getWeightKg() {
        return weightKg;
    }

    public String getColor() {
        return color;
    }

    public short getCapacityRam() {
        return capacityRam;
    }

    public float getPriceEur() {
        return priceEur;
    }
}

public class Lasagna {
    int expectedMinutesInOven = 40;
    int expectedPreparationLayerTime = 2;

    public int expectedMinutesInOven() {
        return expectedMinutesInOven;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return this.expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return this.expectedPreparationLayerTime * layers;
    }

    public int totalTimeInMinutes(int layers, int minutesInOven) {
        int preparationTime = this.preparationTimeInMinutes(layers);

        return minutesInOven + preparationTime;
    }
}

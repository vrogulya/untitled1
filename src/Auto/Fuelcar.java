package Auto;

public class Fuelcar extends Car{
    int volumeengine;
    int koefengine = 500;

    public int avaregeFuelcar (int volumeengine) {
        return (volumeengine * koefengine) / 100;
    }






}

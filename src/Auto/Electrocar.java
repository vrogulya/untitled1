package Auto;

public class Electrocar extends Car{
    int powerengine;
    int koefengine = 250;

    public int avaregeElectrocar (int powerengine) {
        return (powerengine * koefengine) / 100;
    }


}

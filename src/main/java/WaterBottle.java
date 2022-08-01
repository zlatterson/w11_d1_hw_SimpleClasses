public class WaterBottle {
    int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void drink() {
        volume -= 10;
    }

    public void empty() {
        volume -= volume;
    }

    public void fill() {
        volume = 100;
    }
}

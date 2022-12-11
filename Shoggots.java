public class Shoggots extends Entity {

    private int IQ_level;
    private double height;
    private double weight;
    private double speed;
    private double obedience;

    public Shoggots(){}
    public Shoggots(int IQ_level, double obedience, double height, double weight){
        this.IQ_level = IQ_level;
    }

    @Override
    public void speak(String message) {
        SpeechManner speechManner1 = SpeechManner.TRUMPET;
        SpeechManner speechManner2 = SpeechManner.MELODIC;
        System.out.println(message);
    }

    public int getIQ_level() {
        return this.IQ_level;
    }

    @Override
    public String work() {
        return "";
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setObedience(double obedience) {
        this.obedience = obedience;
    }

    public double getObedience() {
        return this.obedience;
    }

    public void grow() {
        this.height *= 5;
        this.weight *= 5;
        this.speed += (100 - this.speed) / 2;
        this.IQ_level += (100 - this.IQ_level) / 2;
        System.out.println("Новые шогготы достигли исполинских размеров");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

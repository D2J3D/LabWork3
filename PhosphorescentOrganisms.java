public class PhosphorescentOrganisms implements Luminescent{
    private double brightness;
    public PhosphorescentOrganisms(double brightness){
        this.brightness = brightness;
    }
    @Override
    public void shine(){
        this.brightness *= 10;
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

public class City {
    private String location;
    private double greatness;
    private double size;

    public City(String location, double size, double greatness){
        this.greatness = greatness;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public double getSize() {
        return size;
    }

    public double getGreatness() {
        return greatness;
    }

    public City findGreater(City c1, City c2){
        if (c1.getGreatness() > c2.getGreatness()){
            return c1;
        }
        return c2;
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

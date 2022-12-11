public class Architectures extends Entity{

    private String name;

    public Architectures(String name){
        this.name = name;
    }

    public Architectures(){}
    public String getName(){
        return this.name;
    }

    @Override
    public void speak(String history){
        System.out.println("древние скульпторы рассказывали на своих барельефах о том, "  + history);
        if (history.contains("новый город")){
            SpeechManner speechManner = SpeechManner.EPIC;
            System.out.println("декадентская, упадническая манера речи преображалась, и в ней появлялись характерные эпические черты ");
        }
        else{
            SpeechManner speechManner = SpeechManner.DECADENT;
            System.out.println("рассказывали в декадентской, упаднической манере ");
        }

    }
    @Override
    public String work(){
        return "Барельеф заполнен.";
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

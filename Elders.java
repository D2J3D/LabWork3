public class Elders extends Entity implements ScientificApproachSetter {
    private double IQ_level;

    public double getIQ_level() {
        return this.IQ_level;
    }

    public Elders(double IQ_level) {
        this.IQ_level = IQ_level;
    }

    @Override
    public void speak(String message) {
        SpeechManner speechManner1 = SpeechManner.TRUMPET;
        SpeechManner speechManner2 = SpeechManner.MELODIC;
        System.out.println(message);
    }

    @Override
    public String work() {
        return "Я из расы Старцев, я не работаю!";
    }

    @Override
    public Builders[] setScientificApproach() {
        System.out.print("Подойдя к проблеме научно, ");
        int n = (int) (Math.random() * 10) + 1;
        Builders[] team = hire(n);
        for (int i = 0; i < n; i++) {
            mine(team[i]);
        }
        System.out.println(" и наладили производство особо прочных камней");
        return team;
    }

    public Builders[] hire(int n) {
        Builders[] team = new Builders[n];
        for (int i = 0; i < n; i++) {
            team[i] = new Builders();
        }
        System.out.println("Старцы пригласили из " + team[n - 1].getHomeland() + " опытных строителей, чтобы использовать в работе новейшие технологии");
        return team;
    }

    public void hypnotizeShoggot(Shoggots sh) {
        sh.setObedience(103);
        sh.setSpeed(103);
    }

    public void ruleShoggots(Shoggots sh) {
        if (sh.getIQ_level() < 90.0d) {
            hypnotizeShoggot(sh);
        }
        sh.work();
    }

    public void mine(Builders b) {
        int stonesAmount = (int) (Math.random() * 100);
        b.setInventory((int) (b.getInventory().get("Клеточная масса")), (int) (b.getInventory().get("Протоплазма")), stonesAmount);
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

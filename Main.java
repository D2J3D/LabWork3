public class Main {
    public static void main(String[] args) {
        City capital = new City("Материк", (int) (Math.random() * 2000), 97);
        Architectures a1 = new Architectures();
        Elders e1 = new Elders((int) (Math.random() * 100));
        System.out.print("Когда ");
        a1.speak("как на дне подземного моря закладывали новый город");
        if (e1.getIQ_level() > 10) {
            Builders[] teamBuilders = e1.setScientificApproach();
            Builders b1 = teamBuilders[0];
            b1.showInventory();
            Shoggots sh1 = b1.createShoggot();
            e1.ruleShoggots(sh1);
            City newCity = b1.work();
            System.out.print("И вот " + newCity.getLocation() + " вырос ");
            if (newCity.getSize() > 1000) {
                System.out.print("громадный ");
            } else {
                System.out.print("скромный ");
            }
            System.out.println("город, напоминающий древнюю столицу, а мастерством исполнения ");
            if (newCity.findGreater(newCity, capital).equals(newCity)) {
                System.out.println("превосходивший, ибо " + b1.setScientificApproach());
            } else {
                System.out.print("недотягивающий. ");
            }
            Architectures a2 = new Architectures("бедняга Лейк");
            System.out.println("Со Старцами они изъяснялись, подражая их голосам, мелодичными, трубными звуками, слышными,\nесли правильно предположил" + a2.getName() + ", на большом расстоянии");
            sh1.grow();
            if (sh1.getIQ_level() >= 10){
                System.out.print("и значительного интеллекта, понимая и исполняя приказы с удивительной быстротой.");
            }
            else{
                System.out.print("и отупели.");
            }
            if (sh1.getObedience() != 103){
                // obedience = 103 - критерий загипнотизированности шоггота
                System.out.println("теперь шогготы подчинялись не гипнотическому внушению, а простым командам и были идеально послушны" );
            }
            PhosphorescentOrganisms ph1 = new PhosphorescentOrganisms(10);
            System.out.println("\nФосфоресцирующие организмы полностью обеспечивали Старцев светом,\nкомпенсируя этим утрату полярных сияний -- непременных спутников антарктических ночей.");
        }
        else{
            System.out.println("Потому что им было приятно вспоминать о провалах Старцев.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Home home = new Home("Chui",156);
        Father father=new Father("Себастьян",30,Work.DEVELOPER,home,"Котик");
        System.out.println(father.getInfo());
        father.Work();
        father.Work("father");
        System.out.println("------------------------------------------------------");

        Son son= new Son("ШРЭК",18,Work.STUDENT,home,"Осел","В сарае");
        System.out.println(son.getInfo());
        son.Work();
        System.out.println("------------------------------------------------------");

        Son son1= new Son("Энштейн",20,Work.STUDENT,home,"ламборгини","Хогвартс");
        System.out.println(son1.getInfo());
        son1.Work();

    }
}
public class grandfather {
    private String name;
    private int age;
    private Work work;
    private Home home;

    public Home getHome() {
        return home;
    }

    public grandfather(String name, int age, Work work, Home home) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Work getWork() {
        return work;
    }
    public String getInfo(){
        return "name: " + name + "\nage: "+age+ "\nwork: "+work+ "\nhome: " + home.getStreet()+ home.getAddress();

    }
}

public class Father extends grandfather {
    private String car;

    public Father(String name, int age, Work work, Home home,String car) {
        super(name, age, work, home);
        this.car = car;
    }


    public String getCar() {
        return car;

    }

    public void Work(){
        System.out.printf("DEVELOPER");
    }
    final public String Work(String father){
        return father;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\ncar: "+car;
    }
}

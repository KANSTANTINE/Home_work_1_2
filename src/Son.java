public class Son extends Father{
    private String school;

    public Son(String name, int age, Work work, Home home, String car, String school) {
        super(name, age, work, home, car);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }



    @Override
    public void Work() {
        System.out.println("Учиться");
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nschool: "+school;
    }
}

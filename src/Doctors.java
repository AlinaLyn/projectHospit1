import java.util.Scanner;
public class Doctors {
    String name;
    double receptionHours;


    public Doctors(String name,double receptionHours) {
        this.name = name;
        this.receptionHours=receptionHours;

    }
    void staff(){
        System.out.println("Доброго дня!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReceptionHours() {
        return receptionHours;
    }

    public void setReceptionHours(double receptionHours) {
        this.receptionHours = receptionHours;
    }
    public void earn(int salary){
        System.out.println("Earning int salary: " + salary);
    }

}



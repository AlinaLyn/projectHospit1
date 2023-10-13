import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Patiens client=new Patiens();

       Patiens procedurePreference=new Patiens();
        Scanner p=new Scanner(System.in);
        Scanner p1=new Scanner(System.in);

        Doctors surgeon=new Doctors("Олег",7.00-16.00);
        Doctors cardiologist=new Doctors("Петро",11.00-17.00);
        Doctors rehabilitationSpecialist=new Doctors("Євген",9.00-18.00);
        Doctors endoscopist=new Doctors("Сергій",8.00-16.30);
        Doctors psychiatrist=new Doctors("Володимир",7.00-19.00);
        Doctors oncologist=new Doctors("Вікторія",7.00-19.00);
        Doctors therapist=new Doctors("Галина",7.30-16.30);

        Procedures healthCheck=new Procedures(550.00,0.30);
        Procedures surgeries=new Procedures(5000,3.30);
        Procedures endoscopy=new Procedures(750.00,0.50);
        Procedures electrocardiography=new Procedures(600.00,0.25);
        Procedures rehabilitation=new Procedures(1750,0.47);
        Procedures psychotherapy=new Procedures(1200,1.30);
        Procedures oncology=new Procedures(350,0.20);


        switch (client.chooseProcedure()){
            case 103:
                procedurePreference.preferenceProcedure();
                int choose=p.nextInt();
                switch (choose){
                    case 1:
                 healthCheck.description();
                 System.out.println("Лікар Галина");
                 therapist.staff();
                 healthCheck.findPrice();
                 break;
                    case 2:
                        surgeries.description();
                        System.out.println("Лікар Олег");
                        surgeon.staff();
                        surgeries.findPrice();
                        break;
                    case 3:
                        psychotherapy.description();
                        System.out.println("Лікар Володимир");
                        psychiatrist.staff();
                        psychotherapy.findPrice();
                        break;
                    case 4:
                        endoscopy.description();
                        System.out.println("Лікар Сергій");
                        endoscopist.staff();
                        endoscopy.findPrice();
                        break;
                    case 5:
                        electrocardiography.description();
                        System.out.println("Лікар Петро");
                        cardiologist.staff();
                        electrocardiography.findPrice();
                        break;
                    case 6:
                     rehabilitation.description();
                        System.out.println("Лікар Євген");
                        rehabilitationSpecialist.staff();
                        rehabilitation.findPrice();
                        break;
                    case 7:
                        oncology.description();
                        System.out.println("Лікар Вікторія");
                        oncologist.staff();
                        oncology.findPrice();
                        break;
                }

        }













        System.out.println();
    }
}
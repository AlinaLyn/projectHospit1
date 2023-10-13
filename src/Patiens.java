import java.util.Scanner;
public class Patiens {
    String name;
    String typeOfinjury;
    int age;

    public Patiens() {
        this.name = name;
        this.typeOfinjury = typeOfinjury;
        this.age = age;
    }

    void medicalHistory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я");
        name = scanner.nextLine();
        System.out.println("Введіть хворобу або тип поранення");
        typeOfinjury = scanner.nextLine();
        age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Зверніться будь ласка в дитячу лікарню.");
        }
    }
            int chooseProcedure() {
                System.out.println("Доброго дня!" + name + "з яким захворюванням Ви звертаєтесь?");
                System.out.println("Введіть в систему код '103',щоб побачити перелік");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                System.out.println("" + choice);

                return choice;
            }

           public void preferenceProcedure(){
               System.out.println("Вкажіть потрібне Вам обстеження");
               System.out.println("1.Лабораторні дослідження(загальний аналіз крові/біохімічний аналіз крові/група та резус-фактор крові/аналізи на інфекції/аналізи гормонів та імунологічні тести)");
               System.out.println("2.Зображувальні дослідження(рентгенографія/УЗД/КТ/МРТ/флюрографія)");
               System.out.println("3.Електрокардіографія і дослідження серця");
               System.out.println("4.Ендоскопія(гастроскопія/колоноскопія/бронхоскопія)");
               System.out.println("5.Хірургічні процедури ( операції на серці/видалення апендециту/лапароскопічні операції /ампутації кінцівок/пластична хірургія)");
               System.out.println("6.Лікування інфекцій( інфузії антибіотиків та інших лікарських засобів)");
               System.out.println("7.Постановка діагнозу та консультація лікарів різних спеціалізацій");
               System.out.println("8.Фізіотерапія та реабілітація пацієнтів.");
               System.out.println("9.Психологічна підтримка і психотерапія");
               System.out.println("№: ");
           }

    }







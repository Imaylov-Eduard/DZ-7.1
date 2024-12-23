public class Main {
    public static void main(String[] args) {

        System.out.println("Задача№1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName + ".");

        System.out.println("Задача№2");

        String firstName1 = "Ivan";
        String middleName1 = "Ivanovich";
        String lastName1 = "Ivanov";
        String fullName1 = lastName + " " + firstName + " " + middleName;

        String upperCaseFullName = fullName.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperCaseFullName + ".");

        System.out.println("Задча№3");

        String fullName2 = "Иванов Семён Семёнович";

        String correctedFullName = fullName2.replace("ё", "е").replace("Ё", "Е");

        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFullName + ".");
    }
}
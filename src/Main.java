public class Main {
    public static void main(String[] args) {
//task1
        System.out.println("task1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.join(" ", lastName, firstName, middleName);
        System.out.println("Ф.И.О. сотрудника - " + fullName);
//task2
        System.out.println("task2");
        System.out.println("Ф.И.О. сотрудника для заполнения отчёта - " + fullName.toUpperCase());
//task3
        System.out.println("task3");
        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName);
        System.out.println("Ф.И.О. сотрудника - " + fullName.replace('ё', 'е'));
    }
}
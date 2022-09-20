public class Main {
    public static void main(String[] args) {
// Домашка
        // Задание 1
        String firstName = "Anastasija ";
        String middleName = "Sergeevna";
        String lastName = "Pavlova ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        // Задание 2
        String Super = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + Super);
        // Задание 3
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName1);




    }
}


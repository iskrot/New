public class Main {
    public static void main(String[] args) {
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String fullName = "Ivanov Ivan Ivanovich";
        byte i = 0;
        while (i < fullName.length()) {
            if (fullName.charAt(i) != ' ') {
                lastName = lastName + fullName.charAt(i);
                i++;
            } else {
                i++;
                break;
            }
        }
        while (i < fullName.length()) {
            if (fullName.charAt(i) != ' ') {
                firstName = firstName + fullName.charAt(i);
                i++;
            } else {
                i++;
                break;
            }
        }
        while (i < fullName.length()) {
            if (fullName.charAt(i) != ' ') {
                middleName = middleName + fullName.charAt(i);
                i++;
            }
        }
        System.out.println("Ф. И. О. сотрудника — " + firstName + " " + middleName + " " + lastName);

        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName);

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}
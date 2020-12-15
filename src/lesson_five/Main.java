package lesson_five;
public class Main {

    public static void main(String[] args) {
        getEmployee(new Employee[]{new Employee("John Smith", "Engineer", "jsmith@mail.com", "89786660000", 10000, 40),
                new Employee("Elton John", "Musician", "eljohnh@mail.com", "89786660001", 100000, 73),
                new Employee("Mister Smith", "Villain", "m.smith.matrix@mail.com", "89786660002", 150000, 41),
                new Employee("Noname Carpenter", "Actor", "ncarpenter@mail.com", "89786660003", 120000, 35),
                new Employee("Michael Java", "Programmer", "mjava@mail.com", "89786660004", 75000, 42)},
                40);
    }

    public static void getEmployee(Employee[] arr, int age){
        for (Employee em: arr) {
            if (em.getAge() > age){
                em.getEmployeeInfo();
            }
        }
    }
}

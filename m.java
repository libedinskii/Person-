public class Main {
    public static void main(String[] args) {
        // Создание объекта класса Person
        Person person = new Person();

        // Установка значения имени
        person.setName("John Doe");

        // Установка значения возраста
        person.setAge(10);

        // Получение значения имени и возраста
        String name = person.getName();
        int age = person.getAge();

        // Вывод значений на консоль
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

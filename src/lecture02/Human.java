package lecture02;

public class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        if (age >= 12 && age <= 18) {
            System.out.print("生徒:" + name + " " + age + "歳です。");
        } else if (age <= 22) {
            System.out.print("学生:" + name + " " + age + "歳です。");
        } else {
            System.out.print("生徒or学生ではない");
        }
    }
}


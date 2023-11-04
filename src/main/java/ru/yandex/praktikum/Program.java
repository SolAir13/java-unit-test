package ru.yandex.praktikum;

public class Program {
    public static void main(String[] args) {
        Program age = new Program();
        age.checkIsAdult(17);

    }

    public boolean checkIsAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }//проверка возраста
}

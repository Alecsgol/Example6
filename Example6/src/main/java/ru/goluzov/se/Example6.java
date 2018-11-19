package ru.goluzov.se;

import ru.goluzov.se.Cat;
import ru.goluzov.se.Animal;
import ru.goluzov.se.Dog;
    /**
     * 1. Создать классы Собака и Кот с наследованием от класса Животное.
     * 2 Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве
     * параметра каждому методу передается величина, означающая или длину препятствия (для
     * бега и плавания), или высоту (для прыжков).
     * 3 У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
     * прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
     * 4 При попытке животного выполнить одно из этих действий, оно должно сообщить результат в
     * консоль. (Например, dog1.run(150); -> результат: run: true)
     */
    public class Example6 {
        public static void main(String[] args) {
            Animal cat = new Cat();
            Animal dog = new Dog();
            System.out.printf("%s run: %s\n", cat.getClass().getSimpleName(), cat.run(201));
            System.out.printf("%s run: %s\n", dog.getClass().getSimpleName(), dog.run(400));
            System.out.printf("%s jump: %s\n", cat.getClass().getSimpleName(), cat.jump(1));
            System.out.printf("%s jump: %s\n", dog.getClass().getSimpleName(), dog.jump(0.5));
            System.out.printf("%s swim: %s\n", cat.getClass().getSimpleName(), cat.swim(201));
            System.out.printf("%s swim: %s\n", dog.getClass().getSimpleName(), dog.swim(3));

        }
    }


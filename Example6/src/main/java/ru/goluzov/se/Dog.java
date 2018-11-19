package ru.goluzov.se;

import ru.goluzov.se.Animal;

public class Dog extends Animal {
    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 500);
    }
    @Override
    public boolean jump(double jump) {
        return (jump > 0 && jump <= 1);
    }
    @Override
    public boolean swim(double swim) {
        return (swim > 0 && swim <= 10);
    }
}
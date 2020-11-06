package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(getHealth() - 30);
    }

}

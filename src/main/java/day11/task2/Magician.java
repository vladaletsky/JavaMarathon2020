package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {


    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(getHealth() - 20);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(getHealth() - 5);
    }
}

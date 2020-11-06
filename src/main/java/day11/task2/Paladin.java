package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(getHealth() + 10);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(getHealth() - 15);
    }
}

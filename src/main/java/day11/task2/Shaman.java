package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(getHealth() + 30);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(getHealth() - 15);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(getHealth() - 10);
    }
}

public class Hero extends Character {
@Override
    public void move() {
        System.out.println("MoveHero!!");
    }
    public void move(String Pointing) {
        System.out.println("MoveHeroContinuously" + Pointing);
    }
}
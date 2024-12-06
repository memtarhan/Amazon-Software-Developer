public class Penguin extends Animal implements Swim, Walk {
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin() {
        super("Penguin");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }


    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void swimming() {
        String text = "Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour";
        System.out.println(text);
    }

    @Override
    public void walking() {
        String text = "Penguin: I am walking at the speed " + walkSpeed + " mph";
        System.out.println(text);
    }
}

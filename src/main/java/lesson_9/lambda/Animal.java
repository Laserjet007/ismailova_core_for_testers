package lesson_9.lambda;
// с помощью функционального программирования отсеявываем нужную информацию в ручную в отличие от предидущего примера с person
public class Animal {            //в классе два показателя
   private String  name;
   private boolean canJump;
   private boolean cunRun;

    public Animal(String name, boolean canJump, boolean cunRun) {
        this.name = name;
        this.canJump = canJump;
        this.cunRun = cunRun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanJump() {
        return canJump;
    }

    public void setCanJump(boolean canJump) {
        this.canJump = canJump;
    }

    public boolean isCunRun() {
        return cunRun;
    }

    public void setCunRun(boolean cunRun) {
        this.cunRun = cunRun;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", canJump=" + canJump +
                ", cunRun=" + cunRun +
                '}';
    }
}

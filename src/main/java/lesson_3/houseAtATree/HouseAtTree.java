package lesson_3.houseAtATree;

public class HouseAtTree<T extends Animal & Flyable> {  //  определим Т  и вместо ифоф определяем через екстендс
    private T master;

    public HouseAtTree(T master) {
        this.master = master;
    }

    public T getMaster() {
        return master;
    }

    public void setMaster(T master) {
        this.master = master;
    }

    public static void main(String[] args) {
        //HouseAtTree<Cat> house = new HouseAtTree();
        //HouseAtTree<Aeroplane> house2 = new HouseAtTree();

        HouseAtTree<Bird> house = new HouseAtTree<>(new Bird());
    }
}

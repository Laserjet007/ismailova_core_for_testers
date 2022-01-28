package lesson_7;
//количество сидений
public class Seat extends CarElement{
    private Integer seatCount; //Integer - потому что джексон работает с сылочными типами

    public Seat(Integer seatCount) {
        this.seatCount = seatCount;
        setName("сидение"); //дописываем наследуестся - extends
    }

    public Seat() {}//вызываем конструктор по умолчанию для джексона

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatCount=" + seatCount +
                "} " + super.toString();
    }
}

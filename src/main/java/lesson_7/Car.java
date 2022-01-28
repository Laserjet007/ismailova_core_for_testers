package lesson_7; //обьекты превращаем в джесон что бы превращать затем их в обьектики


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//вариант второй:если нужно, при преобразовании джейсона, проигнорировать класс кар  то можно добавить анотацию прямо под классом - @JsonIgnoreProperties(ignoreUnknown = true) (выбросить файл year из проверки)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {   //задаем цвет и тип
    private String color;
    @JsonProperty("model")//для того что бы из model прочитать type не изменяя кода, в примере с рефакторингом, ставим анотацию @JsonProperty (теперь библиотека джексона будет понимать что тайп это подель)
    private String type;
    private Seat seat;

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Car(String color, String type) { //делаем конструктор
        this.color = color;
        this.type = type;
    }

    public Car()
    {    //делаем дефолтный конструктор так как переделать обьект кар обратно в джейсон не получится... а дальше сетерами все проставится
    }

    public String getColor() {// геторы и сеторы
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", seat=" + seat +
                '}';
    }
}

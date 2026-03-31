package likelion;

public class Juice extends Beverage {

    private int vitaminC;

    public Juice(String name, int price,
                       int stock, int vitaminC) {
        super(name, price, stock);
        this.vitaminC = vitaminC;
    }

    @Override
    public void displayInfo() {
        System.out.println("이름: "   + getName());    // getter 사용
        System.out.println("가격: "   + getPrice() + "원");
        System.out.println("재고: "   + getStock() + "개");
        System.out.println("비타민C: " + vitaminC + "mg");
    }
}

package 객체지향생활체조_9원칙.No3;

public class Example {
    private final int money;

    public Example(int money) {
        validateMoney(money);
        this.money = money;
    }

    private void validateMoney(int money) {
        if (money < 0) {
            System.out.println("잘못된 금액입니다.");
        }
    }

    public int getMoney() {
        return money;
    }
}

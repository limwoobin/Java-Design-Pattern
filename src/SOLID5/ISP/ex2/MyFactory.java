package SOLID5.ISP.ex2;

public class MyFactory implements Factory {

    @Override
    public void createVulture() {
        System.out.println("벌쳐 생산");
    }

    @Override
    public void createTank() {
        System.out.println("탱크 생산");
    }
}

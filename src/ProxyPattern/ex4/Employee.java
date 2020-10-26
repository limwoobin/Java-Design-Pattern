package ProxyPattern.ex4;

public interface Employee {
    String getName();           // 구성원 이름
    Grade getGrade();           // 구성읜 직책
    String getInformation(Employee viewer);    // 인사정보
}

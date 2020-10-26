package ProxyPattern.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        Employee CTO = new NormalEmployee("CTO MAN" , Grade.VicePresident);
        Employee CFO = new NormalEmployee("CFO MAN" , Grade.VicePresident);
        Employee devManager = new NormalEmployee("Dev Man" , Grade.Manager);
        Employee devStaff = new NormalEmployee("Staff Man" , Grade.Staff);

        List<Employee> employees = Arrays.asList(CTO , CFO , devManager , devStaff);

        System.out.println("================================================================");
        System.out.println("시나리오1. Staff(Staff Man)가 회사 인원 인사 정보 조회");
        System.out.println("================================================================");

        // 자신의 직급에 관계 없이 모든 직급의 인사 정보를 열람 (문제!!)
        printAllInformationInCompany(devStaff, employees);

        System.out.println("================================================================");
        System.out.println("보호 프록시 서비스를 가동.");
        System.out.println("================================================================");
        List<Employee> protectedEmployees = employees.stream().map(ProtectedEmployee::new).collect(Collectors.toList());

        System.out.println("================================================================");
        System.out.println("시나리오2. Staff(Staff Man)가 회사 인원 인사 정보 조회");
        System.out.println("================================================================");
        printAllInformationInCompany(devStaff, protectedEmployees);

        System.out.println("================================================================");
        System.out.println("시나리오3. Manger(Dev Man)가 회사 인원 인사 정보 조회");
        System.out.println("================================================================");
        printAllInformationInCompany(devManager, protectedEmployees);

        System.out.println("================================================================");
        System.out.println("시나리오4. VicePresident(CTO Man)가 회사 인원 인사 정보 조회");
        System.out.println("================================================================");
        printAllInformationInCompany(CTO, protectedEmployees);
    }


    public static void printAllInformationInCompany(Employee viewer, List<Employee> employees) {
        employees.stream().map(employee -> employee.getInformation(viewer)).forEach(System.out::println);
    }
}

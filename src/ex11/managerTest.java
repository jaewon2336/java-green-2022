package ex11;

class Employee {
    public String name; // 이름 : 공용 멤버
    String address; // 주소 : 패키지 멤버
    protected int salary; // 월급 : 보호 멤버
    // 수퍼 클래스에서 private로 정의된 멤버는 서브 클래스에서 접근할 수 없다.
    private int RRN; // 주민등록번호 : 전용 멤버

    public String toString() {
        return name + ", " + address + ", " + RRN + ", " + salary;
    }
}

class Manager extends Employee {
    private int bonus;

    public void printSalary() {
        System.out.println(name + " ( " + address + " ) : " + (salary + bonus));
    }

    public void printRRN() {
        // System.out.println(RRN); // 오류! private는 서브 클래스에서 접근 못함!
    }
}

public class managerTest {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.printRRN();
        m.toString();
    }
}

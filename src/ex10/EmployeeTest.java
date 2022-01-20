package ex10;

import java.util.Scanner;

class Employee {
    String name; // 직원의 이름
    String address; // 주소
    int salary; // 연봉
    int phoneNumber; // 전화 번호
    // 각각의 필드에 대하여 getter와 setter 메서드를 작성하라.

    void getAddress(String address) {
        this.address = address;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 크기가 3인 Employee의 배열 employees를 생성한다.
        Employee[] employees = new Employee[3];

        // 3명의 사원 정보를 받아서 각각 Employee 객체를 생성한 후에 배열에 추가하여 본다. 반복루프 사용
        for (int i = 0; i < employees.length; i++) {
            String address = scan.nextLine();
            employees[i] = new Employee();
            // Employee.getAddress(address);
        }

        // employees 배열에 저장된 모든 데이터를 출력한다. 반복 루프를 사용한다.
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}

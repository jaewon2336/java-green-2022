package ex22;

import java.util.ArrayList;

public class CollectionEx01 {
    public static void main(String[] args) {

        // ArrayList는 데이터가 중복되도 되는 데이터 모임
        // 여러개의 데이터가 저장되는 제네릭 박스
        ArrayList<String> datas = new ArrayList<String>();
        datas.add("데이터1");
        datas.add("데이터2");
        datas.add("데이터3");
        datas.add("데이터4");

        // 중간 수정, 삭제
        datas.set(1, "data2");
        datas.remove(3);

        System.out.println(datas.get(0));
        System.out.println(datas.get(1));
        System.out.println(datas.get(2));
        // System.out.println(datas.get(3));
        // datas.sort(datas);  // sort()는 배열을 정렬하는 메서드
        // Collection.sort()를 사용하면 바로 정렬되긴 하지만
        // 우리는 버블정렬을 만들것임
        // 버블정렬, 삽입정렬, 선택정렬, 퀵정렬(★)
    }
}

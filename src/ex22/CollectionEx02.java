package ex22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class MyInteger {
    int num;
}

public class CollectionEx02 {
    public static void main(String[] args) {
        Set<Integer> datas = new HashSet<>();
        // 뒤에 타입 안넣어줘도됨 생략가능
        datas.add(10);
        datas.add(20);
        datas.add(20);
        datas.add(30);
        datas.add(40);

        datas.remove(10);

        // 배열(.length)이랑은 다르게 크기를 알기 위해선 size()를 사용함
        System.out.println(datas.size());
        // datas가 가지고있는 모든 것을 출력
        System.out.println(datas);

        // datas가 가지고 있는 것을 하나씩 보려면 while 사용
        Iterator<Integer> its = datas.iterator();
        while(its.hasNext()) {
            System.out.println(its.next());
        }

    }
}
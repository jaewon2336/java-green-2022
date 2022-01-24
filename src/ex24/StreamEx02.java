package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    // 한자리의 숫자를 받을 수 있다.
    InputStream in = System.in;
    // 내가 캐스팅 안해도 되도록 문자로 바꿔주는 Reader
    // 인풋스트림리더 단점 : 고정된 길이(내가 정한 사이즈)의 문자를 받을 수 있다.
    InputStreamReader ir = new InputStreamReader(in);

    // char[] data = new char[3]; // char 2Byte
    // try
    // {
    // ir.read(data);
    // System.out.println(data);
    // }catch(IOException e)
    // {
    // e.printStackTrace();
    // }
}

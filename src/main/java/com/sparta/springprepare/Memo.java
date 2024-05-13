package com.sparta.springprepare;

import lombok.*;

// lombok, 롬복을 사용하는 방법이다. Getter 와 Setter 를 제작할때 수많은 Getter, Setter 를 만들지 않아도
// lombok을 통해 Getter, Setter를 에너테이션 하면 컴파일파일에서 자동으로 제작해서 추가해 준다.
@Getter
@Setter
@AllArgsConstructor // 생성자를 자동으로 추가해주는 에너테이션
// @NoArgsConstructor // 이건 기본 생성자를 자동으로 추가해주는 에너테이션 이다.
// @AllArgsConstructor 이 에너테이션을 생성하면 컴파일러에서 자동으로 기본 생성자를 생성하지 않으므로 이것을 추가한다.
@RequiredArgsConstructor // final 이 달리는 필드를 가진 생성자를 생성함
public class Memo {
    private final String username;
    private  String contents;


}

class Main{
    public static void main(String[] args) {
        Memo memo = new Memo("김규성");
//        memo.setUsername("조규성");
        System.out.println(memo.getUsername());
    }
}
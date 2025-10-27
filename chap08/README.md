## 인터페이스

#### 인터페이스 선언  // chap08.sec01

<pre>
  <code>
    [public] interface '인터페이스 이름' { }
  </code>
</pre>

#### 상수 필드 선언
##### public static final 은 생략 가능
<pre>
  <code>
    [public static final] 타입 상수이름 = 값;
  </code>
</pre>

#### 추상 메소드 선언
##### public abstract 는 생략 가능
<pre>
  <code>
    [public abstract] 리턴타입 메소드이름(매개변수, ...);
  </code>
</pre>

#### 인터페이스 구현
<pre>
  <code>
    public class 구현클래스이름 implements 인터페이스이름 {
        // 인터페이스에 선언된 추상 메소드의 실체 메소드 선언
    }
  </code>
</pre>

#### 다중 인터페이스 구현 클래스
<pre>
  <code>
    public class 구현클래스이름 implements 인터페이스A, 인터페이스B {
        // 인터페이스 A에 선언된 추상 메소드의 실체 메소드 선언
        // 인터페이스 B에 선언된 추상 메소드의 실체 메소드 선언
    }
  </code>
</pre>

## 상속

### 클래스 상속  // chap07.sec01
<pre>
  <code>
    class [자식클래스] extends [부모클래스]
  </code>
</pre>

#### 부모 메소드 호출
<pre>
  <code>
    super.부모메소드();
  </code>
</pre>

### 타입 변환    // chap07.sec02

#### 자동 타입 변환
<pre>
  부모타입 변수 = 자식타입;
</pre>
#### 강제 타입 변환
<pre>
  자식타입 변수 = (자식타입) 부모타입;
  
  예시
  <code>
    Parent parent = new Child();    // 자동 타입 변환
    Child child = (Child) parent;   // 강제 타입 변환
  </code>
</pre>

#### 객체 타입 확인
<pre>
  <code>
    boolean result = 좌항(객채) instanceof 우항(타입)
  </code>
</pre>


### 추상 클래스와 메소드    // chap07.sec03

#### 추상 클래스 선언
<pre>
  <code>
    public abstract class 클래스 {
        // 필드
        // 생성자
        // 메소드
    }
  </code>
</pre>

#### 추상 메소드
<pre>
  <code>
    [public || protected] abstract 리턴타입 메소드이름(매개변수, ...);
  </code>
</pre>




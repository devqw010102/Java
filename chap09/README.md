## 중첩클래스와 중첩 인터페이스

### 중첩 클래스  // chap09.sec01

#### 1. 인스턴스 멤버 클래스
<pre>
  <code>
    class A {
      class B { ... }
    }
  </code>
</pre>

#### 2. 정적 멤버 클래스
<pre>
  <code>
    class A {
      static class B {... }
    }
  </code>
</pre>

#### 3. 로컬 클래스
<pre>
  <code>
    class A {
      void method() {
        class B { ... }
      }
    }
  </code>
</pre>

### 익명 객체    // chap09.sec02

#### 익명 객체 : 클래스 이름이 없는 객체
##### 상속
<pre>
  <code>
    class A extends Person {
        void wake() { ... }
    }

    public class Anonymous {
        A a = new A();
        Person field = new Person();
    }
  </code>
</pre>

##### 익명객체
<pre>
  <code>
    Person field = new Person() {
      void work() { ...	}
  
      @Override
      void wake() { 
        ...
        work();
      }
    };
  </code>
</pre>

#### 익명 구현 객체 생성
<pre>
  <code>
    인터페이스 [필드 | 변수] = new 인터페이스() {
        // 인터페이스에 선언된 추상 메소드의 실체 메소드 선언
        // 필드
        // 메소드
    }
  </code>
</pre>

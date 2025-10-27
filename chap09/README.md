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
<pre>
  <code>
    ========== 상속 ==========
    
    class A extends Person {
        void wake() { ... }
    }

    public class Anonymous {
        A a = new A();
        Person field = new Person();
    }

    ========== 익명객체 ==========
    
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

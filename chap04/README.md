## 조건문과 반복문

### 조건문 if, switch

#### if문
<pre>
  <code>
    if(조건식) {
      조건식이 참일 때 실행
    }
  </code>
</pre>

#### if-else 문
<pre>
  <code>
    if(조건식) {
      조건식이 참일 때 실행
    }
    else {
      조건식이 거짓일 때 실행
    }
  </code>
</pre>

#### if-else if-else 문
<pre>
  <code>
    if(조건식1) {
      조건식1이 참일 때 실행
    }
    else if(조건식2) {
      조건식2가 참일 때 실행
    }
    else {
      조건식1 과 조건식2 모두 거짓일 때 실행
    }
  </code>
</pre>

#### switch 문
<pre>
  <code>
    switch(변수) {
      case 값1 :
        변수가 값1일 경우 실행
        break;
      case 값2 :
        변수가 값2일 경우 실행
        break;
      default :
        변수가 값1, 값2 모두 아닐 경우
    }
  </code>
</pre>

### 반복문 for, while

#### for 문
<pre>
  <code>
    for(초기화식; 조건식; 증감식) {
      조건이 참일 경우 반복 실행
      증감식 실행
    }
  </code>
</pre>

#### while 문
<pre>
  <code>
    while(조건식) {
      조건이 참일 경우 반복 실행
    }
  </code>
</pre>

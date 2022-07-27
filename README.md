### Reference 🙇‍♂️
이 글의 내용은 다음 내용을 참조하여 작성되었습니다.
- [Java의 정석](http://www.yes24.com/Product/Goods/24259565)
- [Why we use lamda expression?](https://www.tutorialspoint.com/why-we-use-lambda-expressions-in-java)
- [What is the purpose of a lambda expression?](https://www.techopedia.com/definition/3826/lambda-expression)
- [What are advantages using lamda in java?](
)
- [Understanding Lambda expressions and delegates](https://stackoverflow.com/questions/3282103/understanding-lambda-expressions-and-delegates)
- [Anonymous function](https://en.wikipedia.org/wiki/Anonymous_function)
---
### Search
람다식의 도입으로 인해 자바는 객체지향 언어인 동시에 함수형 언어가 되었다고 한다. 함수형 언어의 장점들을 자바에서도 누릴 수 있게 되었으니 람다식이라는 강력한 무기에 대해 알아보자

>
- [왜 람다식을 사용하나요?](https://www.tutorialspoint.com/why-we-use-lambda-expressions-in-java) : 일부 메서드에 인자로 전달할 수 있는 익명 함수를 정의함으로써 함수 인터페이스를 구현하는 것이 가능하다.
  - 함수형 프로그래밍 활성화
    - 모든 JVM 기반 언어는 객체지향 프로그래밍을 통해 작업해야 했지만, 람다식의 등장으로 함수 코드 작성이 가능해졌다.
  - 읽기 쉽고 간결한 코드
    - 람다식 사용으로 엄청난 양의 코드가 제거된 것이 보고되었다.
  - 사용하기 쉬운 API와 라이브러리
    - 람다식을 사용하여 설계된 API는 다른 API를 더 쉽게 사용하고 지원 가능하다.
  - 병렬 처리 지원
    - 람다식은 오늘날 모든 프로세서가 [멀티 코어 프로세서](https://www.techtarget.com/searchdatacenter/definition/multi-core-processor)라고 한다. 
    따라서 병렬 처리를 지원한다.
- [람다식의 목적은 무엇인가요?](https://www.techopedia.com/definition/3826/lambda-expression) 
  - 익명 메서드 작성에 사용
  - 간결하고 기능적인 구문을 제공
  - 함수형 프로그래밍 개념을 기반으로 하며 
- [람다식의 장점은 무엇인가요?]
- [람다식 사용 시 주의점]
  - 람다 표현식은 컴파일러의 약어를 제공하여 [대리자(delegates)](https://stackoverflow.com/questions/3282103/understanding-lambda-expressions-and-delegates)에게 할당된 메서드를 방출할 수 있도록 한다.
  - 컴파일러는 람다 인자에 대한 자동 유형 추론을 수행하며, 이는 주요 이점이다.
  
### 람다식이란?
"메서드를 하나의 식(expression)으로 표현한 것"이라고 간단히 말할 수 있다. 그렇다면 그렇게 함으로써 해결되는 문제는 무엇일까?
- 메서드의 이름과 반환값이 없어지므로 람다식을 익명 함수(anonymous function)라고도 한다.
- 함수를 간략하면서도 명확한 식으로 표현할 수 있게 해준다.

```java
int [] arr = new int[5];
Arrays.setAll(arr ,(i) -> (int)(Math.random() *5)+1);
```
위 람다식이 하는 일을 메서드로 표현하면 다음과 같다.
```java
int method(){
	return (int)(Math.random()*5) +1;
```

간결하고 이해하기 쉽다는 것에 이견이 없을 것이다.
그렇다면 어떤 문제를 해결하는 것일까?
- 모든 메서드는 클래스에 포함되어야 하므로 클래스도 새로 만들어야 하고, 객체도 생성해야만 비로소 메서드를 호출할 수 있다.
- 그러나 람다식은 모든 과정없이 람다식 자체만으로도 메서드의 역할을 대신할 수 있다.
- 메서드의 매개변수로 전달되어지는 것이 가능하고. 메서드의 결과로 반환될 수도 있다.

> __람다식으로 인해 메서드를 변수처럼 다루는 것이 가능해진 것이다.__

---

### 람다식을 작성하는 방법

#### 익명 함수?
[익명 함수(anonymous function)](https://en.wikipedia.org/wiki/Anonymous_function)란 무엇일까?
- 식별자에 바인딩되지 않는 함수 정의 (an anonymous function (function literal, lambda abstraction, lambda function, lambda expression or block) is a function definition that is not bound to an identifier.)
- 일반적으로 고차함수 또는 함수를 반환해야 하는 고차함수의 결과를 구성하는데 사용되는 인자로써 사용된다.
- 함수 사용 횟수가 제한되어 있는 경우, 명명된 함수보다 구문이 가벼울 수 있다.

익명 함수답게 메서드에서 이름과 반환타입을 제거하고 매개변수 선언부와 몸통{} 사이에 '->'를 추가한다!
>~~dataType methodName~~(arguments) -> {...}

- 기존
``` java
dataType methodName (arguments){
body
}
```
- 람다식 적용
```java
(arguments) ->{
body
}
```
- 반환값이 있는 메서드
  - return 문장(statement)대신 __'식(expression)'__으로 표현 가능
    (문장이 아닌 '식'이므로 끝에 ;을 붙이지 않는다.)

```java
// statement
(int a, int b) -> {return a>b ? a : b;}
// expression
(int a, int b) -> a > b ? a : b
```
- 반환 타입이 없는 경우
  - 선언된 매개변수의 타입이 추론 가능한 경우 생략할 수 있다.(대부분의 경우)
  - 람다식에 반환 타입이 없는 이유는 항상 추론이 가능하기 때문이라고 한다.(어느 하나의 타입만 생략하는 것은 허용되지 않는다.)
```java
// not elision
(int a, int b) -> a > b ? a : b
// elision
(a,b) -> a > b ? a : b
```
---
### 함수형 인터페이스(Fuctional Interface)
람다식이 메서드와 동등한 것이라고 생각할 수 있지만,
사실 익명 클래스의 객체와 동등하다.
그렇다면 람다식은 어떤 클래스에 포함되는 것일까?

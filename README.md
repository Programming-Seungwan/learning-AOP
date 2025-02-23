# learning-AOP

## AOP의 주요 개념
1. What : 공통적으로 무엇을 돌릴 것인지를 말하는 "로직" -> `Advice`
2. When : 해당 로직을 어떤 메서드들이, 언제 실행될지를 의미함 -> `Pointcut`
3. What + When : 위의 Advice + Pointcut이 합쳐진 개념 -> `Aspect`
4. Weaver : spring AOP나 JAspect 같이 이를 구현한 프레임워크

-> 위의 개념들은 컴파일 타임에

5. `Join Point` : 실제로 Pointcut에 해당하는 조건이 참이되어 실제로 Advice가 런타임에 실행된 인스턴스.

 
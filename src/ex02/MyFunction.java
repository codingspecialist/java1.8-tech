package ex02;

// 입력을 받아서 결과를 반환
public interface MyFunction<T,R> {
    R apply(T t);
}
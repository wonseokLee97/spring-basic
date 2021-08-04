package hello.Core.singleton;

public class SingletonService {

    // static 은 class 레벨로 생성하므로 단 하나만 존재한다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    // private 생성자를 사용하여 외부에서 getInstance 가 아닌 new 를 사용하여 객체를 생성할 수 없도록 한다.
    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}

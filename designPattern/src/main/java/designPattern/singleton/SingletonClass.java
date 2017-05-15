package designPattern.singleton;

public class SingletonClass {

  /**
   * ∮ 私有的静态内部类 so其他类是无法发现的
   * ∮ 类的构造是原子性的，没有并发问题
   * ∮static保证了SingletonClass只能有一个
   *
   * @author wangbingyuan
   */
  private static class SingletonInstance {

    private static final SingletonClass sc = new SingletonClass();
  }

  private SingletonClass() {

  }

  public static SingletonClass getInstance() {
    return SingletonInstance.sc;
  }
}

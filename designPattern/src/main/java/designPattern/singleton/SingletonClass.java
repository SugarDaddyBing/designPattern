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
/*
 * 个人理解：
 * 这个套路是用来解决  一个全局的类  频繁的创建与销毁 ，控制实例数目，节省系统资源
 * 用在哪： 多线程共同处理一个文件
 *
 *
 *
 * how to do： 无则创建 仅此一次 有则返回 还是它呗
 *
 * */

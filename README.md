# 设计模式

组合思维、分层思维、工程思维、对象思维、迭代思维



软件开发过程 = 定义与分析 + 设计 + 实现 + 测试 + 交付 + 维护

软件工程 = 过程 + 工具 + 方法 （保证软件交付的效率和可靠性）

编程 = 写代码 + 讨论 + 学习 + 反思

高效编程 = 原则 * 工具 * 编码 * 反馈 * 迭代 （尝试去搭建新组件的实验环境、搭建自己的工具代码库）

**面向对象的优势：**

1. 模块化更适合团队敏捷开发
2. 对象结构更能提升代码重用性、可读性
3. 组合和聚合思想让代码演进更重视组件化



## 2 设计原则

### 2.1 单一原则 （DRY）

**定义 ：** 系统中的每一个功能都应该有唯一的实现，如果多次遇到同样的问题，就应该 抽象出一个共同的解决方法，而不要重复开发同样的功能代码。

陷阱1 ： 随时关注可重用性

陷阱2 ： 过渡设计   （抓住上下文，避免过度设计）

陷阱3：写一次代码 



### 2.2 简单原则 （KISS）

Keep It Simple and Stupid

**定义：** 指代码应该更容易理解、更容易编写、更容易改变，并应该一直保持如此。



>  保持简单并不是只能做简单设计或简单编程，而是做设计或编程时要努力以最终产出简单为目标，过程可能非常复杂也没关系。

**简单性始终是一个最终的结果，为了达到这个结果，过程可能会非常复杂！**

### 2.3 最少原则 （LoD）

迪米特法则（Low of Demeter）

**定义：** 1. 一个类只应该与它直接相关的类通信； 2. 每一个类应该知道自己需要的最少知识。

定义：如果两个类不必彼此直接通信，那么这两个类就不应当发生直接的相互作用。如果其中一个类需要调用另一个类的某个方法的话，可通过第三者转发这个调用。（来自大话设计模式）

在面向对象编程中，它要求任何一个对象（O）的方法 （m）， 只应该调用以下对象：

- 对象（O）自身
- 通过方法（m）的参数传入的对象
- 在方法（m）内创建的对象；
- 组成对象（O）的对象；
- 在方法（m）的范围内，可让对象（O）访问的全局变量。

**分层架构，其实就可以被认为是迪米特法则在架构设计上的一种具体体现**



### 2.4 表达原则 

（Program Intently and Expressively  , PIE）

**定义：** 指编程时应该有清晰的编程意图，并通过代码明确地表达出来。

快速提升代码可读性

- 易于维护
- 易于重构
- 易于测试
- 易于使用设计模式

想写出可读性高的代码，你可以从三个方面来入手。

- 代码表现形式：在命名（变量名、方法名、类名）、代码格式、注释等方面的改进。

- 控制流和逻辑：尽量分离控制流和逻辑，让代码变得更容易理解。 If-else

- 惯性思维：找出常犯的一些惯性思考方式并逐一改进。

### 2.5 职责分离

**定义：** 将不同变化原因引起的类或方法修改行为拆分到不同类或方法里去。



**职责分离的重要性**：

- 直接对问题进行对象建模，方便理清构建逻辑
- 将问题分解为各种职责，更有利于系统的测试，调试和维护
- 提高系统的可扩展性

> 只有有意识地进行职责分离才能提高代码的可维护性



### 2.6 面向对象原则 (SOLID 原则)



“SOILD”是由五大原则的英文首字母拼写而成，具体对应情况如下。

- S（Single Responsibility Principle，简称 SRP）：单一职责原则，意思是对象应该仅具有一种单一的功能。

- O（Open–Closed Principle，简称 OCP）：开闭原则，也就是程序对于扩展开放，对于修改封闭。

- L（Liskov Substitution Principle，简称 LSP）：里氏替换原则，程序中的对象应该是可以在不改变程序正确性的前提下被它的子类所替换的。
- I（Interface Segregation Principle，简称 ISP）：接口隔离原则，多个特定客户端接口要好于一个宽泛用途的接口。
- D（Dependency Inversion Principle，简称 DIP）：依赖反转原则，该原则认为一个方法应该遵从“依赖于抽象而不是一个实例”。

### 2.7 反转原则

依赖反转原则（Dependence Inversion Principle，简称 DIP）

**依赖反转原则（DIP）就是一种统一代码交互标准的软件设计方法。**

- IoC 容器是一种技术框架，它用来管理对象的创建及其生命周期，提供依赖注入实现，是 DI 的具体实现；
- DI 是一种设计模式，将依赖通过“注入”的方式提供给需要的类，是 DIP 和 IoC 的具体实现；
- IoC 是一种设计原则（或设计模式），将代码本职之外的工作交由某个第三方（框架）完成，与 DIP 相似；
- DIP 是一种设计原则，它认为高层组件的功能不应该依赖下层组件的实现，而应该提供抽象层让下层依赖，与 IoC 有异曲同工之妙。

DIP 是一种**设计理念**，是为了帮助我们解耦复杂的程序。换句话说，DIP 是一种简单但功能强大的设计思想，我们可以使用它来实现**结构良好、高度分离和可重用的软件组件**。

DIP 给我们带来一个重要启示：**不管是程序设计还是工作生活，如果依赖和控制的东西过多了，就要学会制定标准，倒置依赖，反转控制，释放自身资源，专注于更重要的事。**

### 2.6 惯例原则

**惯例原则就是将一些在编程中公认的配置方式和约定信息作为内部缺省的默认规则来使用**



### 2.8 分离原则

先将复杂问题做合理的分解，再分别仔细研究程序上特定问题的侧面（关注点），最后解决得出的接口，再合成整体的解决思路。

### 2.9 契约原则

契约式设计原则（Design by Contract，缩写为 DbC，为表述统一，下文我们就简称为“契约原则”），是一种软件设计方法。其原理是：在软件设计时应该为软件组件定义一种精确和可验证的接口规范，这种规范要包括使用的预置条件、后置条件和不变条件，用来扩展普通抽象数据类型的定义。

**就是当一个操作多次执行所产生的影响均与一次执行的影响相同，则它是幂等的。**

如何在 API 设计中做到接口幂等呢？通常有以下五种方法。

- 使用天然幂等的操作。比如，数据库中的 select 查询，只要数据没发生改变，那么查询一次和多次的结果始终是一样的；还有 delete 删除操作，删除一次和多次删除都是把数据删除了（不存在了），影响是一样的，典型的天然幂等操作。

- 使用唯一键值。比如，在数据库中加唯一索引，或是使用 UUID 做唯一 ID，都可以防止在新增数据时出现不必要的脏数据，因为不同的服务节点操作数据时都收到了唯一 ID 的约束。

- 使用加锁策略。比如，悲观锁、乐观锁、分布式锁等。加锁的目的就是让不同的服务在同一个数据变更时不被其他服务所影响，比如，订单服务 API 部署了 500 个相同实例，那么即便通过 Nginx 网关做了负载均衡的流量分配，在修改订单的时候如果不加锁，就会导致数据被重复多次的修改，也就是无法保证幂等。

- 使用 Source+Token 验证机制。这和使用唯一键值有一点类似**，**不过这种方法更多用在对外提供的 API 中去保证幂等性。这两个字段实际上既做了联合的唯一索引，又做了使用来源的日志记录，这样既能保证接口的幂等性，也能记录不同客户端使用 API 的调用情况。

- 使用有限状态机。在一些状态变更比较频繁的业务中，会经常使用到状态机，比如，订单、支付、秒杀等业务。当状态机已经处于下一个状态，这时候又来了一个上一个状态的变更，那么这时就不允许再进行状态变更了。正是通过这种状态扭转的约束，保证了接口服务的幂等性。

## 3 设计模式

### 3.1 单例模式

- 一个单例类只能有一个实例
- 单例类必须自行创建这个实例
- 单例类必须保证全局其它对象都能唯一访问到它



**为什么要使用单例模式？**

系统某些资源有限：

- 控制某些共享资源（例如，数据库或文件）的访问权限
- 同时读写同一个超大的 `AI` 模型文件，或使用外部进程式服务

需要表示为全局唯一的对象：

- 系统要求提供一个唯一的序列号生成器



**使用单例模式的优势：**

- 对有限资源的合理利用，保护有限的资源，防止资源重复竞抢。

- 更高内聚的代码组件，能提升代码复用性。

- 具备全局唯一访问点的权限控制，方便按照统一规则管控权限。

- 从负载均衡角度考虑，我们可以轻松地将 Singleton 扩展成两个、三个或更多个实例。由于封装了基数问题，所以在适当的时候可以自由更改实例的数量。



**使用单例模式的劣势：**

- 作为全局变量使用时，引用的对象越多，代码修改影响的范围也越大。

- 作为全局变量时，在全局变量中使用状态变量时，会造成加/解锁的性能损耗。

- 即便能扩展多实例，但耦合性依然很高，因为隐蔽了不同对象之间的调用关系。

- 不支持有参数的构造函数。

#### 饿汉式



```java
// 饿汉式： 类在第一次初始化时就已经创建好唯一的单例
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
```



#### 懒汉式



```java
// 懒汉式： 需要的时候在创建唯一单例
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {

    }

    // 线程不安全，可能创建多个“单例”
    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    // 线程安全同步信号, 但是锁重量级
//    public static synchronized Singleton2 getInstance() {
//        if (instance == null) {
//            instance = new Singleton2();
//        }
//        return instance;
//    }
}
```



#### 同步信号

```java
//    public static synchronized Singleton2 getInstance() {
//        if (instance == null) {
//            instance = new Singleton2();
//        }
//        return instance;
//    }
```



#### 双重锁定(DCL)

```java
// 双重锁实现：
public class Singleton3 {

    // volatile: 禁止指令重排
    private static volatile Singleton3 instance;

    private Singleton3() {

    }
	// 为何要进行两次判空？
    // 多线程模式下，第一次判空，可以将同步信号锁放置方法内部，提高性能；第二次判空，防止多个线程同时进入第一个判空条件，执行 new 实例
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}
```



#### 使用 ThreadLocal



**ThreadLocal 会为每一个线程提供一个独立的对象副本**，从而解决了多个线程对数据的访问冲突的问题。正因为每一个线程都拥有自己的对象副本，也就省去了线程之间的同步操作。

```java
import java.util.HashMap;

import java.util.Map;

public class AppContext {

    private static final ThreadLocal<AppContext> local = new ThreadLocal<>();

    private Map<String,Object> data = new HashMap<>();

    public Map<String, Object> getData() {

        return getAppContext().data;

    }

    //批量存数据

    public void setData(Map<String, Object> data) {

        getAppContext().data.putAll(data);

    }

    //存数据

    public void set(String key, String value) {

        getAppContext().data.put(key,value);

    }

    //取数据

    public void get(String key) {

        getAppContext().data.get(key);

    }

    //初始化的实现方法

    private static AppContext init(){

        AppContext context = new AppContext();

        local.set(context);

        return context;

    }

    //做延迟初始化

    public static AppContext getAppContext(){

        AppContext context = local.get();

        if (null == context) {

            context = init();

        }

        return context;

    }

    //删除实例

    public static void remove() {

        local.remove();

    }

}

```



#### 静态内部类



```java
//第一次加载Singleton类时并不会初始化sInstance，只有第一次调用getInstance方法时虚拟机加载SingletonInner 并初始化instance
public class Singleton4 {

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return SingletonInner.instance;
    }

    private static class SingletonInner {
        private static final Singleton4 instance = new Singleton4();
    }
}

```



#### 枚举



```java
package singleton;

public enum Singleton5 {
    INSTANCE;
}

```


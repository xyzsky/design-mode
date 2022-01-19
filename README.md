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

### 3.2 建造者模式

Builder 模式，也叫**生成器模式**。

**为什么直接使用构造函数或使用set方法创建对象不方便？** 

- 直接使用构造函数的话面对多种可选参数的情况，需要也多种不同的构造函数，使用时容易造成混乱
- 使用set方法，也就是javabean模式的话，在构建过程中对象的状态容易发生变化，造成错误。因为类中的属性是分步设置的。（对象在创建好之后，就不能再修改内部的属性值，所以不能暴露 set 方法）

为什么一定需要建造者模式来创建？

- **分阶段、分步骤的方法更适合多次运算结果类创建场景**。在面向对象软件开发中，很多时候创建类所需要的参数并不是一次都能准备好的，比如，计算订单优惠价格、查询库存状态等，有的参数可能需要通过调用多个服务运算后才能得出，这时我们可以根据已知参数预先对类进行创建，等有合适的参数时再设置类的属性，而不是等到所有结果都齐备后才去创建类。
- **不需要关心特定类型的建造者的具体算法实现**。 比如，我们在使用 StringBuilder 时，并不太关心它的具体代码实现，而是关心它提供给我们的使用功能。这在某些需要快速复用的场景中，能起到提升编码效率的作用。而换个角度来看，当你需要给别人提供一个建造者来创建类时，你就需要严格地设计你的建造者，并保证你的建造者类能够创建符合预期的类。





**定义：**将复杂对象的构造与其表示分离，以便同一构造过程可以创建不同的表示。

**传统建造者模式UML图：**



![image-20220117174153207](X:\JavaNote\design-mode\image\image-20220117174153207.png)

- **Product**：代表最终构建的对象，比如，汽车类。

- **Builder**：代表建造者的抽象基类（可以使用接口来代替）。它定义了构建 Product 的步骤，它的子类（或接口实现类）需要实现这些步骤。同时，它还需要包含一个用来返回最终对象的方法 getProduct()。

- **ConcreteBuilder**：代表 Builder 类的具体实现类。

- **Director**：代表需要建造最终对象的某种算法。这里通过使用构造函数 Construct(Builder builder) 来调用 Builder 的创建方法创建对象，等创建完成后，再通过 getProduct() 方法来获取最终的完整对象。



![image-20220117174502007](X:\JavaNote\design-mode\image\image-20220117174502007.png)

**建造者模式封装（信息隐藏）了如下变化：**

- 每个具体建造器的构建步骤；

- 当前正在使用哪一个建造器；

- 现有建造器的数量；

- 一个建造器里可以创建多个属性的特性。



**建造者模式常用使用情况：**

- 需要生成的对象包含多个成员属性，而且这些参数有些是可选参数，考虑使用建造者模式；
- 需要生成的对象的属性相互依赖，需要指定其生成顺序；
- 对象的创建过程独立于创建该对象的类；
- 需要隔离复杂对象的创建和使用，并使得相同的创建过程可以创建不同的产品。



**优点：**

- **分离创建与使用。** 在建造者模式中， 使用方不必知道你的内部实现算法（步骤）的细节，通过统一方法接口的调用，可以自由组合出不同的对象实例。

- **满足开闭原则**。 每一个建造者都相对独立，因此能方便地进行替换或新增，这就大大提升了代码的可扩展性。

- **自由地组合对象的创建过程。**由于建造者模式将复杂的创建步骤拆分为单个独立的创建步骤，这不仅使得代码的可读性更高，也使得在创建过程中，使用者可以根据自己的需要灵活创建。

**缺点：**

- **使用范围有限**。 建造者模式所创建的对象一般都需要有很多的共同点，如果对象实例之间的差异性很大，则不适合使用建造者模式。
- **容易引起超大的类。**我们都知道一辆汽车内部构造其实很复杂，作为开发者的你其实更关心的是像发动机、轮胎这样具备重用性的组件。一旦过度定制化对象创建的过程步骤，那么随着创建对象新需求的出现或变化，新的创建步骤就会被加进来，这会造成代码量的急剧膨胀，最终形成一个庞大的超大类。
- **增加代码行数。** 虽然建造者模式能够提高代码的可阅读性，但也会以增加代码行数来作为代价。



### 3.3 抽象工厂模式



**工厂模式：**

- 工厂方法模式
- 抽象工厂模式

抽象工厂模式的重点和难点是——**如何找到正确的抽象**

定义： 提供了一个用于创建相关或相关对象族的接口而无需指定其具体类

![image-20220118165156739](X:\JavaNote\design-mode\image\image-20220118165156739.png)

抽象工厂模式主要包括四个关键：

- 抽象工厂；

- 抽象产品（通用的一类对象或接口）；

- 具体工厂；

- 具体产品（继承通用对象或接口后扩展特有属性）。

**如何找到某一个类产品的正确共性功能**

**在软件开发中，抽象工厂模式的使用场景主要就是解决跨平台兼容性的问题。**



为什么要使用抽象工厂模式？

- **第一点，对于不同产品系列有比较多共性特征时，可以使用抽象工厂模式，有助于提升组件的复用性。** 比如，不同的数据库产品，JDBC 就是对于数据库增删改查建立的抽象工厂模式，无论使用什么类型的数据库，只要具体的数据库组件能够支持 JDBC，就能对数据库进行读写操作，这极大地提高了我们对不同数据库组件的复用性。

- **第二点，当需要提升代码的扩展性并降低维护成本时，把对象的创建和使用过程分开，能有效地将代码统一到一个级别上。**比如，你需要创建统一的日志监控，但不同应用使用的日志收集代理可能各不相同，这时如果有一个统一的日志收集工厂定义抽象的日志收集功能，那么不同的代理只需要按照各自的实现方式提供统一的日志收集功能即可，这样即便以后新增了一些代理，也不会影响旧的功能，提升扩展性的同时也能提升维护性。

- **第三点，解决跨平台带来的兼容性问题。** 抽象工厂模式提供了一种解决跨平台问题的思路，也就是我们的后台服务应该尽可能地使用更高层级的统一的抽象功能，然后通过不同客户端的适配程序来实现统一的功能交付。比如，同一个地区里，安卓或 iOS 的客户端 App 通过 API 网关访问商品数据时，应该是先获取统一的抽象数据对象，然后经过安卓或 iOS 的客户端适配器程序的适配转换和传输，而不是针对具体型号的手机（华为、小米、苹果等）来单独进行适配，安卓和 iOS 这里就被看作是不同手机型号的抽象工厂模式。



**优点：**

- **符合开闭原则。** 当我们需要添加新的工厂类时，只用新继承一个类，不用修改抽象工厂和其他具体类。

- **可以保证同一工厂生成的产品符合预期。** 通过抽象工厂定义了统一的抽象产品功能，只要是继承了这个抽象工厂，本质的抽象产品功能是不会发生改变的。

- **将使用和创建的代码进行解耦**。 在具体的代码实现中，使用者只用关心如何使用具体的功能，而不再需要关心这个对象是怎么创建的。这样对象与对象之间的耦合关系变得更单一，降低了过多应用带来的耦合风险。

- **满足单一职责原则**。 由于我们将产品的实现代码放到同一层级里，并继承同一个抽象工厂类，所以说，即便具体的代码风格有所不同，也不影响最终提供功能的统一性，使得代码的可维护性大大提高。

- **容易增加新的产品系列**。 因为有了抽象工厂作为参考模板，那么再新增新的具体工厂时非常容易，不需要修改其他具体工厂，并且各自的工厂可以朝着自己的演化方向发展。

缺点：

- 增加代码量。 虽然抽象工厂模式很好地进行了职责分离，但因此也增加了更多的类文件和代码行数，使得开发时间变长，并且随着实现子类越来越多，可能当一个抽象工厂想要增加抽象时，影响的代码范围会很大。

- 增加学习成本。 抽象工厂模式是自顶向下式的设计，无论是入门级的程序员还是资深程序员，一开始就找到正确的抽象是一件非常困难的事情。这可能需要学习大量的实践案例，并不断总结归纳才有可能做得更好。

- 变更产品的结构困难。 抽象工厂模式最大的缺点在于，一旦定义了某种产品结构后，要想修改就得修改所有的具体工厂和抽象工厂。比如，家具工厂需要再生产“门”这个家具，那么不管是已有的中国工厂还是美国工厂，都需要新增生产“门”的家具，势必会引入风险。其实，这本质上就是继承带来的问题。

### 3.4 工厂方法模式

重要程度：  ☆  ☆  ☆  ☆

factory method pattern  也叫作 工厂模式

**定义：** 定义一个创建对象的接口，但让实现这个接口的类来决定实例化那个类

![image-20220118181944874](X:\JavaNote\design-mode\image\image-20220118181944874.png)

工厂模式的三个关键：

- 抽象接口（也叫抽象产品）；

- 核心工厂；

- 具体产品（也可以是具体工厂）。

不同于抽象工厂模式，工厂方法模式侧重于直接对**具体产品的实现进行封装和调用**，通过统一的接口定义来约束程序的对外行为。换句话说，用户通过使用核心工厂来获得具体实例对象，再通过对象的统一接口来使用对象功能。

**工厂方法模式是围绕着特定的抽象产品（一般是接口）来封装对象的创建过程，客户端只需要通过工厂类来创建对象并使用特定接口的功能。**



**为什么要使用工厂方法模式？**

- **第一个，为了把对象的创建和使用过程分开，降低代码耦合性。**这是使用工厂方法模式最直接的理由之一。在实际的软件开发中，你可能更喜欢使用 new 来创建对象，同时紧接着便开始使用新创建的对象，这看上去并没有什么问题，但是随着创建对象数量的增多，你会发现，当你想要重构、修改已有的对象属性和方法时，你几乎不敢轻易修改，因为你早已记不清哪些对象在哪里被创建和使用，以及跟哪些对象发生了关联和交互。而使用工厂方法模式，就能很好地避免这个问题，创建的过程始终在工厂内部管理，只要对外使用的方法不发生变化，那么就不会对创建对象造成影响。

- **第二个，减少重复代码。** 对于要写代码的程序员或架构师来说，面对成千上万相同的数据对象进行增删改查时，如果每次都使用 new 来创建对象的话，那么 80% 的时间都会浪费在同样属性的 get 与 set 上。这时要是使用的对象之间还有相互引用的话（A 引用 B，B 又引用 C……），重复的代码就会剧增。而对于多个相同对象的构建过程，除了使用建造者模式以外，还可以使用工厂方法模式来避免出现过多的重复代码，将相同的创建规则统一放在一起。

- **第三个，统一管理创建对象的不同实现逻辑。** 比如，当一个业务对象发生业务逻辑变化时，使用工厂方法模式后，你不需要找到所有创建对象的地方去修改，而只需要在工厂里修改即可。即便这时你想要扩展对象为新的子类，也不需要把所有调用父类的地方都改成子类，只需要在工厂中修改其生产的对象为新的子类。同时，还隐藏了具体的创建过程，减少了使用者误用逻辑而导致未知错误出现的概率。



**优点:**

- **能根据用户的需求定制化地创建对象。** 工厂方法模式是基于某一个抽象产品角色来进行具体的实现工厂的设计。这样的好处就在于具体工厂可以根据自己的需求来决定创建什么样的具体产品，同时，还能把不同的算法细节完全封装在具体的工厂内部。

- **隐藏了具体使用哪种产品来创建对象。** 由于工厂方法模式对外使用统一的抽象接口，这样就向用户隐藏了具体正在使用的产品实例，让用户只需要关心抽象接口即可，无须关心创建细节，甚至都不用知道具体产品类的真实类名。

- **实现同一抽象父类的多态性，满足“里氏替换原则（LSP）”**。 在使用工厂方法模式时，因为是围绕着统一的抽象接口来实现具体的功能，那么就能很便捷地使用不同的算法策略来实现同一功能，所以这样更好地实现了不同具体产品之间的可替换性。

- **满足“开闭原则”。** 当你想要在系统中加入新的具体对象时，不用再修改抽象接口和核心工厂，也不用修改客户端，更不用修改其他具体工厂和具体产品，而只需要新增一个具体工厂和具体产品就可以了。这样系统的可扩展性也就变得非常好，完全符合“开闭原则”。

**缺点：**

​	

- **抽象接口新增方法时，会增加开发成本。** 当统一的抽象接口中新增方法时，相应的每个具体工厂都需要新增实现。不管具体工厂是否需要这个方法，都必须要新写代码，这样在一定程度上增加了开发工作量，因为修改后就需要编译、运行和测试，自然增加了开发成本。

- **具体工厂实现逻辑不统一，增加代码理解难度。** 虽然核心工厂已经保证了部分共有逻辑的实现，但是具体产品依然是由具体工厂封装实现的，一旦具体工厂采用非通用的实现策略，那么对于维护的人员来说，就需要耗费大量的精力和时间去学习和理解。

### 3.5 简单工厂模式

作用和工厂方法模式一样；不过是使用静态方法生产产品，也就是实例对象；

![image-20220118194211122](X:\JavaNote\design-mode\image\image-20220118194211122.png)

简单工厂的核心点：

- 抽象产品
- 具体产品
- 简单工厂



简单工厂模式的核心就是通过一个工厂方法根据不同的条件生产**同一类型**的产品。例如此例中我们要生产的小米笔记本和苹果笔记本他们是同一类型的产品，会实现**同一个**接口。

优点： 避免了直接在客户端创建具体的产品实例，降低了耦合性

缺点：违反了开闭原则，不容易形成高内聚低耦合的结构，每当我们需要新增一种产品时，就需要修改工厂方法，破坏了内聚性。

### 3.6 原型模式

定义： 使用原型实例指定创建对象的种类，然后通过拷贝这些原型来创建新的对象。

![image-20220119123752419](X:\JavaNote\design-mode\image\image-20220119123752419.png)

原型模式中的关键：

- 使用者
- 原型
- 新实例

**使用者需要建立一个原型，才能基于原型拷贝出新实例。**



**原型模式封装了如下变化：**

- 原始对象的构造方式；

- 对象的属性与其他对象间的依赖关系；

- 对象运行时状态的获取方式；

- 对象拷贝的具体实现策略。

**原型模式从建立原型到拷贝原型生成新实例，都是对用户透明的，一旦中间任何一个小细节出现问题，你可能获取的就是一个错误的对象。**



为什么要使用原型模式？

- **第一个，减少每次创建对象的资源消耗。** 当类初始化消耗资源特别多时，原型模式特别有用。比如，在 AI 系统中，我们经常需要频繁使用大量不同分类的数据模型文件，在对这一类文件建立对象模型时，不仅会长时间占用 IO 读写资源，还会消耗大量 CPU 运算资源，如果频繁创建模型对象，就会很容易造成服务器 CPU 被打满而导致系统宕机。通过原型模式我们可以很容易地解决这个问题，当我们完成对象的第一次初始化后，新创建的对象便使用对象拷贝（在内存中进行二进制流的拷贝），虽然拷贝也会消耗一定资源，但是相比初始化的外部读写和运算来说，内存拷贝消耗会小很多，而且速度快很多。

- **第二个，降低对象创建的时间消耗。** 比如，需要查询数据库来创建对象时，如果数据库正好繁忙或锁表中，那么这个创建过程就可能出现长时间等待的情况。在很多高并发场景中，稍微长时间的等待可能都是致命的，因为大量的数据和请求如洪水一般涌入服务器，很容易引起雪崩效应。这时使用原型模式就是相当于对对象创建的过程进行了一次缓存读取，而不必一直阻塞程序的执行。

- **第三个，快速复制对象运行时状态。**原型模式相比于传统的使用 new 关键字创建对象还有一个巨大的优势，那就是当构造函数中包含大量属性或定制化业务逻辑时，不用完全了解创建过程也能快速创建对象。比如，当一个对象类有 30 个以上的属性或方法时（属性字段可能为另一个对象），如果你都通过 get 和 set 方法来创建对象，你会发现复制粘贴都是一件痛苦的事，因为你可能都忘记了哪些字段是必选、哪些又是有数据的。这也是我们在接收 HTTP 和 RPC 传输的 JSON 数据时，更愿意采用反序列化（也是一种原型模式的实践）到对象的方式，而不是 new 一个新对象再赋值的原因。

- **第四个，能保存原始对象的副本。** 在某些需要保存历史状态的场景中，比如，聊天消息、上线发布流程、需要撤销操作的程序等，原型模式能快速地复制现有对象的状态并留存副本，方便快速地回滚到上一次保存或最初的状态，避免因网络延迟、误操作等原因而造成数据的不可恢复。



**优点：**

- **原型并不基于继承，因此没有继承的缺点。**原型模式是对对象的直接复制，当新对象发生变化时，并不会对原始对象有任何影响，而继承的对象一旦发生了修改则会影响到父类。

- **复制大对象时，性能更优。**比如，Java 使用的原型模式是基于内存二进制流的拷贝，而直接 new 一个大对象是 JVM 进行堆内分配并可能触发 Full GC，相比之下，使用 new 关键字时所做的操作实际上更多，而使用内存拷贝的方式在复制的性能上会更优。

- **可以快速扩展运行时对象的属性和方法。**原型模式一方面简化了对象的创建过程，另一方面能够保留原始的对象状态，这样的优势是：在程序运行过程中，如果想要动态扩展对象的功能（增减方法或属性值），可以在不影响原有对象的情况下，动态扩展对象的功能。比如，结合 AOP 切面编程可以实现录制业务调用轨迹，加入应用性能监控，做动态数据埋点等操作。

**缺点：**

- **虽然不基于继承，但原型需要一个被初始化过的正确对象。**如果被复制的对象在进行复杂的初始化时失败或出现错误的初始化后，那么复制的对象也可能是错误的。

- **复制大对象时，可能出现内存溢出的 OOM 错误。**虽然复制对象有诸多优点，但是不要忘记内存的大小是有限制的，如果你想要复制的对象已经占用了 80% 的内存空间，那么复制时大概率会导致内存溢出，而这时的解决办法要么是增加内存，要么是拆分对象。

- **动态扩展对象功能时可能会掩盖新的风险**。虽然原型模式能够在运行时帮助我们快速扩展功能，但同时也可能使新对象的负荷更重。比如，埋点服务中我们通常会拷贝一份对象在某个时间节点的数据，并添加一些追踪数据后再推送给埋点服务，这样就可能增加过多的内存消耗，影响原有功能执行的性能，有时还可能引起 OOM，导致系统宕机。切记，如果没有充分验证过动态扩展功能的话，那么就不要轻易使用动态扩展，因为加入额外的新功能，大概率是会影响原有功能的。

### 3.7 创建型设计模式总结

**单例模式（Singleton）**，类似于一种技巧，是工厂模式一种数量上的特例，相当于强制实现了有限、唯一对象的生产。

**建造者模式（Builder）**，侧重点在于如何实现对象创建过程的自由组合，避免在代码中出现大量 new 式的硬编码。当对象结构发生改变时，能灵活增删步骤节点，还能避免对程序中大量分散 new 语句的修改。换句话说，它实现了对象创建过程的多态。

**抽象工厂模式（Abstract Factory）**，重点是创建一组实现统一抽象产品的工厂对象族（同一个逻辑层级），本质上是为了寻找正确的抽象产品。它可以很好地保证被创建对象的工厂之间的一致性，常常用来解决跨平台的设计问题。

**工厂方法模式（Factory Method）**，有效解决了创建对象时的不确定性。使用的办法就是将创建对象的时机延迟到了每一个具体的创建工厂中，让具体工厂自行解决对象的复杂创建过程，并通过统一的定义接口来保证创建对象时的可任意替换性。换句话说，它实现了对象创建时的多态。

**原型模式（Prototype）**，就是一种将对象生成的责任代理给自己的模式，也就是“复制自我”。通过复制能快速建立运行的对象副本，最大的作用在于动态扩展运行时的对象能力。换句话说，它实现了对象拷贝的多态。
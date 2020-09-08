####Spring Boot 精要
Spring Boot将很多魔法带入了Spring应用程序的开发之中，其中最重要的是以下四个核心。
* 自动配置：针对很多Spring应用程序常见的应用功能，Spring Boot能自动提供相关配置。
* 起步依赖：告诉Spring Boot需要什么功能，它就能引入需要的库。
* 命令行界面：这是Spring Boot的可选特性，借此你只需写代码就能完成完整的应用程序，
无需传统项目构建。
* Actuator：让你能够深入运行中的Spring Boot应用程序，一探究竟。

@SpringBootApplication 开启了Spring的组件扫描和Spring Boot的自动配置功能。实际
上， @SpringBootApplication 将三个有用的注解组合在了一起。
* Spring的 @Configuration ：标明该类使用Spring基于Java的配置。
* Spring的 @ComponentScan ：启用组件扫描，这样你写的Web控制器类和其他组件才能被
自动发现并注册为Spring应用程序上下文里的Bean。
* Spring Boot 的 @EnableAutoConfiguration ： 这个不起眼的小注解也可以称为
@Abracadabra，就是这一行配置开启了Spring Boot自动配置的魔力，让你不用再写成
篇的配置了。

#####自动配置中使用的条件化注解

|条件化注解                   |   配置生效条件
| :-----                     | :-----   
|@ConditionalOnBean          |  配置了某个特定Bean
|@ConditionalOnMissingBean   |  没有配置特定的Bean
|@ConditionalOnClass         |  Classpath里有指定的类
|@ConditionalOnMissingClass  |  Classpath里缺少指定的类
|@ConditionalOnExpression    |  给定的Spring Expression Language（SpEL）表达式计算结果为 true
|@ConditionalOnJava          |  Java的版本匹配特定值或者一个范围值
|@ConditionalOnJndi          |  参数中给定的JNDI位置必须存在一个，如果没有给参数，则要有JNDI InitialContext              
|@ConditionalOnProperty      |  指定的配置属性要有一个明确的值
|@ConditionalOnResource      |  Classpath里有指定的资源
|@ConditionalOnWebApplication|  这是一个Web应用程序
|@ConditionalOnNotWebApplication|   这不是一个Web应用程序

Spring Boot能从多种属性源获得属性，包括如下几处。
* (1) 命令行参数
* (2)  java:comp/env 里的JNDI属性
* (3) JVM系统属性
* (4) 操作系统环境变量
* (5) 随机生成的带 random.* 前缀的属性（在设置其他属性时，可以引用它们，比如 ${random.long} ）
* (6) 应用程序以外的application.properties或者appliaction.yml文件
* (7) 打包在应用程序内的application.properties或者appliaction.yml文件
* (8) 通过 @PropertySource 标注的属性源
* (9) 默认属性

这个列表按照优先级排序，也就是说，任何在高优先级属性源里设置的属性都会覆盖低优先级的相同属性。例如，命令行参数会覆盖其他属性源里的属性。

application.properties和application.yml文件能放在以下四个位置。
* (1) 外置，在相对于应用程序运行目录的/config子目录里。
* (2) 外置，在应用程序运行的目录里。
* (3) 内置，在config包内。
* (4) 内置，在Classpath根目录。

同样，这个列表按照优先级排序。也就是说，/config子目录里的application.properties会覆盖应用程序Classpath里的application.properties中的相同属性。

此外，如果你在同一优先级位置同时有application.properties和application.yml，那么application.yml里的属性会覆盖application.properties里的属性。
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
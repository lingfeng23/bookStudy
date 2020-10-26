### 《重学Java设计模式》

#### 创建者模式

##### Afactory(工厂方法模式)

##### BabstractFactory(抽象工厂模式)

##### Csingleton(单例模式)

##### Dbuilder(建造者模式)

##### Eprototype(原型模式)

#### 结构型模式

##### Fadapter(适配器模式)

##### Gdecorator(装饰器模式)

##### Hproxy(代理模式)

##### Ifacade(外观模式)

##### Jbridge(桥接模式)

##### Kcomposite(组合模式)

##### Lflyweight(享元模式)

#### 行为模式

##### Mstrategy(策略模式)

##### Ntemplate(模板模式)

##### Oobserver(观察者模式)

##### Piterator(迭代器模式)

##### QchainOfResponsibility(责任链模式)

##### Rcommand(命令模式)

##### Smemento(备忘录模式)

##### Tstate(状态模式)

##### Uvistor(访问者模式)

##### Vmediator(中介者模式)

##### Winterpretor(解释器模式)

## 《Java Web设计模式之道》—— webDesign

### Chapter2 设计原则之开闭原则 DONE
开闭原则，是指软件实体应当对扩展开放，对修改关闭。即可以根据需求随意增加新的类，但是不要修改原有的类。

### Chapter3 单一职责原则 DONE
单一职责原则，是指就一个类而言，应该仅有一个引起它变化的原因。即一个类只需按职责进行功能设计。

符合“高内聚低耦合”的标准。

- 有助于清晰地理清设计与编码的思路
- 有助于简化维护、编码、测试的流程
- 复杂问题简单化，有利于代码的重用
- 职责之间消除耦合后，有利于系统的扩展

### Chapter4 里氏代换原则 DONE
若对每个类型S的对象o1，都存在一个类型T的对象o2，使得在所有针对编写的程序P中，
用o1替换o2后，程序P行为功能不变，则S是T的子类型。

子类型必须能够替换掉它们的基类型。

里氏代换原则以继承为基础。

### Chapter5 依赖倒换原则 DOING
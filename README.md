# theGame

Please note for mc.main.Game.java

Launch this class to start the app. During the same game this class has to be launched more than one time to get different results.

startPlayPoint1 method's objective : there is a set of characters and a set of weapons with its own behaviour, the players can use in the game. Each character can make use of one weapon at a time but can change weapons at any time during the game.

startPlayPoint2 method's objective : make characters use two different weapons at a time.

With "theGame" app I reproduce the following patterns :

- Data Transfer Obect - with the use of classes inside mc.domain package
- Business Delegate Pattern - with the use of classes inside mc.service package
- Data Access Object - with the use of classes inside mc.dao package

By using low coupling and high cohesion I make easy the unit testing and I separate concepts.

By using interfaces, "identity" and "functionality" are used and a contract is also used to define hierarchies for all subclasses.

PlayService.java interface shows the OOP "inheritance" usage by extending the SetUpService.java interface ; infact for example a class can implement more than one interface but can only inherit from one abstract class (this is the difference between interface and abstract class).

By using JavaBeans like Character.java and Weapon.java I shows OOP "encapsulation" usage by hiding data implementation and restricting access to getter and setter.

<a href="https://user-images.githubusercontent.com/30404707/35335332-90a45296-0115-11e8-9100-a0647130a149.jpg" target="_blank">Click here to enlarge UML Class Diagram</a>
__________________________________

January 2018 - @author : Mauro Camelo

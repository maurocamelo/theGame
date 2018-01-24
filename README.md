# theGame

Please note for mc.main.Game.java : launch this class to start the app. The method startPlayPoint1 is related to point n°1 and the method startPlayPoint2 is related to point n°2 of the document

With "theGame" app I reproduce the following patterns :

- Data Transfer Obect - with the use of classes inside mc.domain package
- Business Delegate Pattern - with the use of classes inside mc.service package
- Data Access Object - with the use of classes inside mc.dao package

By using low coupling and high cohesion I make easy the unit testing and I separate concepts.

By using interfaces, "identity" and "functionality" are used and a contract is also used to define hierarchies for all subclasses.

PlayService.java interface shows the OOP "inheritance" usage by extending the SetUpService.java interface ; infact for example a class can implement more than one interface but can only inherit from one abstract class (this is the difference between interface and abstract class).

By using JavaBeans like Character.java and Weapon.java I shows OOP "encapsulation" usage by hiding data implementation and restricting access to getter and setter.
__________________________________

January 2018 - @author : Mauro Camelo

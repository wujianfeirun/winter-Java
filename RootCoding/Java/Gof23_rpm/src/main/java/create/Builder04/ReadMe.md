Builder用于***复合对象创建***，
用来隐藏复合对象的创建过程，它把复合对象的创建过程加以抽象，
通过子类继承和重载的方式，动态地创建具有复合属性的对象。

角色：
抽象Builder：   具体builder的每一个步骤，以及getObj()返回复合对象。
具体Builder：
Director：  传入builder对象， 执行步骤。
复合对象：   具有复合属性的复合对象。 最终由Builder返回
   


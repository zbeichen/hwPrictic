ctrl + alt + shift + t  -- introduce paramter object 将方法参数提取为类

shift + f6 字段重命名

chtrl + alt + m -- Extract method 提取方法

ctrl + alt + p introduce parameter 抽取为方法参数

ctrl + alt + n 内联

F6 或者 ctrl + alt + shfit + t move instance method

ctrl + e 页面切换

在实际代码中，有些具有实际意义的对象直接用基本类型进行判断，比如 字符串进行判定type = a xxx type = b xxx
暴露了内部细节，内聚性差，
对象取代基本类型，子类取代类型，多态取代条件表达式，提炼类，引入参数对象

提炼航线对象1
提炼航线接口，多态
提炼坐标对象

步骤：
1、fly 参数提取到类 ctrl + alt + shift + t  -- introduce paramter object 将方法参数提取为类
    shift + f6 字段重命名
2、大的for内容提取方法
3、提取的方法参数提取类,注意提出类型
3、第一个fly需要引入coordinate对象，先复制一份,手动将入参的list转对象
   forEach 中的fly alt + enter 可以简化
4、为了兼容新的flytemp 原来的fly中需要将list 转换
5、将原来fly入参中的list转换 ctrl alt p 抽取为方法参数
6、内联 ctrl + alt + n
7、大的for中将长度校验和获取坐标提取方法，F6移动到坐标类中
至此坐标类的行为都封装好了

8、引入航线类，fly的两个参数 ctrl + alt + shift + t  -- introduce paramter object 将方法参数提取为类
9、对航线的行为进行处理，将校验内联回去，对整个for抽取，再放航线类
10、对airLine进行接口的抽取
    validdata先设置为pulic
    AirLine 类名改为shift + f6 ->> AbstractAirLine 后续多态
    ctrl + alt + shtft + t ->Extract Interface 提炼接口
11、多态+工厂取代表达式
    选中AbstractAirLine，alt + enter  --create subclass
12、选择AbstractAirLine 的构造方法，ctrl + alt + shift + t --> replace Constructor with factory method,使用工厂替代构造方法
13、ctrl + alt + c,提炼常量， 或者 ctrl + alt + sthift + t -->introduce Constant
14、两个常量挪动到airline   F6
15、工厂方法中，根据类型创建不同的类

16、校验中airLineType进行内联
17、for中的两个if一起抽取
18、将方法下推，ctrl + alt + shirt + t --》 push Members down  注意勾选抽象
把多余的干掉
19、两个子类的抽象方法，类型是确定的，所以可以用常量，参数，alt+del

结束
习惯性把工厂方法放到单独的一个类中 F6
ctrl + alt + shift + t -> Move static memberts
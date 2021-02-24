## 1. JAVA 概述

## 2. 基本语法

## 3. 数组

### 3.1 数组概述

#### 1.数组的理解：

数组(Array)，是多个相同类型数据一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理



#### 2.数组相关的概念：

数组名

元素

角标、下标、索引

数组的长度：元素的个数



#### 3.数组的特点：

1.数组是序排列的

2.数组属于引用数据类型的变量。数组的元素，既可以是基本数据类型，也可以是引用数据类型

3.创建数组对象会在内存中开辟一整块连续的空间

4.数组的长度一旦确定，就不能修改。



#### 4.数组的分类：

① 照维数：一维数组、二维数组、。。。

② 照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组

##### 数据结构：

1.数据与数据之间的逻辑关系：集合、一对一、一对多、多对多
2.数据的存储结构：
线性表：顺序表（比如：数组）、链表、栈、队列
树形结构：二叉树
图形结构：



##### 算法：

排序算法：
搜索算法：



### 3.2 一维数组

#### 1.一维数组的声明与初始化

```

	int num;//声明
	num = 10;//初始化
	int id = 1001;//声明 + 初始化
		
正确的方式：
	int[] ids;//声明
	//1.1 静态初始化:数组的初始化和数组元素的赋值操作同时进行
	ids = new int[]{1001,1002,1003,1004};
	//1.2动态初始化:数组的初始化和数组元素的赋值操作分开进行
	String[] names = new String[5];
	
	int[] arr4 = {1,2,3,4,5};//类型推断

错误的方式：
//		int[] arr1 = new int[];
//		int[5] arr2 = new int[5];
//		int[] arr3 = new int[3]{1,2,3};
```





#### 2.一维数组元素的引用：通过角标的方式调用。

```
	//数组的角标（或索引从0开始的，到数组的长度-1结束。
		names[0] = "王铭";
		names[1] = "王赫";
		names[2] = "张学良";
		names[3] = "孙居龙";
		names[4] = "王宏志";//charAt(0)
```



​	

#### 3.数组的属性：length

```
System.out.println(names.length);//5
System.out.println(ids.length);
```



##### 说明：数组一旦初始化，其长度就是确定的。arr.length

#####              数组长度一旦确定，就不可修改。



#### 4.一维数组的遍历

```
for(int i = 0;i < names.length;i++){
	System.out.println(names[i]);
}
```



#### 5.一维数组元素的默认初始化值

数组元素是整型：0

数组元素是浮点型：0.0

数组元素是char型：0或'\u0000'，而非'0'

数组元素是boolean型：false

数组元素是引用数据类型：null





#### 6.一维数组的内存解析

![image-20210221150515142](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221150515142.png)





### 3.2 二维数组

#### 1.如何理解二维数组？

数组属于引用数据类型
数组的元素也可以是引用数据类型
一个一维数组A的元素如果还是一个一维数组类型的，则，此数组A称为二维数组

#### 2.二维数组的声明与初始化

正确的方式：

	int[] arr = new int[]{1,2,3};//一维数组
		//静态初始化
		int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
		//动态初始化1
		String[][] arr2 = new String[3][2];
		//动态初始化2
		String[][] arr3 = new String[3][];
	//也是正确的写法：
		int[] arr4[] = new int[][]{{1,2,3},{4,5,9,10},{6,7,8}};
		int[] arr5[] = {{1,2,3},{4,5},{6,7,8}};//类型推断
错误的方式：

```
//		String[][] arr4 = new String[][4];
//		String[4][3] arr5 = new String[][];
//		int[][] arr6 = new int[4][3]{{1,2,3},{4,5},{6,7,8}};
```



#### 3.如何调用二维数组元素:

```
System.out.println(arr1[0][1]);//2
System.out.println(arr2[1][1]);//null
arr3[1] = new String[4];
System.out.println(arr3[1][0]);
System.out.println(arr3[0]);//
```

#### 4.二维数组的属性：

```
System.out.println(arr4.length);//3
System.out.println(arr4[0].length);//3
System.out.println(arr4[1].length);//4
```

#### 5.遍历二维数组元素

```
	for(int i = 0;i < arr4.length;i++){
		for(int j = 0;j < arr4[i].length;j++){
			System.out.print(arr4[i][j] + "  ");
		}
		System.out.println();
	}		
```



#### 6.二维数组元素的默认初始化值

![image-20210221151019103](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221151019103.png)

#### 7.二维数组的内存结构

![image-20210221151027419](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221151027419.png)





### 3.3 数组的常见算法

#### 1.数组的创建与元素赋值：

杨辉三角（二维数组）、回形数（二维数组）、6个数，

1-30之间随机生成且不重复

#### 2.针对于数值型的数组：

最大值、最小值、总和、平均数等

#### 3.数组的赋值与复制

```
int[] array1,array2;
array1 = new int[]{1,2,3,4};
```



##### 3.1 赋值：

```
array2 = array1;
```

如何理解：将array1保存的数组的地址值赋给了array2，使得array1和array2共同指向堆空间中的同一个数组实体。

![image-20210221151246937](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221151246937.png)

##### 3.2 复制：

```
array2 = new int[array1.length];
for(int i = 0;i < array2.length;i++){
	array2[i] = array1[i];
}
```

如何理解：我们通过new的方式，给array2在堆空间中新开辟了数组的空间。将array1数组中的元素值一个一个的赋值到array2数组中。

#### 4.数组元素的反转

```
//方法一：
//		for(int i = 0;i < arr.length / 2;i++){
//			String temp = arr[i];
//			arr[i] = arr[arr.length - i -1];
//			arr[arr.length - i -1] = temp;
//		}

//方法二：
//		for(int i = 0,j = arr.length - 1;i < j;i++,j--){
//			String temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}
```



##### 5.数组中指定元素的查找：搜索、检索

##### 5.1 线性查找： 

实现思路：通过遍历的方式，一个一个的数据进行比较、查找。
适用性：具有普遍适用性。

##### 5.2 二分法查找：

实现思路：每次比较中间值，折半的方式检索。
适用性：（前提：数组必须有序）

#### 6.数组的排序算法

![image-20210221151456555](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221151456555.png)



![image-20210221151516037](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221151516037.png)

![image-20210221151539650](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221151539650.png)

##### 4.手写冒泡

	int[] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};
		
		//冒泡排序
		for(int i = 0;i < arr.length - 1;i++){
			
			for(int j = 0;j < arr.length - 1 - i;j++){
				
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				
			}
			
		}		


### 3.4 Arrays 工具类的使用

#### 1.理解：

① 定义在java.util包下。
② Arrays:提供了很多操作数组的方法。

#### 2.使用：

	//1.boolean equals(int[] a,int[] b):判断两个数组是否相等。
		int[] arr1 = new int[]{1,2,3,4};
		int[] arr2 = new int[]{1,3,2,4};
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
		//2.String toString(int[] a):输出数组信息。
		System.out.println(Arrays.toString(arr1));
		
		//3.void fill(int[] a,int val):将指定值填充到数组之中。
		Arrays.fill(arr1,10);
		System.out.println(Arrays.toString(arr1));
		
		//4.void sort(int[] a):对数组进行排序。
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		//5.int binarySearch(int[] a,int key)
		int[] arr3 = new int[]{1,2....}		   
		int index = Arrays.binarySearch(arr3, 210);
		if(index >= 0){
			System.out.println(index);
		}else{
			System.out.println("未找到");
		}


​					



### 3.5 数组常见异常

#### 1.数组角标越界异常：ArrayIndexOutOfBoundsException

		int[] arr = new int[]{1,2,3,4,5};
		//		for(int i = 0;i <= arr.length;i++){
		//			System.out.println(arr[i]);
		//		}
			
		//		System.out.println(arr[-2]);
			
		//		System.out.println("hello");

#### 2.空指针异常：NullPointerException

```
//情况一：
//		int[] arr1 = new int[]{1,2,3};
//		arr1 = null;
//		System.out.println(arr1[0]);

//情况二：
//		int[][] arr2 = new int[4][];
//		System.out.println(arr2[0][0]);

//情况：
	String[] arr3 = new String[]{"AA","BB","CC"};
	arr3[0] = null;
	System.out.println(arr3[0].toString());		
```

##### 小知识：一旦程序出现异常，未处理时，就终止执行。





## 4. 面向对象 - 上







## 5.  面向对象 - 中

### 5.1 面向对象的特征二：继承性

#### 1.  为什么要有类的继承性？(继承性的好处）

 1.  减少了代码的冗余，提高了代码的复用性

 2.  便于功能的扩展

 3.  为之后多态性的使用，提供了前提

  ![image-20210215102944542](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210215102944542.png)



#### 2. 继承性的格式：

class A extends B{}


 A:子类、派生类、subclass

 B:父类、超类、基类、superclass



#### 3. 子类继承父类以后有哪些不同？

##### 3.1 体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的所有的属性和方法。

特别的，父类中声明为private的属性或方法，子类继承父类以后，仍然认为获取了父类中私的结构。只因为封装性的影响，使得子类不能直接调用父类的结构而已。



##### 3.2 子类继承父类以后，还可以声明自己特有的属性或方法：实现功能的拓展。

 子类和父类的关系，不同于子集和集合的关系。
 extends：延展、扩展



#### 4. Java中继承性的说明

1.一个类可以被多个子类继承。

2.Java中类的单继承性：一个类只能有一个父类

3.子父类是相对的概念。

4.子类直接继承的父类，称为：直接父类。间接继承的父类称为：间接父类

5.子类继承父类以后，就获取了直接父类以及所间接父类中声明的属性和方法

![image-20210215103211173](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210215103211173.png)

#### 5. java.lang.Object类的理解

1.如果我们没显式的声明一个类的父类的话，则此类继承于java.lang.Object类

2.所的java类（除java.lang.Object类之外都直接或间接的继承于java.lang.Object类

3.意味着，所的java类具有java.lang.Object类声明的功能。





### 5.2 方法的重写

#### 1. 什么是方法的重写(override 或 overwrite)？

子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作

#### 2. 应用

重写以后，当创建子类对象以后，通过子类对象调用子父类中的同名同参数的方法时，实际执行的是子类重写父类的方法

#### 3. 举例

#### 4. 重写的规则

方法的声明： 权限修饰符  返回值类型  方法名(形参列表) throws 异常的类型{
 								 //方法体

约定俗称：子类中的叫重写的方法，父类中的叫被重写的方法

1.子类重写的方法的方法名和形参列表与父类被重写的方法的方法名和形参列表相同

2.子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符

特殊情况：子类不能重写父类中声明为private权限的方法

3.返回值类型：

3.1 父类被重写的方法的返回值类型是void，则子类重写的方法的返回值类型只能是void
	
3.2 父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或A类的子类
	
3.3 父类被重写的方法的返回值类型是基本数据类型(比如：double)，则子类重写的方法的返回值类型必须是相同的基本数据类型(必须也是double)

4.子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型（具体放到异常处理时候讲）

注：子类和父类中的同名同参数的方法要么都声明为非static的（考虑重写，要么都声明为static的（不是重写)。	



#### 5. 面试题
区分方法的重写和重载？
答： ① 二者的概念：
         ② 重载和重写的具体规则
         ③ 重载：不表现为多态性

重写：表现为多态性。
重载：是指允许存在多个同名方法，而这些方法的参数不同。编译器根据方法不同的参数表，对同名方法的名称做修饰。对于编译器而言，这些同名方法就成了不同的方法。它们的调用地址在编译期就绑定了。Java的重载是可以包括父类和子类的，即子类可以重载父类的同名不同参数的方法。

所以：对于重载而言，在方法调用之前，编译器就已经确定了所要调用的方法，这称为“**早绑定**”或“**静态绑定**”；

而对于多态，只等到方法调用的那一刻，解释运行器才会确定所要调用的具体方法，这称为“**晚绑定**”或“**动态绑定**”。 

引用一句Bruce Eckel的话：“不要犯傻，如果它不是晚绑定，它就不是多态。”





### 5.3 关键字 super

#### 1. super 关键字可以理解为：父类的

#### 2.可以用来调用的结构：

属性、方法、构造器

#### 3. super调用属性、方法：

3.1 我们可以在子类的方法或构造器中。通过使用"super.属性"或"super.方法"的方式，显式的调用父类中声明的属性或方法。但是，通常情况下，我们习惯省略"super."
3.2 特殊情况：当子类和父类中定义了同名的属性时，我们要想在子类中调用父类中声明的属性，则必须显式的使用"super.属性"的方式，表明调用的是父类中声明的属性。
3.3 特殊情况：当子类重写了父类中的方法以后，我们想在子类的方法中调用父类中被重写的方法时，则必须显式的使用"super.方法"的方式，表明调用的是父类中被重写的方法。

#### 4. super调用构造器：

4.1  我们可以在子类的构造器中显式的使用"super(形参列表)"的方式，调用父类中声明的指定的构造器
4.2 "super(形参列表)"的使用，必须声明在子类构造器的首行！
4.3 我们在类的构造器中，针对于"this(形参列表)"或"super(形参列表)"只能二一，不能同时出现
4.4 在构造器的首行，没显式的声明"this(形参列表)"或"super(形参列表)"，则默认调用的是父类中空参的构造器：super()
4.5 在类的多个构造器中，至少一个类的构造器中使用了"super(形参列表)"，调用父类中的构造器



### 5.3 子类对象实例化全过程

#### 1.从结果上看：继承性

子类继承父类以后，就获取了父类中声明的属性或方法。
创建子类的对象，在堆空间中，就会加载所父类中声明的属性。

#### 2.从过程上看：

当我们通过子类的构造器创建子类对象时，我们一定会直接或间接的调用其父类的构造器，进而调用父类的父类的构造器，...直到调用了java.lang.Object类中空参的构造器为止。正因为加载过所的父类的结构，所以才可以看到内存中父类中的结构，子类对象才可以考虑进行调用。

![image-20210215171734068](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210215171734068.png)

#### 3.强调说明：

虽然创建子类对象时，调用了父类的构造器，但是自始至终就创建过一个对象，即为new的子类对象。

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210215172059526.png" alt="image-20210215172059526" style="zoom: 67%;" />

### 5.4 面向对象的特征三：多态

#### 1.多态性的理解：可以理解为一个事物的多种形态。

#### 2.何为多态性：

对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
举例：
Person p = new Man();
Object obj = new Date();

#### 3.多态性的使用：虚拟方法调用

有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
总结：编译，看左边；运行，看右边。

#### 4.多态性的使用前提：

① 类的继承关系  ② 方法的重写

#### 5.多态性的应用举例：

举例一：

public void func(Animal animal){//Animal animal = new Dog();
	animal.eat();
	animal.shout();
}
举例二：
public void method(Object obj){

}

举例三：
class Driver{

public void doData(Connection conn){//conn = new MySQlConnection(); / conn = new OracleConnection();
		//规范的步骤去操作数据
//		conn.method1();
//		conn.method2();
//		conn.method3();
			}

}

#### 6.多态性使用的注意点：

对象的多态性，只适用于方法，不适用于属性（编译和运行都看左边）

#### 7.关于向上转型与向下转型：

#### 7.1 向上转型：多态

#### 7.2 向下转型：

#### 7.2.1 为什么使用向下转型：

有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，导致编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。如何才能调用子类特的属性和方法？使用向下转型。

#### 7.2.2 如何实现向下转型：

使用强制类型转换符：()

#### 7.2.3 使用时的注意点：

① 使用强转时，可能出现ClassCastException的异常。
② 为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型。

#### 7.2.4 instanceof的使用：

① a instanceof A:判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false。
② 如果 a instanceof A返回true,则 a instanceof B也返回true.其中，类B是类A的父类。
③ 要求a所属的类与类A必须是子类和父类的关系，否则编译错误。

#### 7.2.5 图示：

![image-20210217130104175](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210217130104175.png)

#### 8. 面试题：

8.1 谈谈你对多态性的理解？
① 实现代码的通用性。
② Object类中定义的public boolean equals(Object obj){  }
 JDBC:使用java程序操作(获取数据库连接、CRUD)数据库(MySQL、Oracle、DB2、SQL Server)
③ 抽象类、接口的使用肯定体现了多态性。（抽象类、接口不能实例化）
8.2 多态是编译时行为还是运行时行为？





### 5.5 Object类的使用

#### 1.java.lang.Object类的说明：

1.Object类是所Java类的根父类
2.如果在类的声明中未使用extends关键字指明其父类，则默认父类为 java.lang.Object类 
3.Object类中的功能(属性、方法)就具通用性。
	 属性：无
 	方法：equals() / toString() / getClass() /hashCode() / clone() / finalize()
 wait() 、 notify()、notifyAll()

4.Object类只声明了一个空参的构造器

##### 2.equals()方法
#### 2.1 equals()的使用：
1.是一个方法，而非运算符
2.只能适用于引用数据类型
3.Object类中equals()的定义：
 public boolean equals(Object obj) {
           return (this == obj);
     }
说明：Object类中定义的equals()和==的作用是相同的：比较两个对象的地址值是否相同.即两个引用是否指向同一个对象实体

4.像String、Date、File、包装类等都重写了Object类中的equals()方法。重写以后，比较的不是两个引用的地址是否相同，而是比较两个对象的"实体内容"是否相同。 

5.通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的"实体内容"是否相同。那么，我们就需要对Object类中的equals()进行重写.
重写的原则：比较两个对象的实体内容是否相同.

#### 2.2 如何重写equals()

#### 2.2.1 手动重写举例：

class User{
String name;
int age;
//重写其equals()方法
public boolean equals(Object obj){
	if(obj == this){
		return true;
	}
	if(obj instanceof User){
		User u = (User)obj;
		return this.age == u.age && this.name.equals(u.name);
	}
	return false;
}
}

#### 2.2.2 开发中如何实现：自动生成的

#### 3. 回顾 == 运算符的使用：

== ：运算符

 * 可以使用在基本数据类型变量和引用数据类型变量中
 * 如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。（不一定类型要相同）

如果比较的是引用数据类型变量：比较两个对象的地址值是否相同.即两个引用是否指向同一个对象实体

补充： == 符号使用时，必须保证符号左右两边的变量类型一致。

toString()方法

#### 3.1 toString()的使用：

当我们输出一个对象的引用时，实际上就是调用当前对象的toString()



Object类中toString()的定义：

public String toString() {
   return getClass().getName() + "@" + Integer.toHexString(hashCode());
}



像String、Date、File、包装类等都重写了Object类中的toString()方法。

使得在调用对象的toString()时，返回"实体内容"信息



自定义类也可以重写toString()方法，当调用此方法时，返回对象的"实体内容"

#### 3.2 如何重写toString()

举例：
//自动实现

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

#### 4.面试题：

① final、finally、finalize的区别？
②  == 和 equals() 区别



### 5.6 单元测试

Java中的JUnit单元测试



步骤：

1.中当前工程 - 右键择：build path - add libraries - JUnit 4 - 下一步

2.创建Java类，进行单元测试。

此时的Java类要求：① 此类是public的  ②此类提供公共的无参的构造器

3.此类中声明单元测试方法。

此时的单元测试方法：方法的权限是public,没返回值，没形参



4.此单元测试方法上需要声明注解：@Test01,并在单元测试类中导入：import org.junit.Test01;



5.声明好单元测试方法以后，就可以在方法体内测试相关的代码。

6.写完代码以后，左键双击单元测试方法名，右键：run as - JUnit Test01



说明：

1.如果执行结果没任何异常：绿条

2.如果执行结果出现异常：红条



### 5.7 包装类

#### 1.为什么要有包装类(或封装类）

为了使基本数据类型的变量具有类的特征，引入包装类。

#### 2.基本数据类型与对应的包装类：

![image-20210217135004689](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210217135004689.png)

#### 3.需要掌握的类型间的转换：（基本数据类型、包装类、String）

![image-20210217135010336](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210217135010336.png)

###### 简易版：

基本数据类型<--->包装类：JDK 5.0 新特性：自动装箱 与自动拆箱
基本数据类型、包装类--->String:调用String重载的valueOf(Xxx xxx)
String--->基本数据类型、包装类:调用包装类的parseXxx(String s)
     注意：转换时，可能会报NumberFormatException
应用场景举例：
① Vector类中关于添加元素，只定义了形参为Object类型的方法：
v.addElement(Object obj);   //基本数据类型 --->包装类 --->使用多态

###### 



## 6. 面向对象 - 下

### 6.1 关键字 static

#### static:静态的

#### 1.可以用来修饰的结构：主要用来修饰类的内部结构

属性、方法、代码块、内部类

#### 2.static修饰属性：静态变量（或类变量）

##### 2.1 属性，是否使用static修饰，又分为：静态属性  vs 非静态属性(实例变量)

实例变量：我们创建了类的多个对象，每个对象都独立的拥一套类中的非静态属性。当修改其中一个对象中的非静态属性时，不会导致其他对象中同样的属性值的修改。

静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量。当通过某一个对象修改静态变量时，会导致其他对象调用此静态变量时，是修改过了的。

##### 2.2 static修饰属性的其他说明：

① 静态变量随着类的加载而加载。可以通过"类.静态变量"的方式进行调用

② 静态变量的加载要早于对象的创建。

③ 由于类只会加载一次，则静态变量在内存中也只会存在一份：存在方法区的静态域中。

④		类变量	实例变量

类		yes		no

对象	yes		yes

​	

##### 2.3 静态属性举例：System.out; Math.PI;

#### 3.静态变量内存解析：

![image-20210219122455809](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210219122455809.png)

#### 4.static修饰方法：静态方法、类方法

① 随着类的加载而加载，可以通过"类.静态方法"的方式进行调用
②			          静态方法	非静态方法

​	类		    yes		no

​	对象		yes		yes
③ 静态方法中，只能调用静态的方法或属性
  非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性

##### static的注意点：

##### 5.1 在静态的方法内，不能使用this关键字、super关键字

##### 5.2 关于静态属性和静态方法的使用，大家都从生命周期的角度去理解。

#### 6.如何判定属性和方法应该使用static关键字：

##### 6.1 关于属性

属性是可以被多个对象所共享的，不会随着对象的不同而不同的。
类中的常量也常常声明为static

##### 6.2 关于方法

操作静态属性的方法，通常设置为static的
工具类中的方法，习惯上声明为static的。 比如：Math、Arrays、Collections

#### 7.使用举例：

举例一：Arrays、Math、Collections等工具类
举例二：单例模式
举例三：

````
class Circle{

	private double radius;
	private int id;//自动赋值
	
	public Circle(){
	id = init++;
	total++;
	}
	
	public Circle(double radius){
	this();
		id = init++;
		total++;
		this.radius = radius;
		

	}
	
	private static int total;//记录创建的圆的个数
	private static int init = 1001;//static声明的属性被所对象所共享
	
	public double findArea(){
		return 3.14 * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public int getId() {
		return id;
	}
	
	public static int getTotal() {
		return total;
	}
}
````



#### 6.1.1 单例模式

#### 1.设计模式的说明

##### 1.1 理解

设计模式是在大量的实践中总结和理论化之后优的代码结构、编程风格、以及解决问题的思考方式。

##### 1.2 常用设计模式  --- 23种经典的设计模式  GOF

创建型模式，共5种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。 
结构型模式，共7种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。 
行为型模式，共11种：策略模式、模板方法模式、观察者模式、迭代器模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。 

#### 2.单例模式

##### 2.1 要解决的问题：

所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。

##### 2.2 具体代码的实现：

饿汉式1：
````
class Bank{
	
	//1.私化类的构造器
	private Bank(){
		
	}
	
	//2.内部创建类的对象
	//4.要求此对象也必须声明为静态的
	private static Bank instance = new Bank();
	
	//3.提供公共的静态的方法，返回类的对象
	public static Bank getInstance(){
		return instance;
	}
}
````
饿汉式2：使用了静态代码块
````
class Order{
	
	//1.私化类的构造器
	private Order(){
		
	}
	
	//2.声明当前类对象，没初始化
	//4.此对象也必须声明为static的
	private static Order instance = null;
	
	static{
		instance = new Order();
 }
	
	//3.声明public、static的返回当前类对象的方法
	public static Order getInstance(){
		return instance;
	}

}
````
懒汉式：
````
class Order{
	
	//1.私化类的构造器
	private Order(){
		
	}
	
	//2.声明当前类对象，没初始化
	//4.此对象也必须声明为static的
	private static Order instance = null;
	
	//3.声明public、static的返回当前类对象的方法
	public static Order getInstance(){
		
		if(instance == null){
			
			instance = new Order();
			
		}
		return instance;
	}
}
````

##### 2.3 两种方式的对比：

饿汉式：	

坏处：对象加载时间过长。

好处：饿汉式是线程安全的



懒汉式：好处：延迟对象的创建。

目前的写法坏处：线程不安全。--->到多线程内容时，再修改



### 6.2 main 

main()方法作为程序的入口

main()方法也是一个普通的静态方法

main()方法可以作为我们与控制台交互的方式。（之前：使用Scanner）

如何将控制台获取的数据传给形参：String[] args?
  运行时：java 类名 "Tom" "Jerry" "123" "true"

sysout(args[0]);//"Tom"
sysout(args[3]);//"true"  -->Boolean.parseBoolean(args[3]);
sysout(args[4]);//报异常

小结：一叶知秋
public static void main(String[] args){//方法体}

权限修饰符：private 缺省 protected pubilc ---->封装性
修饰符：static \ final \ abstract \native 可以用来修饰方法
返回值类型： 无返回值 / 有返回值 -->return
方法名：需要满足标识符命名的规则、规范；"见名知意"
形参列表：重载 vs 重写；参数的值传递机制；体现对象的多态性
方法体：来体现方法的功能

````
main(){
Person p = new Man();
p.eat();
//p.earnMoney();

Man man = new Man();
man.eat();
man.earnMoney();
}
````




### 6.3 类的结构： 代码块

类的成员之四：代码块(初始化块)（重要性较属性、方法、构造器差一些）

#### 1.代码块的作用：用来初始化类、对象的信息

#### 2.分类：代码块要是使用修饰符，只能使用static

分类：静态代码块  vs 非静态代码块

#### 3.1 静态代码块：

内部可以输出语句
随着类的加载而执行,而且只执行一次
作用：初始化类的信息
如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
静态代码块的执行要优先于非静态代码块的执行
静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构

#### 3.2 非静态代码块：

内部可以输出语句
随着对象的创建而执行
每创建一个对象，就执行一次非静态代码块
作用：可以在创建对象时，对对象的属性等进行初始化
如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
非静态代码块内可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法



#### 4.实例化子类对象时，涉及到父类、子类中静态代码块、非静态代码块、构造器的加载顺序：

对应的练习：LeafTest.java / Son.java
由父及子，静态先行。

#### 6.3.1  执行顺序

①默认初始化

②显式初始化/⑤在代码块中赋值

③构造器中初始化

④有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值



执行的先后顺序：① - ② / ⑤ - ③ - ④





### 6.4  关键字 final

#### 1.可以用来修饰：类、方法、变量

#### 2.具体的：

##### 2.1 final 用来修饰一个类:此类不能被其他类所继承。

比如：String类、System类、StringBuffer类

##### 2.2 final 用来修饰方法：表明此方法不可以被重写

比如：Object类中getClass();

##### 2.3 final 用来修饰变量：此时的"变量"就称为是一个常量

final修饰属性：可以考虑赋值的位置：显式初始化、代码块中初始化、构造器中初始化

final修饰局部变量：

尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋一个实参。一旦赋值以后，就只能在方法体内使用此形参，但不能进行重新赋值。

static final 用来修饰属性：全局常量







### 6.5 关键字 abstract

#### 1.可以用来修饰：类、方法

#### 2.具体的：

abstract修饰类：抽象类

#####  此类不能实例化

 抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作 --->抽象的使用前提：继承性

##### abstract修饰方法：抽象方法

抽象方法只方法的声明，没方法体
包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
若子类重写了父类中的所的抽象方法后，此子类方可实例化
若子类没重写父类中的所的抽象方法，则此子类也是一个抽象类，需要使用abstract修饰

#### 3.注意点：

1.abstract不能用来修饰：属性、构造器等结构

2.abstract不能用来修饰私方法、静态方法、final的方法、final的类

#### 4.abstract的应用举例：

举例一：

![image-20210220161805465](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210220161805465.png)

举例二：
 ````
abstract class GeometricObject{
public abstract double findArea();
}
class Circle extends GeometricObject{
private double radius;
public double findArea(){
		return 3.14 * radius * radius;
};
}
 ````

举例三：
IO流中设计到的抽象类：InputStream/OutputStream / Reader /Writer。在其内部
定义了抽象的read()、write()方法。





### 6.6 关键字 interface

#### 1.使用说明：

1.1接口使用interface来定义

1.2Java中，接口和类是并列的两个结构

1.3如何定义接口：定义接口中的成员



1.3.1 JDK7及以前：只能定义全局常量和抽象方法

全局常量：public static final的.但是书写时，可以省略不写

抽象方法：public abstract的



1.3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法

接口中不能定义构造器的！意味着接口不可以实例化

Java开发中，接口通过让类去实现(implements)的方式来使用.



如果实现类覆盖了接口中的所抽象方法，则此实现类就可以实例化

如果实现类没覆盖接口中所的抽象方法，则此实现类仍为一个抽象类



Java类可以实现多个接口   --->弥补了Java单继承性的局限性

格式：class AA extends BB implements CC,DD,EE



接口与接口之间可以继承，而且可以多继承

接口的具体使用，体现多态性

接口，实际上可以看做是一种规范

##### 2.举例：

![image-20210220164720342](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210220164720342.png)

````
class Computer{
	public void transferData(USB usb){
	//USB usb = new Flash();
		usb.start();
		
		System.out.println("具体传输数据的细节");
		
		usb.stop();
	}	
}
````



````
interface USB{
	//常量：定义了长、宽、最大最小的传输速度等
	

	void start();
	
	void stop();

}

class Flash implements USB{

	@Override
	public void start() {
		System.out.println("U盘开启工作");
	}
	
	@Override
	public void stop() {
		System.out.println("U盘结束工作");
	}

}

class Printer implements USB{
	@Override
	public void start() {
		System.out.println("打印机开启工作");
	}

	@Override
	public void stop() {
		System.out.println("打印机结束工作");
	}

}
````

#####  体会：

1.接口使用上也满足多态性

2.接口，实际上就是定义了一种规范

3.开发中，体会面向接口编程！	

#### 3.体会面向接口编程的思想

![image-20210220164820724](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210220164820724.png)

面向接口编程：我们在应用程序中，调用的结构都是JDBC中定义的接口，不会出现具体某一个数据库厂商的API。

#### 4. Java8中关于接口的新规范

//知识点1：接口中定义的静态方法，只能通过接口来调用。

//知识点2：通过实现类的对象，可以调用接口中的默认方法。
//如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法

//知识点3：如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的默认方法，那么子类在没重写此方法的情况下，默认调用的是父类中的同名同参数的方法。-->类优先原则
//知识点4：如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，
//那么在实现类没重写此方法的情况下，报错。-->接口冲突。
//这就需要我们必须在实现类中重写此方法
//知识点5：如何在子类(或实现类)的方法中调用父类、接口中被重写的方法

````
	public void myMethod(){
		method3();//调用自己定义的重写的方法
		super.method3();//调用的是父类中声明的
		//调用接口中的默认方法
		CompareA.super.method3();
		CompareB.super.method3();
	}
````



#### 5.面试题：

抽象类和接口的异同？
相同点：不能实例化；都可以包含抽象方法的。
不同点：
1）把抽象类和接口(java7,java8,java9)的定义、内部结构解释说明
2）类：单继承性    接口：多继承
      类与接口：多实现



#### 6.6.1 代理模式

##### 1.解决的问题

代理模式是Java开发中使用较多的一种设计模式。代理设计就是为其他对象提供一种代理以控制对这个对象的访问。 

##### 2.举例

```
interface NetWork{
public void browse();
}

//被代理类
class Server implements NetWork{

	@Override
	public void browse() {
		System.out.println("真实的服务器访问网络");
	}

}
//代理类
class ProxyServer implements NetWork{
	

	private NetWork work;
	
	public ProxyServer(NetWork work){
		this.work = work;
	}


	public void check(){
		System.out.println("联网之前的检查工作");
	}
	
	@Override
	public void browse() {
		check();
		
		work.browse();
		
	}

}
```





##### 3.应用场景

![image-20210220165506183](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210220165506183.png)



#### 6.6.2 工厂模式

##### 1.解决的问题

实现了创建者与调用者的分离，即将创建对象的具体过程屏蔽隔离起来，达到提高灵活性的目的。

##### 2.具体模式

简单工厂模式：用来生产同一等级结构中的任意产品。（对于增加新的产品，需要修改已有代码）
工厂方法模式：用来生产同一等级结构中的固定产品。（支持增加任意产品)
抽象工厂模式：用来生产不同产品族的全部产品。（对于增加新的产品，无能为力；支持增加产品族)







### 6.7 类的结构：内部类

内部类：类的第五个成员

#### 1.定义：Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类.

#### 2.内部类的分类：

成员内部类（静态、非静态 ） vs 局部内部类(方法内、代码块内、构造器内)

#### 3.成员内部类的理解：

一方面，作为外部类的成员：
调用外部类的结构
可以被static修饰
可以被4种不同的权限修饰

另一方面，作为一个类：
 类内可以定义属性、方法、构造器等
 可以被final修饰，表示此类不能被继承。言外之意，不使用final，就可以被继承
 可以被abstract修饰

#### 4.成员内部类：

##### 4.1如何创建成员内部类的对象？(静态的，非静态的)

````
//创建静态的Dog内部类的实例(静态的成员内部类):
Person.Dog dog = new Person.Dog();

//创建非静态的Bird内部类的实例(非静态的成员内部类):
//Person.Bird bird = new Person.Bird();//错误的
Person p = new Person();
Person.Bird bird = p.new Bird();
````

##### 4.2如何在成员内部类中调用外部类的结构？

````
class Person{
	String name = "小明";
public void eat(){
}
//非静态成员内部类
	class Bird{
		String name = "杜鹃";
		public void display(String name){
			System.out.println(name);//方法的形参
			System.out.println(this.name);//内部类的属性
			System.out.println(Person.this.name);//外部类的属性
		//Person.this.eat();
		}
	}
}
````

#### 5.局部内部类的使用：

````
//返回一个实现了Comparable接口的类的对象
	public Comparable getComparable(){
		
		//创建一个实现了Comparable接口的类:局部内部类
		//方式一：
//		class MyComparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}
//			
//		}
//		
//		return new MyComparable();
		
		//方式二：
		return new Comparable(){

			@Override
			public int compareTo(Object o) {
				return 0;
			}	
		};		
	}
````

##### 注意点：

在局部内部类的方法中（比如：show如果调用局部内部类所声明的方法(比如：method)中的局部变量(比如：num)的话,要求此局部变量声明为final的。

jdk 7及之前版本：要求此局部变量显式的声明为final的
jdk 8及之后的版本：可以省略final的声明

##### 总结：

成员内部类和局部内部类，在编译以后，都会生成字节码文件。
格式：成员内部类：外部类$内部类名.class
            局部内部类：外部类$数字 内部类名.class





## 7. 异常处理

### 7.1 常见异常

#### 1.异常的体系结构



![image-20210221125131712](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221125131712.png)

![image-20210221125151281](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221125151281.png)

2.从程序执行过程，看编译时异常和运行时异常

![image-20210221125206500](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221125206500.png)

编译时异常：执行javac.exe命名时，可能出现的异常
运行时异常：执行java.exe命名时，出现的异常

#### 3.常见的异常类型，请举例说明：

````
//******************以下是运行时异常***************************
	//ArithmeticException
	@Test
	public void test6(){
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}
	

	//InputMismatchException
	@Test
	public void test5(){
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		System.out.println(score);
		
		scanner.close();
	}
	
	//NumberFormatException
	@Test
	public void test4(){
		
		String str = "123";
		str = "abc";
		int num = Integer.parseInt(str);
	}
	
	//ClassCastException
	@Test
	public void test3(){
		Object obj = new Date();
		String str = (String)obj;
	}
	
	//IndexOutOfBoundsException
	@Test
	public void test2(){
		//ArrayIndexOutOfBoundsException

//		int[] arr = new int[10];
//		System.out.println(arr[10]);
		//StringIndexOutOfBoundsException
		String str = "abc";
		System.out.println(str.charAt(3));
	}
	

	//NullPointerException
	@Test
	public void test1(){

//		int[] arr = null;
//		System.out.println(arr[3]);
		

		String str = "abc";
		str = null;
		System.out.println(str.charAt(0));
		
	}
	
	//******************以下是编译时异常 
	@Test
	public void test7(){

//		File file = new File("hello.txt");
//		FileInputStream fis = new FileInputStream(file);
//		
//		int data = fis.read();
//		while(data != -1){
//			System.out.print((char)data);
//			data = fis.read();
//		}
//		
//		fis.close();
		

	}
````





### 7.2 异常处理

#### 1.java异常处理的抓抛模型

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221125450941.png" alt="image-20210221125450941" style="zoom: 150%;" />

#### 2.异常处理方式一：try-catch-finally

2.1 使用说明：

````
try{

    //可能出现异常的代码

    }catch(异常类型1 变量名1){
    //处理异常的方式1
    }catch(异常类型2 变量名2){
    //处理异常的方式2
    }catch(异常类型3 变量名3){
    //处理异常的方式3
    }
    ....
    finally{
    //一定会执行的代码
    }
````

![image-20210221125900228](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221125900228.png)



##### 2.3：[面试题] 

final、finally、finalize三者的区别？

类似：
throw 和 throws
Collection 和 Collections
String 、StringBuffer、StringBuilder
ArrayList 、 LinkedList
HashMap 、LinkedHashMap
重写、重载

结构不相似的：
抽象类、接口
== 、 equals()
sleep()、wait()

#### 3.异常处理方式二：throws

"throws + 异常类型"写在方法的声明处。指明此方法执行时，可能会抛出的异常类型。
一旦当方法体执行时，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throws后异常类型时，就会被抛出。异常代码后续的代码，就不再执行！

#### 4. 对比两种处理方式

try-catch-finally:真正的将异常给处理掉了。
throws的方式只是将异常抛给了方法的调用者。并没真正将异常处理掉。  



##### 5. 体会开发中应该如何选择两种处理方式？

5.1 如果父类中被重写的方法没throws方式处理异常，则子类重写的方法也不能使用throws，意味着如果子类重写的方法中异常，必须使用try-catch-finally方式处理。

5.2 执行的方法a中，先后又调用了另外的几个方法，这几个方法是递进关系执行的。我们建议这几个方法使用throws的方式进行处理。而执行的方法a可以考虑使用try-catch-finally方式进行处理。



##### 补充：

方法重写的规则之一：
子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型







### 7.3 手动抛出异常对象

#### 1.使用说明

在程序执行中，除了自动抛出异常对象的情况之外，我们还可以手动的throw一个异常类的对象。

#### 2.[面试题] 

throw 和  throws区别：
throw 表示抛出一个异常类的对象，生成异常对象的过程。声明在方法体内。
throws 属于异常处理的一种方式，声明在方法的声明处。

#### 3.典型例题

````
class Student{
	
	private int id;
	
	public void regist(int id) throws Exception {
		if(id > 0){
			this.id = id;
		}else{
			//手动抛出异常对象

//			throw new RuntimeException("您输入的数据非法！");
//			throw new Exception("您输入的数据非法！");
			throw new MyException("不能输入负数");

		}
		
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
}
````



### 7.4 自定义异常类

如何自定义一个异常类？

![image-20210221130851870](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221130851870.png)

```
public class MyException extends Exception{
	
	static final long serialVersionUID = -7034897193246939L;
	
	public MyException(){
		
	}
	
	public MyException(String msg){
		super(msg);
	}
}
```









## 8. 多线程

### 8.1 程序、进程、线程

#### 1. 程序(program)

是为完成特定任务、用某种语言编写的一组指令的集合。即指一 段静态的代码，静态对象

#### 2. 进程(process)

是程序的一次执行过程，或是正在运行的一个程序。是一个动态 的过程：有它自身的产生、存在和消亡的过程。——生命周期

说明：进程作为资源分配的单位，系统在运行时会为每个进程分配不同的内存区域

#### 3. 线程(thread)

进程可进一步细化为线程，是一个程序内部的一条执行路径

说明：线程作为调度和执行的单位，每个线程拥独立的运行栈和程序计数器(pc)，线程切换的开销小。



#### 4. 补充

内存结构

![image-20210224163236776](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210224163236776.png)



进程可以细化为多个线程。
每个线程，拥有自己独立的：栈、程序计数器
多个线程，共享同一个进程中的结构：方法区、堆





### 8.2 并发、并行

#### 1. 单核CPU与多核CPU的理解

单核CPU，其实是一种假的多线程，因为在一个时间单元内，也只能执行一个线程的任务。例如：虽然有多车道，但是收费站只有一个工作人员在收费，只有收了费才能通过，那么CPU就好比收费人员。如果某个人不想交钱，那么收费人员可以把他“挂起”（晾着他，等他想通了，准备好了钱，再去收费。）但是因为CPU时间单元特别短，因此感觉不出来。

如果是多核的话，才能更好的发挥多线程的效率。（现在的服务器都是多核的）

一个Java应用程序java.exe，其实至少三个线程：main()主线程，gc()垃圾回收线程，异常处理线程。当然如果发生异常，会影响主线程。



#### 2. 并行与并发的理解

并行：多个CPU同时执行多个任务。比如：多个人同时做不同的事。
并发：一个CPU(采用时间片)同时执行多个任务。比如：秒杀、多个人做同一件事







### 8.3 创建多线程的两种方式

#### 方式一：继承Thread类的方式：

1. 创建一个继承于Thread类的子类

2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中

3. 创建Thread类的子类的对象

4. 通过此对象调用start()：①启动当前线程 ② 调用当前线程的run()

##### 说明两个问题：

问题一：我们启动一个线程，必须调用start()，不能调用run()的方式启动线程。
问题二：如果再启动一个线程，必须重新创建一个Thread子类的对象，调用此对象的start().



#### 方式二：实现Runnable接口的方式：

1. 创建一个实现了Runnable接口的类

2. 实现类去实现Runnable中的抽象方法：run()

3. 创建实现类的对象

4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象

5. 通过Thread类的对象调用start()



##### 两种方式的对比：

开发中：优先选择：实现Runnable接口的方式

原因：1. 实现的方式没类的单继承性的局限性

2. 实现的方式更适合来处理多个线程共享数据的情况
   

##### 联系：public class Thread implements Runnable

**相同点**：两种方式都需要重写run(),将线程要执行的逻辑声明在run()中。
    			目前两种方式，要想启动线程，都是调用的Thread类中的start()



### 8.4 Thread 常用的方法

```
1. start():启动当前线程；调用当前线程的run()
2. run(): 通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
3. currentThread():静态方法，返回执行当前代码的线程
4. getName():获取当前线程的名字
5. setName():设置当前线程的名字
6. yield():释放当前cpu的执行权
7. join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态，直到线程 b 完全执行完以后，线程 a 才结束阻塞状态。
8. stop():已过时。当执行此方法时，强制结束当前线程。
9. sleep(long millitime):让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒时间内，当前线程是阻塞状态。
10. isAlive():判断当前线程是否存活
```

#### 线程的优先级

```

MAX_PRIORITY：10
MIN _PRIORITY：1 
NORM_PRIORITY：5  -->默认优先级

2.如何获取和设置当前线程的优先级：
  getPriority():获取线程的优先级
  setPriority(int p):设置线程的优先级
```

**说明**：高优先级的线程要抢占低优先级线程cpu的执行权。但是**只是从概率上讲**，高优先级的线程高概率的情况下被执行。**并不意味着只当高优先级的线程执行完以后，低优先级的线程才执行**

线程通信：wait() / notify() / notifyAll() :此三个方法定义在Object类中的



##### 补充：线程的分类

一种是守护线程，一种是用户线程


package Test02;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


/*
	// 方法引用

	1. 使用情景：当要传递给lambda体的操作，已经有实现的方法，可以使用方法引用

	2. 方法应用，本质上就是lambda表达式，而Lambda表达式作为函数式接口的实例出现
	    方法应用，也是函数是接口的使用

	3. 使用格式： 类（或对象） ::  方法名

	4. 具体分类如下的三者情况
	   情况1 对象 :: 非静态方法
	   情况2 类 :: 静态方法

	   情况3 类 :: 非静态方法

	5. 方法应用使用的要求：接口中的抽象方法的形参列表和返回值类型与方法引用的方法的形参列表和返回值类型相同
	   （针对于情况1，情况2）

	# 对于 lambda: 参数 -> 调用函数
	# 对于 方法引用：对象 -> 调用方法

 */
public class MethodRefTest {

	// 情况一：对象 :: 实例方法
	//Consumer中的void accept(T t)
	//PrintStream中的void println(T t)
	@Test
	public void test1() {
		// 常规方法
		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};


		// lambda 表达式写法
		Consumer<String> con1 = str -> System.out.println(str);
		con1.accept("北京");

		// 方法引用
		Consumer<String> con2 = System.out::println;   // system.out 为对象，println为方法
	}

	//Supplier中的T get()
	//Employee中的String getName()
	@Test
	public void test2() {
		Employee emo = new Employee(1001,"Tom",23,4500);
		Supplier<String> sup1 = () -> emo.getName();
		sup1.get();

		// 方法引用
		Supplier<String> sup2 = emo :: getName;
		sup2.get();
	}


	// 情况二：类 :: 静态方法
	//Comparator中的int compare(T t1,T t2)
	//Integer中的int compare(T t1,T t2)
	@Test
	public void test3() {
		Comparator<Integer> com1 = (t1,t2) -> Integer.compare(t1,t2);
		com1.compare(12,21);

		Comparator<Integer> com2 = Integer::compare;  // 两个形参列表相同，就不写了
		com2.compare(12, 3);
	}

	//Function中的R apply(T t)
	//Math中的Long round(Double d)
	@Test
	public void test4() {
		// 之前写法
		Function<Double, Long> fun1 = new Function<Double, Long>() {
			@Override
			public Long apply(Double d) {
				return Math.round(d);
			}
		};

		// lambda
		Function<Double, Long> func1 = d -> Math.round(d);

		// 方法引用
		Function<Double, Long> func2 = Math::round;
	}


	// 情况三：类 :: 实例方法 （有难度）
	// Comparator中的int comapre(T t1,T t2)
	// String中的int t1.compareTo(t2)
	@Test
	public void test5() {
		Comparator<String> com1 = (s1, s2) -> s1.compareTo(s2);
		System.out.println(com1.compare("abc", "dsa"));

		// 方法引用   / 当第一个参数作为方法的调用者出现的，也可以方法引用
		Comparator<String> com2 = String::compareTo;
		com2.compare("dd","aa");
	}

	//BiPredicate中的boolean test(T t1, T t2);
	//String中的boolean t1.equals(t2)
	@Test
	public void test6() {
		BiPredicate<String, String> pre1 = (s1, s2) -> s1.equals(s2);

		// 方法引用
		BiPredicate<String, String> pre2 = String::equals;
	}
	
	// Function中的R apply(T t)
	// Employee中的String getName();
	@Test
	public void test7() {
		Employee employee = new Employee(1001, "Tom", 23, 1000);
		Function<Employee,String> f1 = (s1) -> s1.getName();

		// 方法引用
		Function<Employee,String> f2 = Employee::getName;
	}
}

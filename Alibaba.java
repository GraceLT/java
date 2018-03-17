package practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/**
 * Java中所有的对象都是保存在堆中，而堆是供全局共享的。
 * 也就是说，如果同一个Java程序的不同方法，
 * 只要能拿到某个对象的引用，引用者就可以随意的修改对象的内部数据（前提是这个对象的内部数据通过get/set方法曝露出来）。
 * 有的时候，我们编写的代码想让调用者只获得该对象的一个拷贝（也就是一个内容完全相同的对象，但是在内存中存在两个这样的对象），有什么办法可以做到呢？当然是克隆咯。
 * @author LIAOTING
 *
 */
public class Alibaba implements Cloneable {
	private String username;
	private String password;
	private Date birthdate;
	public Alibaba(String username, String password, Date birthdate) {
		this.username = username;
		this.password = password;
		this.birthdate = birthdate;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[]args) throws CloneNotSupportedException {
		Alibaba u1 = new Alibaba("Kent", "123456", new Date());
		Alibaba u2 = u1;
		Alibaba u3 = (Alibaba) u1.clone();
		
		System.out.println(u1 == u2);		// true
		System.out.println(u1.equals(u2));	// true
		
		System.out.println(u1 == u3);		// false
		System.out.println(u1.equals(u3));	// false
		
		Map<String,String> m1=new HashMap<String,String>();
		m1.put(null, null);
		Map<String,String> m2=new Hashtable<String,String>();
		//m2.put(null, null);
		List l1=new ArrayList<Integer>();
		l1.add(0,"123");
//		List l2=new LinkedList<String>();
//		LinkedList l3=new LinkedList<String>();
//		ArrayList l4=new ArrayList<String>();
		
	}
	
}

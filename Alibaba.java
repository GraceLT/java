package practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/**
 * Java�����еĶ����Ǳ����ڶ��У������ǹ�ȫ�ֹ���ġ�
 * Ҳ����˵�����ͬһ��Java����Ĳ�ͬ������
 * ֻҪ���õ�ĳ����������ã������߾Ϳ���������޸Ķ�����ڲ����ݣ�ǰ�������������ڲ�����ͨ��get/set������¶��������
 * �е�ʱ�����Ǳ�д�Ĵ������õ�����ֻ��øö����һ��������Ҳ����һ��������ȫ��ͬ�Ķ��󣬵������ڴ��д������������Ķ��󣩣���ʲô�취���������أ���Ȼ�ǿ�¡����
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

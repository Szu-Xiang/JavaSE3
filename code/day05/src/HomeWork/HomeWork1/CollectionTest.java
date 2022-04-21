package HomeWork.HomeWork1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
    需求：请定义一个Collection类型的集合，存储以下字符串：
		“JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，”Java架构师之路”

请编程实现以下功能：
使用迭代器遍历所有元素，并打印
使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
	(注意：以上功能写在一个main()方法中，但请单独实现)

 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("JavaEE企业级开发指南");
        c.add("Oracle高级编程");
        c.add("MySQL从入门到精通");
        c.add("Java架构师之路");

        //获取迭代器
        Iterator<String> it = c.iterator();

        //遍历所有元素并打印
//        while (it.hasNext()) {
//            String s = it.next();
//            System.out.println(s);
//        }

        //使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印
//        while(it.hasNext()) {
//            String s = it.next();
//            if(s.length() < 10) {
//                System.out.println(s);
//            }
//        }
        //使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
//        while(it.hasNext()) {
//            String s = it.next();
//            if(s.contains("Java")) {
//                System.out.println(s);
//            }
//        }

        //如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
        while(it.hasNext()) {
            String s = it.next();
            if(s.contains("Oracle")) {
                it.remove();
            } else {
                System.out.println(s);
            }

        }
    }
}

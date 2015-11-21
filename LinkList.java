/**
 * Created by TR on 2015/11/21.
 */
//获取链表的首尾元素
import java.util.LinkedList;
public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");

        System.out.println("链表的第一个元素是 : " + lList.getFirst());
        System.out.println("链表最后一个元素是 : " + lList.getLast());
    }
}

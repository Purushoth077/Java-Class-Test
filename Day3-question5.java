import java.util.LinkedList;

public class SizeOfLinkedList {
    public static void main(String args[])
    {
        LinkedList<String> Opher = new LinkedList<String>();
        Opher.add("Hii");
        Opher.add("How");
        Opher.addLast("You");
        Opher.add(2, "Are"); 
        System.out.println(Opher+"\n"+"Size of list="+Opher.size());
}
}

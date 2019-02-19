import jdk.internal.cmm.SystemResourcePressureImpl;

public class Main {


    public static void main(String[] args ){


        Node root =  new Node(10);

        System.out.println(root.getData());
        root.insert(5);
        root.insert(15);
        root.insert(8);

        System.out.println("Left:" + root.getLeft().getData());
        System.out.println("Right: " + root.getRight().getData());

        root.contains(5);
        root.contains(10);



    }




}

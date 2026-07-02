package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class Person {

    int data;
    Person left;
    Person right;

    public Person(int val){
        this .data=val;
    }

    static void main() {
        Person root=new Person(1);
        root.left=new Person(2);
        root.right=new Person(3);
        root.left.left=new Person(4);

        helper(root,"");
        binaryTreePath(root);

    }

    private static void helper(Person root,String path){

        if(root==null){
            return;
        }
        System.out.println(root.data+"|before path"+path);

        if(path.isEmpty()){
            path=String.valueOf(root.data);
        }
        else {
            path=path+"=>"+root.data;
        }
        System.out.println("Updated path:"+ root.data+":"+path);

        if(root.left==null && root.right==null){
            System.out.println("Leaf found and path is :"+path);
        }

        helper(root.left,path);
        helper(root.right,path);

    }

    private static List<String> binaryTreePath(Person root){
        List<String> result =new ArrayList<>();
        help(root,"",result);
        return result;
    }

    private static void help(Person root,String path,List<String> result){

        if(root==null){
            return;
        }
        System.out.println("Empty path:"+path);

        if (path.isEmpty()) {
            path = String.valueOf(root.data);
        } else {
            path = path + "->" + root.data;
        }

        if (root.left == null && root.right == null) {
            System.out.println("Saving Path: " + path);
            result.add(path);
        }

        help(root.left, path, result);

        // GO RIGHT
        help(root.right, path, result);

        // EXIT
        System.out.println("Returning from: " + root.data);
    }

}

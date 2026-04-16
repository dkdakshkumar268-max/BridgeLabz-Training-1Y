import java.util.ArrayList;
import java.util.HashSet;

public class Question1 {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(2);
        al.add(3);
        al.add(3);
        al.add(3);
        System.out.println(al);
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<al.size();i++){
            hs.add(al.get(i));
        }
        System.out.println(hs);
    }
}
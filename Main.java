
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class Main{
    public static boolean containValues(char ar1[],char ar2[]){
        HashMap<Character,Boolean> hm=new HashMap<>();
        for(int i=0;i<ar1.length;i++){
            if(!hm.containsKey(ar1[i])){
                char item=ar1[i];
                hm.put(item,true);
            }
        }
        for(int j=0;j<ar2.length;j++){
            if(hm.containsKey(ar2[j])){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        char ar1[]={'a', 'b', 'c', 'x'};
        char ar2[]={'z', 'y', 'k'};
        System.out.println(containValues(ar1,ar2));
    }
}

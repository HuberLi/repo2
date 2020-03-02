package recursion;

/**
 * @Author Jalen
 * @Date 2020/1/2 14:56
 * @Description TODO
 **/
public class first {
    public static void main(String[] args) {
        char[] str={'a','b','c','d'};
        helper(0, str);
    }

    public static void helper(int index,char[] str){
        if(index>=str.length||str==null){
            return;
        }
        helper(index+1, str);
        System.out.println(str[index]);
    }

}

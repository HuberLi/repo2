package recursion;

/**
 * @Author Jalen
 * @Date 2020/1/2 15:29
 * @Description TODO
 **/
public class second {
    public static void main(String[] args) {
        char[] str={'a','b','c','d'};
        //reverse(str);
        //reverse01(str);
        int i=0;
        int j=str.length-1;
        while(i<j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        System.out.println(str);
    }

    /*public static void reverse(char[] str){
        int length=str.length;
        for(int i=0;i<length/2;i++){
            char temp=str[i];
            str[i]=str[length-1-i];
            str[length-1-i]=temp;
        }
    }*/

    /*public static void reverse01(char[] str){
        int i=0;
        int j=str.length-1;
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
    }*/
}

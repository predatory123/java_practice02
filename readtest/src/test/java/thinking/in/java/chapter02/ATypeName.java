package thinking.in.java.chapter02;

/**
 * @author: wenyongjie
 * @date: 2021/7/11 19:27
 */
public class ATypeName {

    public boolean typeString(Object s){
        if (s instanceof String) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        ATypeName a = new ATypeName();
        System.out.println(a.typeString("erer"));
    }
}

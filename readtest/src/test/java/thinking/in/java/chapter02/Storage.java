package thinking.in.java.chapter02;

/**
 * @author: wenyongjie
 * @date: 2021/7/11 20:48
 */
public class Storage {

   int storage(String s) {
       return s.length()*2;
   }

    public static void main(String[] args) {
        Storage storageString = new Storage();
        System.out.println(storageString.storage("hello"));
    }
}

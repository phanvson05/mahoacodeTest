/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahoacodetest;

/**
 *
 * @author This PC
 */
public class MahoacodeTest {
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String secrectKey = "ahahahaha";
    String salt = "kakakaka";
    //String in="hello world";
      System.out.println("da ma hoa:"+mahoaa.encrypt("hello world", "ahahahaha", "kakakaka"));
      String in=mahoaa.encrypt("hello world", "ahahahaha", "kakakaka");
        System.out.println("da giai ma hoa "+" "+ mahoaa.decrypt(in, secrectKey, salt));
      
    }
    
}

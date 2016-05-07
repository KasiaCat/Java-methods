
package palindrom;

public class Palindrom {

    public static void main(String[] args) {
        
        String s = "I'm Kasia";
        String r = "I'm myself";
        
        System.out.println(s.toLowerCase());
        System.out.println(s.replaceFirst(s,r));
        
        StringBuilder l = new StringBuilder();
        l.append(s);
        l.reverse();
        l.append(r).append("Who you are?").toString();
        l.reverse();
        l.replace(2, 3, r);
        l.charAt(4);
        
        
        System.out.println(l.capacity());
        System.out.println(s);
        System.out.println(l);
        
        
       
    }
    
}

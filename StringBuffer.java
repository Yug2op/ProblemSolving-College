public class StringBuffer {
    public static void main(String[] args) {
       StringBuilder var1 = new StringBuilder("Hello");
       
       var1.append("world!");
       System.out.println("After append:" + var1);
       System.out.println("Length:" + var1.length());
       System.out.println("Capacity:" + var1.capacity());
       System.out.println("Char at index:" + var1.charAt(1));
       System.out.println("After Delete:" + var1.delete(8,11));
       System.out.println("After DeleteCharAt:" + var1.deleteCharAt(5));
       var1.ensureCapacity(50);
       System.out.println("Capacity after ensureCapacity:" + var1 );
        var1.insert(5,",");
        System.out.println("After insert:"+ var1);
        var1.reverse();
        System.out.println("After reverse:"+ var1);
        System.out.println("After replace:"+ var1.replace(0, 1, "Hi"));

    }
}

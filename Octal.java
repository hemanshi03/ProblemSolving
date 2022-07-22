public class Octal {

    public static void main(String[] args) {
        int a = 0144;
        int temp = 15;
        int curr = 0;
        String hex="";
        if(a==0)
            System.out.println(a);
        while(a!=0)
        {
            hex = hex + (a&temp);
            a = a & temp;
            temp = temp << 4;


            System.out.println(a);
        }
    }
    
}

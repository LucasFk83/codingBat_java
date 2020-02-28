
public class Runner {

    public static void main(String[] args) {
        System.out.println(diff21(15));
        System.out.println(doubleX("axxbb"));
        System.out.println(firstTwo("Hello"));
        int[] nums= {5,11,2};
        System.out.println(sum3(nums));
        System.out.println(sortaSum(10,11));
        System.out.println(luckySum(1,2,5));
        System.out.println(catDog("catdog"));
    }

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i+1 >= str.length()){
            return false;
        }
        if(str.substring(i+1 , i+2).equals("x")){
            return true;
        }
        else{
            return false;
        }
    }
    public static String firstTwo(String str) {
        if(str.length()>=2){
            return str.substring(0,2);
        }if(str.length()==0){
            return str.substring(0);
        }
        if(str.length()<=1){
            return str.substring(0,1);
        }
        return str;
    }

    public static int sum3(int[] nums) {
        int x=0;
        for(int i = 0; i<3;i++){
            x = nums[i]+x;
        }
        return x;
    }

    public static int sortaSum(int a, int b) {
        int x=20;
        int sum= 0;
        if(((a + b) >= 10) && ((a + b) <= 19)){
            return x;
        }else {
            sum = a + b;
        }
        return sum;
    }
    public static int luckySum(int a, int b, int c) {
        int sum= 0;
        if(a ==13){
            return sum;
        }
        if(b==13){
            sum= a;
            return sum;
        }
        if(c==13){
            sum= a+ b;
            return sum;
        }
        if(a!=13 && b!=13 &&c!=13){
            sum=a+b+c;
            return sum;
        }
        return sum;
    }
    public static boolean catDog(String str) {
        int count= 0;
        int othercount= 0;
        for(int i = 0; i<str.length()-2;i++){
            if(str.substring(i,i+3).equals("cat")){
                count=count+1;
            }
            if(str.substring(i,i+3).equals("dog")){
                othercount=othercount+1;
            }
        }
        if(count == othercount){
            return true;
        }
        return false;
    }



}


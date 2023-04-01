public class Main {
    public static void main(String[] args) {
        int num = 151 , temp1 = num , temp2 = num ;
        int count = 0 , sum = 0 ;

        while(num > 0){

            num = num / 10 ;
            count++ ;
        }
        while (temp1 > 0){

            int last = temp1 % 10 ;

            int x = last , n = count , prod = 1;

            while (n > 0){

                prod = prod * x ;
                n--;
            }
            sum = sum + prod ;
            temp1 = temp1 / 10;
        }
        if (sum==temp2){
            System.out.println(temp2 + " is an armstrong number");
        }
        else {
            System.out.println(temp2 + " is not an armstrong number");
        }
    }
}
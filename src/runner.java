public class runner {


    public static void main(String[] args) {

        System.out.println(hasTeen(12,16,22));
        System.out.println(stringTimes( "hiii",3));
        System.out.println(helloName("Dylan"));
        int[] nums = {1,4,6};
        System.out.println(firstLast6(nums));
        System.out.println(cigarParty(50, true));
        System.out.println(luckySum(3,13,4));
        System.out.println(catDog("catdogdogcat"));
        System.out.println(countYZ("yaby yaoiz"));
        int[] yums = {3,2,5};
        System.out.println(notAlone(yums, 2));
        int[] lums = {3,2,5};
        System.out.println(canBalance(lums));
    }


    public static boolean hasTeen(int a, int b, int c) {
        if (13 <= a && a <= 19) {
            return true;
        } else if (13 <= b && b <= 19) {
            return true;
        } else if (13 <= c && c <= 19) {
            return true;
        } else {
            return false;
        }
    }
    public static String stringTimes(String str, int n) {
        String repeated = new String(new char[n]).replace("\0", str);
        return repeated;
    }
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
    public static boolean firstLast6(int[] nums) {
        if(nums[0] == 6){
            return true;
        } else if(nums[nums.length-1] == 6){
            return true;
        } else {
            return false;
        }
    }
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend){
            if(cigars>=40){
                return true;
            }
        }
        if(cigars>=40 && cigars<= 60){
            return true;
        }
        return false;
    }
    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a != 13){
            sum+= a;
        } else if (b != 13 && c != 13){
            sum -= b;
            sum -= c;
        } else if ( b != 13){
            sum -= b;
        }
        if(b != 13){
            sum+= b;
        } else if (c != 13){
            sum -= c;
        }
        if(c != 13){
            sum+= c;
        }
        return sum;
    }
    public static boolean catDog(String str) {
        int cats = 0;
        int dogs = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i+3).equals("cat")){
                cats += 1;
            }
            if (str.substring(i, i+3).equals("dog")){
                dogs += 1;
            }
        }
        return cats == dogs;
    }
    public static int countYZ(String str) {
        String newStr = str.toLowerCase();
        int count = 0;
        for (int i = 1; i < str.length(); i++){
            String there = str.substring(i, i+1);
            char c = there.charAt(0);
            if(!Character.isLetter(c)){
                if(newStr.substring(i-1, i).equals("z") || newStr.substring(i-1, i).equals("y")){
                    count += 1;
                }

            }
        }
        int length = str.length() - 1;
        if(newStr.substring(length).equals("z") || newStr.substring(length).equals("y")){
            count += 1;
        }
        return count;
    }
    public static int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length-1 ; i++){
            if(nums[i] == val){
                if(nums[i-1] != nums[i] && nums[i+1] != nums[i]){
                    if(nums[i-1] < nums[i+1]){
                        nums[i] = nums[i+1];
                    }else if(nums[i+1] < nums[i-1]) {
                        nums[i] = nums[i-1];
                    }
                }
            }
        }
        return nums;
    }
    public static boolean canBalance(int[] nums) {
        int one = 0;
        for (int i = 0; i < nums.length; i++) {
            one += nums[i];
            int two = 0;
            for (int j = nums.length-1; j > i; j--) {
                two += nums[j];
            }
            if (two == one)
                return true;
        }
        return false;
    }

}
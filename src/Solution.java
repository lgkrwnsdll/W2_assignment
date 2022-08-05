public class Solution {
    public static String solution(int n) {
        String str = "수박";
        String ans = "";

        if (n % 2 != 0) { // 홀수
            n = (int) n / 2;
            ans = str.repeat(n) + "수";
        } else { // 짝수
            n = (int) n / 2;
            ans = str.repeat(n);
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solution(7));
    }

}
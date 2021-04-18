public class Code08_KM {
    public static int onlyKTimes(int[] arr, int k, int m){
        int[] t = new int[32];
        //num数的二进制表示
        for (int num : arr){
            for (int i = 0; i < 32; i++){
                t[i] += (num >> i) & 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < 32; i++){
            if(t[i] % m != 0){
                ans |= (1 << i);
            }
        }
        return ans;
    }
    //主函数
    public static void main(String[] args){
        int[] array = {1, 1, 2, 2, 3 };
        int k = 1;
        int m = 2;
        System.out.println(onlyKTimes(array, k, m));
    }
    
}

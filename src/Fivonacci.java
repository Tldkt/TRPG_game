
public class Fivonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
    public static int[] fibonacci(int num) {
        // num 입력 시 0부터 시작해 num+1개의 배열 리턴
        //배열크기 arr[n+1]
        int[] arr = new int[num+1];
        //언제나 arr[0]=0.arr[1]=1 edge case 처리
        switch(num){
            case 1:
            arr[1] = 1;
            case 2:
            arr[2] = 1;
            default:
                break;
        }
        //근데 배열은 늘 0으로 초기화되고, 0이라면 어차피 i=2부터 시작하기 때문에 for문 안 걸리고 return될 듯
        //원소 칸 채우기 arr[i+2]=arr[i]+arr[i+1]
        for(int i=3; i<num-1; i++){

            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;
    }
}


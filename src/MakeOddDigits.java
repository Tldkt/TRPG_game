public class MakeOddDigits {
    public String makeOddDigits(int num){
//    num을 입력받아 1포함 num개의 홀수로 구성된 문자열 리턴
//    반복문 while 사용, 연속해서 입력
//     num개의 홀수 출력=2*i+1을 num까지 대입, 정답 문자열에 계속 추가하기
        int i=0;
        String result = "";
        while( i++ < num){
            result += 2 * i + 1;
        }
        return result;
    }
}

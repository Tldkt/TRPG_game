public class VariablesTest {
        public static int num = 1;//정적, 호출하면 값할당 안됨

        public static int fun1(int num){//정적 메서드의 지역변수 num
            num += num;//지역변수가 우선순위
            return num;
        }

        public static int fun2(int n){//정적
            n += num;//n초기화 안 되어있는데 사용 가능?
            int num = 2;
            n += num;
            return n;
        }

        public static void main(String[] args){
            int num = 1;
            num += fun1(num);//여기서 num의 초기값은 1,
            num += fun2(num);
            System.out.print(num);
        }
}

class Outer_method { //외부 클래스
    int num = 5;
    void test() {
        int num2 = 6;
        class LocalInClass { //지역 내부 클래스
            void getPrint() {
                System.out.println(num);
                System.out.println(num2);
            }
        }
        LocalInClass localInClass = new LocalInClass();
        localInClass.getPrint();
    }
}





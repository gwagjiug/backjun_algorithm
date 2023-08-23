public class sprout {
    public static void main(String[] args) {
        //"와 같은 문법적 기능들을 담는 단어들은 그대로 출력을 할 수가 없다.
        //그러나 이러한 문자를 출력하고 싶을 경우가 있을 땐
        //백 슬래시\ 를 붙여 사용하는 것 즉, \+문자 조합으로 해당 문자를 그대로 출력할 수 있게 만들었음

        String s =  "         ,r'\"7\n" +
                "r`-_   ,'  ,/\n" +
                " \\. \". L_r'\n" +
                "   `~\\/\n" +
                "      |\n" +
                "      | " ;

        // ,r'\"7
        // r`-_  ,' ,/
        System.out.println(s);
    }
}
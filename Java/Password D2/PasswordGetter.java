public class PasswordGetter
{
    final static String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    public static void main(String[] args) {
        String login = "login0";
        String password = "a123";
        boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login, password);
        System.out.println(login + " and " + password + " gotIt = " + gotIt);
    
        for(int i = 1; i <= 8; i++){
            login = "login" + i;
            int k = (i - 1)/2 + 1;
            if(i==6) k=4; //login6 actually has 4 letters
            System.out.println("login"+i+", "+k);
            for(int j = 0; j <= 999; j++)
                if(loopLetters(k, "", j, login))
                    break;
        }
        System.out.println("done");
    }
    public static boolean loopLetters(int chars, String pass, int num, String login) {
        for(int i = 0; i < abc.length; i++) {
            if(chars > 1){
                if(loopLetters(chars - 1, pass + abc[i], num, login))
                    return true;
            }
            else{
                String password = pass + abc[i] + String.format("%03d", num);
                boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login, password);
                if(gotIt){
                    System.out.println(login + " and " + password + " gotIt = " + gotIt);
                    return true;
                }
            }
        }
        return false;
    }
    /*
        login1: c003
        login2: b555
        login3: nm053
        login4: tk804
        login5: abc023
        login6: dsdk358
        login7: abcd100
        login8: long999
    */
}
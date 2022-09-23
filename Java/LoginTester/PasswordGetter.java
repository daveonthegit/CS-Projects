class PasswordGetter{
   public static void main(String[] args) {
   for (int i = 1; i < 5;i++) {
      int g = 0;
      String password = "";
      boolean gotIt = false;
      System.out.println("k");
      while (gotIt == false) {
         if (i < 3) {
            String login = "login" + i;
            if (10 > g) {
               password = String.format("%05d", g);
            } else if (100 > g) {
               password = String.format("%04d", g);
            } else if (1000 > g) {
               password = String.format("%03d", g);
            } else if (10000 > g) {
               password = String.format("%02d", g);
            } else if (100000 > g) {
               password = String.format("%01d", g);
            } else {
               password = "" + g;
            }
            gotIt = LoginsAndPasswords.correctIdAndPassword(login,password);
            if (gotIt == true) {
            System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
            }
        } else {
                        String login = "login" + i;
            if (10 > g) {
               password = String.format("%07d", g);
            } else if (100 > g) {
               password = String.format("%06d", g);
            } else if (1000 > g) {
               password = String.format("%05d", g);
            } else if (10000 > g) {
               password = String.format("%04d", g);
            } else if (100000 > g) {
               password = String.format("%03d", g);
            } else if (1000000 > g) {
               password = String.format("%02d", g);
            } else if (10000000 > g) {
               password = String.format("%01d", g);
            } else {
               password = "" + g;
            }
            gotIt = LoginsAndPasswords.correctIdAndPassword(login,password);
            if (gotIt == true) {
            System.out.println("gotIt = "+gotIt+" login = "+login+" password = "+password);
            }
        }
        g++;
        }
    }
}        
}
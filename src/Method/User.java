package Method;

 class User {
     String password;
     String email;
     String name;
     int YearofBirth;

     public User(String password, String email, String name, int YearofBirth) {
         if (isEmailCorrect(email)) {
             this.email = email;
         }

         this.password = password;

         if (YearofBirth < 1900 || YearofBirth > 2021) {
             this.YearofBirth = 0;
         } else {
             this.YearofBirth = YearofBirth;
         }
     }

     User() {
         this.email = "ustaw email";
         this.password = "nie ustawiono";
     }


     private boolean isEmailCorrect(String email) {
         return email.indexOf("@")>0;
     }


     public void setEmail(String newEmail) {
         if (isEmailCorrect(email)) {
             this.email = email;
         } else {
             System.out.println("incorrect email");
         }
     }

     public String toString() {

         return String.format("I am an user. %s email. %s name. %d dateofbirth", this.email, this.name, this.YearofBirth);
     }

//     public void setPassword(String password) {
//         this.password = password;
//     }
//
//     public void setEmail(String email) {
//         this.email = email;
//     }
//
//     User (String password, String email, String name, int YearofBirth) {
//        this.password = password;
//        this.email = email;
//        this.name = name;
//        this.YearofBirth = YearofBirth;
//
//    }
//     void setYearofBirth(int YearofBirth) {
//         if (YearofBirth >= 2021) {
//             System.out.println("incirrect date of Birth");
//         } else { this.YearofBirth = YearofBirth;
//         }
//     }
//
//    public String toString() {
//        return String.format("I am an user. %s email. %s name. %d yearofbirth", this.email, this.name, this.YearofBirth);
//    }
}
import java.util.Scanner;

 class Project01 {

public static void main(String args[]){
    System.out.println("WELCOME to University Management System");
    int num=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Press [1] for Student Registration\nPress [2] for Lecture Registration");
    num=sc.nextInt();
    if(num==1){System.out.println("Welcome to Student Registration");}
    else if(num==2){System.out.println("Welcome to Lecture Registration");}
    else{System.out.println("Enter valid number");}
}

}

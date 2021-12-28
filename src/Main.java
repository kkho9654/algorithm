import java.util.Scanner;

public class Main {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        mathPractice1();
    }
    public static void strPractice1(){
        //영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
        //첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
        String str=scan.nextLine();
        int ret=0;
        int i=0;
        while(i!=str.length()){
            char c=str.charAt(i);
            char c1=str.charAt(0);
            if(Character.compare(c,' ')==0) ret++;
            if(i==0)
                if(Character.compare(c1,' ')==0) ret--;
            if(i==str.length()-1)
                if(Character.compare(str.charAt(i),' ')==0) ret--;
            i++;
        }
        System.out.print(ret+1);
    }
    public static void strPractice2(){
        String str=scan.nextLine();
        str=str.replaceAll("c=","č");
        str=str.replaceAll("c-","ć");
        str=str.replaceAll("dz=","1");
        str=str.replaceAll("d-","đ");
        str=str.replaceAll("lj","0");
        str=str.replaceAll("nj","2");
        str=str.replaceAll("s=","š");
        str=str.replaceAll("z=","ž");
        System.out.print(str.length());
    }
    public static void mathPractice1(){
        long a,b,c;
        String str=scan.nextLine();
        a=Long.parseLong(str.split(" ")[0]);
        b=Long.parseLong(str.split(" ")[1]);
        c=Long.parseLong(str.split(" ")[2]);

        if(b>=c) {
            System.out.print(-1);
            return;
        }
        System.out.print(a/(c-b)+1);
    }

}

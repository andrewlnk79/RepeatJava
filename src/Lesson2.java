public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        positiveOrNegative(2);
        System.out.println(plusOrMinus(2));
        printWord("Java",5);


    }
    static boolean sum(int a,int b){
        return a+b>=10 && a+b<=20;

    }
    static void positiveOrNegative(int a){
        System.out.println(a>0?"positive":"negative");

        }

    static boolean plusOrMinus(int a){
        return a<0;
    }
    static void printWord(String word,int x){
        for (int i = 0; i < x; i++) {
            System.out.println(word);

        }
    }
}

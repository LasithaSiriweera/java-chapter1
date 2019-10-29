package chractors;

// char variables behave like integers.
public class CharDemo2 {
    public static void main(String args[]) {
        char ch1;
        ch1 = 'X';
        System.out.println("ch1 contains " + ch1);
        ch1++; // increment ch1
        System.out.println("ch1 is now " + ch1);
    }
}

//In the program, ch1 is first given the value X. Next, ch1 is incremented. This results in ch1
// containing Y, the next character in the ASCII (and Unicode) sequence.
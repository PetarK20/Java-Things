import static javax.swing.JOptionPane.*;
public class demo {
    public static void main(String[] args){
        String txt, str;
        txt = showInputDialog("Въведете текст: ");
        System.out.println(txt);

        int size = txt.length();

        char A = txt.charAt(0);
        char B = txt.charAt(size - 1);

        str = "Текст: " + txt + "\n";
        str += "Символи в текста: " + size + "\n";
        str += "Първи символ: " + A + "\n";
        str += "Последен Символ: " + B + "\n";

        showMessageDialog(null, str);



    }
}

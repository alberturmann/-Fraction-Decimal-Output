import javax.swing.JOptionPane;

public class FracOutput {
    public static void main(String args[]){
String input;
float n, d;

input = JOptionPane.showInputDialog("Enter the numerator of fraction a ");
n = Float.parseFloat(input);

input = JOptionPane.showInputDialog("Enter the denominator of fraction a ");
d = Float.parseFloat(input);

Fraction a = new Fraction(n, d);

input = JOptionPane.showInputDialog("Enter the numerator of fraction b ");
n = Float.parseFloat(input);

input = JOptionPane.showInputDialog("Enter the denominator of fraction b ");
d = Float.parseFloat(input);

Fraction b = new Fraction(n, d);

System.out.println("Fraction a in decimal form:"   +a.devide(a.numerator,a.denumerator));
System.out.println("Fraction b in decimal form:"   +b.devide(b.numerator,b.denumerator));

JOptionPane.showMessageDialog(null, a.devide(a.numerator,a.denumerator));
JOptionPane.showMessageDialog(null, b.devide(b.numerator,b.denumerator));
    }
}

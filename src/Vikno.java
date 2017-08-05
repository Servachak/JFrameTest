import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.JLabel;
import javax.swing.JButton;

/**Клас Vikno наслідує JFrame**/
public class Vikno extends JFrame{

    /** Унас буде вікно та кнопка на ньому**/
    private JButton btn1;
    private JLabel lbl1;

    /** створюємо конструктор класу вікно**/
    public Vikno(){


        /** Клас FlowLayout розміщує елементи у вікні ланцюжком(один за одним)**/
        setLayout(new FlowLayout());


        lbl1 = new JLabel("");
        add(lbl1);

        /** Кнопка додана на вікно і на ній буде відображатися текст "Натисни мене"**/
        btn1 = new JButton("Натисни мене");
        add(btn1);

        ObrobnycPodij obrobnycPodij = new ObrobnycPodij();

        btn1.addActionListener(obrobnycPodij);

    }
    /** цей клас обовязково має бути в СЕРЕДИНІ класу в якому ми створюємо вікно**/
    public  class ObrobnycPodij implements ActionListener{

        /** метод для опрацювання події інтерфейсу ActionListener , метод в якому ми описуємо як саме має опрацьовуватись подія**/
        @Override
        public void actionPerformed(ActionEvent podia) {

            /** Біля кнопки буде появлятися текст та його довжина**/
            String txt =  lbl1.getText();
            lbl1.setText(txt+txt.length());
        }
    }
}

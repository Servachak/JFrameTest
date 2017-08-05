import javax.swing.*;

/**
 * Created by adavi on 05.08.2017.
 */
public class JFrameEventApp {

    public static void main(String[] args) {

        /**Створюємо вікно**/
        Vikno vikno = new Vikno();

        /** цей метод відповідає за те що буде з програмою якщо ми її закриємо, в даному випадку програма закриється**/
        vikno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /** Даємо вікну назву - Загол  вікна **/
        vikno.setTitle("Вікно з обробником подій");

        /**Встановлюємо розміри вікна**/
        vikno.setSize(500 ,250);

        /**Щоб вікно показалось на екрані встановлюємо  "true" **/
        vikno.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPGCharacterGUI {

    /*
    Make a GUI for your RPG Character builder you made in the last Unit. The user should enter primary stats in input box and the GUI
    should display the character's battle stats. The GUI should have at least 4 label, 4 inputs and a button to click which calculates and displays
    the battle stats.
     */

  JFrame window;
  JPanel panel;
  JButton RPGCharacter;
  static JTextField textInputField;
  static JTextField textInputField2;
  static JTextField textInputField3;
  static JLabel resultLabel;


  public RPGCharacterGUI(){




    JFrame window = new JFrame("RPG Character");
    JPanel panel = new JPanel();
    textInputField = new JTextField(10);
    textInputField2 = new JTextField(10);
    textInputField3 = new JTextField(10);

    JLabel textInputLabel = new JLabel("Enter your character's strength");
    JLabel textInputLabel2 = new JLabel("Enter your character's Speed");
    JLabel textInputLabel3 = new JLabel("Enter your characters Stamina");
    JLabel textInputLabel4 = new JLabel("Enter your character's Health");
    JLabel textInputLabel5 = new JLabel("Enter your character's skill level");
    JLabel textInputLabel6 = new JLabel("Enter you character's flexibility");

    JButton addition = new JButton("Add for Armor");
    JButton addition2 = new JButton("Add for Agility");
    JButton addition3 = new JButton("Add for Damage");
    JButton addition4 = new JButton("Add for Swordsmanship");

    window.setSize(300, 150);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLocationRelativeTo(null);

    panel.add(textInputLabel);
    panel.add(textInputField);
    panel.add(textInputLabel2);
    panel.add(textInputField2);
    panel.add(textInputLabel3);
    panel.add(textInputField3);

    panel.add(addition);
    panel.add(addition2);
    panel.add(addition3);
    panel.add(addition4);

    window.add(panel);
    window.setVisible(true);
  }

  private static class addListener1 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      double strength = Double.parseDouble(textInputField.getText());
      double health = Double.parseDouble(textInputField2.getText());
      double stamina = Double.parseDouble(textInputField3.getText());
      resultLabel.setText(String.valueOf(stamina + health + strength));

    }









  }
}

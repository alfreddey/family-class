//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Family nkont = new Family("Nkontomire");
    nkont.addParentFirstName("Kofi", "Ama");
    nkont.addSiblingFirstName("Kwadwo", "Yaa");
    nkont.addGrandMaFirstName("Adwoa");
    nkont.printFamilyNames();
  }
}
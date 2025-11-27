public class Family {
  private String familyName = "";
  private String fatherFirstName = "";
  private String motherFirstName = "";
  private String sonFirstName = "";
  private String daughterFirstName = "";
  private String grandMaFirstName = "";

  public Family(String familyName) {
    this.familyName = familyName;
  }

  public Family(
      String familyName,
      String fatherFirstName,
      String motherFirstName,
      String sonFirstName,
      String daughterFirstName,
      String grandMaFirstName
  ) {
    this.familyName = familyName;
    this.fatherFirstName = fatherFirstName;
    this.motherFirstName = motherFirstName;
    this.sonFirstName = sonFirstName;
    this.daughterFirstName = daughterFirstName;
    this.grandMaFirstName = grandMaFirstName;
  }

  public void addParentFirstName(String fatherFirstName, String motherFirstName) {
    this.fatherFirstName = "Mr " + fatherFirstName + " " + familyName;
    this.motherFirstName = "Mrs " + motherFirstName + " " + familyName;
  }

  public void addSiblingFirstName(String sonFirstName, String daughterFirstName) {
    this.sonFirstName = sonFirstName + " " + familyName;
    this.daughterFirstName = daughterFirstName + " " + familyName;
  }

  public void addGrandMaFirstName(String grandMaFirstName) {
    this.grandMaFirstName = "Madam " + grandMaFirstName + " " + familyName;
  }

  public void printFamilyNames() {
    System.out.printf(
        "Father's name: %s\nMother's name: %s\nSon's name: %s\nDaughter's name: %s\nGrandma's name: %s",
        fatherFirstName,
        motherFirstName,
        sonFirstName,
        daughterFirstName,
        grandMaFirstName
    );
  }
}

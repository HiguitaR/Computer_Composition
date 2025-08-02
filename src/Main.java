//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Computer Lenovo = new Computer("FX356", 2);
        Lenovo.addComponents(9.5, 2000, "HDD", 3000);
        Lenovo.addComponents(5.0, 1500, "SSD", 2000);
        Lenovo.displayComputer();
        Lenovo.addComponents(3.5, 2000, "SSD", 4000);
        Lenovo.starterComputer();
    }
}
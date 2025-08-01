import java.util.Arrays;

public class Computer {
    private final String model;
    private int computersCount;
    private final Cpu[] cpus;
    private final Ram[] rams;
    private final Hard_Drive[] hard_drives;


    public Computer(String model, int computer_Numbers) {
        this.model = model;
        this.cpus = new Cpu[computer_Numbers];
        this.rams = new Ram[computer_Numbers];
        this.hard_drives = new Hard_Drive[computer_Numbers];
        this.computersCount = 0;
    }

    public String getModel() {return model;}

    public void addComponents(double speed, int capacityGB, String type,
                              int capacityHD){
        if (this.computersCount < this.cpus.length){
            Cpu newCpu = new Cpu(speed);
            this.cpus[computersCount] = newCpu;
            System.out.println("Add Cpu Successful!✅");
        }else{
            System.out.println("The Computer already has a Cpu! ❌");
        }
        if (this.computersCount < this.rams.length){
            Ram newRam = new Ram(capacityGB);
            this.rams[computersCount] = newRam;
            System.out.println("Add Ram Successful!✅");
        }else{
            System.out.println("The Computer already has a Ram! ❌");
        }
        if (this.computersCount < this.hard_drives.length){
            Hard_Drive newHardDrive = new Hard_Drive(type, capacityHD);
            this.hard_drives[computersCount] = newHardDrive;
            System.out.println("Add Hard Drive Successful!✅");
        }else{
            System.out.println("The Computer already has a Hard Drive! ❌");
        }
        this.computersCount ++;
    }

    public void displayComputer(){
        if (this.computersCount != 0){
            for (int i = 0; i < computersCount; i++) {
                System.out.println(toString() + this.cpus[i] + this.rams[i] + this.hard_drives[i]);
            }
        }else{
            System.out.println("Nothing to see!");
        }
    }

    public void starterComputer(){
        if (computersCount != 0){
            System.out.println("Turning on the computer! 💻");
        }else{
            System.out.println("You can't turn on the computer without assembling!❌");
        }
    }

    @Override
    public String toString() {return String.format("Computer model: %s", getModel());}
}

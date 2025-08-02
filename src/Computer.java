

public class Computer {
    /**
     * Class Computer that instance an object to create a some computers
     */
    private final String model;
    private int computersCount;
    private final Cpu[] cpus;
    private final Ram[] rams;
    private final Hard_Drive[] hard_drives;

    /**
     * Constructor of the class Computer
     * @param model computer model
     * @param computer_Numbers numbers of computers to create
     */
    public Computer(String model, int computer_Numbers) {
        this.model = model;
        this.cpus = new Cpu[computer_Numbers];
        this.rams = new Ram[computer_Numbers];
        this.hard_drives = new Hard_Drive[computer_Numbers];
        this.computersCount = 0;
    }

    public String getModel() {return model;}


    /**
     * Add components Method to agree elements at the class
     * @param speed hard drive data processing
     * @param capacityGB capacity data in memory ram
     * @param type  what type is hard drive SSD or HDD
     * @param capacityHD capacity data in hard drive
     */
    public void addComponents(double speed, int capacityGB, String type,
                              int capacityHD){
        if (this.computersCount < this.cpus.length){
            Cpu newCpu = new Cpu(speed);
            this.cpus[computersCount] = newCpu;
            System.out.println("Add Cpu Successful!✅ " +
                    this.cpus[computersCount].speed() + "Hz");
            Ram newRam = new Ram(capacityGB);
            this.rams[computersCount] = newRam;
            System.out.println("Add Ram Successful!✅ " +
                    this.rams[computersCount].capacityGB() + "GB");
            Hard_Drive newHardDrive = new Hard_Drive(type, capacityHD);
            this.hard_drives[computersCount] = newHardDrive;
            System.out.println("Add Hard Drive Successful!✅ " +
                    this.hard_drives[computersCount].capacityGB() + "GB");
        }else{
            System.out.println("The Computer already has complete! ❌");
        }
        this.computersCount ++;
    }

    /**
     * Display Method to show all info about computer
     */
    public void displayComputer(){
        if (this.computersCount != 0){
            for (int i = 0; i < computersCount; i++) {
                System.out.println(toString() + this.cpus[i] + this.rams[i] + this.hard_drives[i]);
            }
        }else{
            System.out.println("Nothing to see!");
        }
    }

    /**
     * Start Method to run test all elements of computer
     */
    public void starterComputer(){
        if (computersCount != 0){
            System.out.println("Turning on the computer! 💻");
            Cpu.starterCpu();
            Ram.starterRam();
            Hard_Drive.starterHD();
            System.out.println("The computer is ready to use!");
        }else{
            System.out.println("You can't turn on the computer without assembling!❌");
        }
    }

    @Override
    public String toString() {return String.format(" Computer model: %s, ", getModel());}
}

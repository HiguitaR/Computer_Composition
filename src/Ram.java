public record Ram(int capacityGB) {

    /**
     * Start Method static to connect with the computer starter method
     */
    public static void starterRam() {
        System.out.println("Turning on Ram!✅");
    }


    @Override
    public String toString() {
        return String.format(" RAM capacity: %d GB, ", capacityGB());
    }
}

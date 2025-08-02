public record Cpu(Double speed) {

    /**
     * Start Method static to connect with the computer starter method
     */
    public static void starterCpu() {
        System.out.println("Turning on CPU!✅");
    }

    @Override
    public String toString() {
        return String.format(" CPU speed: %.2f Hz, ", speed());
    }
}

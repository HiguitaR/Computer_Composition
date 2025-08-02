public record Cpu(Double speed) {


    public static void starterCpu() {
        System.out.println("Turning on CPU!✅");
    }

    @Override
    public String toString() {
        return String.format(" CPU speed: %.2f Hz, ", speed());
    }
}

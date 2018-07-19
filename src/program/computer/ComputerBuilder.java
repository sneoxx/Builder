package program.computer;

public class ComputerBuilder {
    private String vendor;
    private String model;
    private Cpu cpu;
    private Ram ram;
    private MotherBoard motherBoard;
    private Hdd hdd;
    private VideoCard videoCard;

    public ComputerBuilder vendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    public ComputerBuilder model(String model) {
        this.model = model;
        return this;
    }

    public ComputerBuilder cpu(String vendor, String model, double frequency, int core) {
        Cpu homeCpu = new Cpu(vendor, model, frequency, core);
        this.cpu = homeCpu;
        return this;
    }

    public ComputerBuilder ram(String vendor, String model, String ddr, int frequency, int volume) {
        Ram homeRam = new Ram(vendor, model, ddr, frequency, volume);
        this.ram = homeRam;
        return this;
    }

    public ComputerBuilder motherBoard(String vendor, String model, String socket) {
        MotherBoard homeMotherBoard = new MotherBoard(vendor, model, socket);
        this.motherBoard = homeMotherBoard;
        return this;
    }

    public ComputerBuilder hdd(String vendor, String model, String speed, String volume) {
        Hdd homeHdd = new Hdd(vendor, model, speed, volume);
        this.hdd = homeHdd;
        return this;
    }

    public ComputerBuilder videoCard(String vendor, String model, String volume, String chip, String coreFrequency,  String ddr, String memoryFrequency) {
        VideoCard homeVideoCard = new VideoCard(vendor, model, volume, chip, coreFrequency,  ddr, memoryFrequency);
        this.videoCard = homeVideoCard;
        return this;
    }

    public Computer bulid() {
        return new Computer(vendor, model, cpu, ram, motherBoard, hdd, videoCard);
    }

    public static ComputerBuilder newComputerBuilder() {
        return new ComputerBuilder();
    }


    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }
}

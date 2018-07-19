package program.computer;

public class Computer {
    final String className = "Computer";
    private String vendor;
    private String model;
    private Cpu cpu;
    private Ram ram;
    private MotherBoard motherBoard;
    private Hdd hdd;
    private VideoCard videoCard;
    static public int id;
    private String computerSpecification;


    public Computer(String vendor, String model, Cpu cpu, Ram ram, MotherBoard motherBoard, Hdd hdd, VideoCard videoCard) {
        this.vendor = vendor;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.motherBoard = motherBoard;
        this.hdd = hdd;
        this.videoCard = videoCard;
    }

    public void getPrint() {
        System.out.println("Собрана следующая конфигурация компьютера: ");
        if (vendor != null) {
            System.out.println("Vendor: " + vendor);
        } else {
            System.out.println("Vendor : NoName");
        }

        if (model != null) {
            System.out.println("Model: " + model);
        } else {
            System.out.println("Model : NoName");
        }

        if (cpu != null) {
            System.out.println("Cpu: " + cpu.CpuSpecification);
        } else {
            System.out.println("Cpu : Не установлен");
        }

        if (ram != null) {
            System.out.println("Ram: " + ram.ramSpecification);
        } else {
            System.out.println("Ram : Не установлена");
        }

        if (motherBoard != null) {
            System.out.println("MotherBoard: " + motherBoard.motherBoardSpecification);
        } else {
            System.out.println("MotherBoard : Не установлена");
        }

        if (hdd != null) {
            System.out.println("HardDisk: " + hdd.hddSpecification);
        } else {
            System.out.println("HardDisk : Не установлено");
        }

        if (videoCard != null) {
            System.out.println("VideoCard: " + videoCard.videoCardSpecification);
        } else {
            System.out.println("VideoCard : Не установлена");
        }
    }

    public String getShow() {
        String printcomputer = vendor + " " + model;
        return printcomputer;
    }


    public void on() {
        if (cpu == null | ram == null | motherBoard == null | hdd == null | videoCard == null) {
            System.out.println();
            System.out.println("Компьютер не возможно включить - установлены не все комплектующие");
        }
        else {
            System.out.println();
            System.out.println("Включение компьютера");
            System.out.println("Bios грузится");
            System.out.println("хуякс Wind-а загрузилась");
        }

    }


}




/*   public Computer(ComputerBuilder computerBuilder) {
        this.vendor = computerBuilder.getVendor();
        this.model = computerBuilder.getModel();
        this.cpu = computerBuilder.getCpu();
        this.ram = computerBuilder.getRam();
        this.motherBoard = computerBuilder.getMotherBoard();
        this.hdd = computerBuilder.getHdd();
        this.videoCard = computerBuilder.getVideoCard();
    }




static public void showId() {
        System.out.println("Id компьютера: " + id );
    }

    static {
        int id = 0;
    }

    {
        System.out.println("");
        System.out.println("Сlass " + className + ": новый экземпляр");
        id++;
        Computer.showId();
        this.getShow();
    }

    public Computer() {
        this.vendor = "Irbis";
        this.model  = "M 183";
        System.out.println(vendor + " " + model);

        cpu Intel = new cpu();
        this.cpu = Intel.CpuSpecification;
        System.out.println(cpu);

        Ram Planka = new Ram();
        this.ram = Planka.ramSpecification;
        System.out.println(ram);

        MotherBoard Mamka = new MotherBoard();
        this.motherBoard = Mamka.motherBoardSpecification;
        System.out.println(motherBoard);

        Hdd homeHdd = new Hdd();
        this.hdd = homeHdd.hddSpecification;
        System.out.println(hdd);

        VideoCard megaVideo = new VideoCard();
        this.videoCard = megaVideo.videoCardSpecification;
        System.out.println(videoCard);

    }

    public Computer(String vendor, String model){
        this.vendor = vendor;
        this.model  = model;
    }

    public Computer(Computer xcomputer){
        this.vendor = xcomputer.vendor;
        this.model  = xcomputer.model;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public void setcomputer (){
        this.vendor = "Irbis";
        this.model  = "M 183";
    }

    public void setcomputer (String vendor, String model){
        this.vendor = vendor;
        this.model  = model;
    }

    public String getShow() {
        String printcomputer = vendor + " " + model;
        return printcomputer;
    }



}
*/
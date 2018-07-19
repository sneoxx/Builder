package program.computer;

public class Hdd {
    final String className = "Hdd";
    private String vendor;
    private String model;
    private String speed;
    private String volume;
    public String hddSpecification;
    static public int id;

    static public void showId() {
        System.out.println("Id жесткого диска: " + id );
    }

    static {
        int id = 0;
    }

  /*  {
        System.out.println("");
        System.out.println("Сlass " + className + ": новый экземпляр");
        id++;
        Hdd.showId();
    }*/

    public Hdd() {
        this.vendor = "Seagate";
        this.model  = "ST500DM009";
        this.speed = "7200 об/м";
        this.volume = "500 GB";
        this.hddSpecification = this.vendor + " " + this.model + " " + this.speed + " " + this.volume;
    }

    public Hdd(String vendor, String model, String speed, String volume){
        this.vendor = vendor;
        this.model  = model;
        this.speed = speed;
        this.volume = volume;
        this.hddSpecification = this.vendor + " " + this.model + " " + this.speed + " " + this.volume;
    }

    public Hdd(Hdd xHdd){
        vendor = xHdd.vendor;
        model = xHdd.model;
        speed = xHdd.speed;
        volume = xHdd.volume;
        this.hddSpecification = this.vendor + " " + this.model + " " + this.speed + " " + this.volume;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }


    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public String getSpeed() {
        return speed;
    }

    public String getVolume() {
        return volume;
    }

    public String getMotherBoardSpecification() {
        return hddSpecification;
    }

    public void setHdd (){
        this.vendor = "Seagate";
        this.model  = "ST500DM009";
        this.speed = "7200 об/м";
        this.volume = "500 GB";
        this.hddSpecification = this.vendor + " " + this.model + " " + this.speed + " " + this.volume;
    }

    public void setHdd (String vendor, String model, String speed, String volume){
        this.vendor = vendor;
        this.model  = model;
        this.speed = speed;
        this.volume = volume;
        this.hddSpecification = this.vendor + " " + this.model + " " + this.speed + " " + this.volume;
    }

    public String getShow() {
        String printHdd = vendor + " " + model + " " + speed + " " + volume;
        return printHdd;
    }



}



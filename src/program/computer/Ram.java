package program.computer;

public class Ram {
    final String className = "Ram";
    private String vendor;
    private String model;
    private String ddr;
    private int frequency;
    private int volume;
    static public int id;
    public String ramSpecification;

    static public void showId() {
        System.out.println("Id оперативной памяти: " + id );
    }

    static {
        int id = 0;
    }

 /*   {
        System.out.println("");
        System.out.println("Сlass " + className + ": новый экземпляр");
        id++;
        Ram.showId();
        this.getShow();
    }*/

    public Ram() {
        this.vendor = "Kingston";
        this.model  = "1234F";
        this.ddr = "DDRIII";
        this.frequency = 1333;
        this.volume =  2;
        this.ramSpecification = this.vendor + " " + this.model + " " + this.ddr + " " + this.frequency + " " + this.volume;

    }

    public Ram(String vendor, String model, String ddr, int frequency, int volume){
        this.vendor = vendor;
        this.model  = model;
        this.ddr = ddr;
        this.frequency = frequency;
        this.volume =  volume;
        this.ramSpecification = this.vendor + " " + this.model + " " + this.ddr + " " + this.frequency + " " + this.volume;
    }

    public Ram(Ram xRam){
        this.vendor = xRam.vendor;
        this.model  = xRam.model;
        this.ddr = xRam.ddr;
        this.frequency = xRam.frequency;
        this.volume =  xRam.volume;
        this.ramSpecification = this.vendor + " " + this.model + " " + this.ddr + " " + this.frequency + " " + this.volume;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDdr(String ddr) {
        this.ddr = ddr;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public String getDdr() {
        return ddr;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getVolume() {
        return volume;
    }

    public String getRamSpecification() {
        return ramSpecification;
    }

    public void setRam (){
        this.vendor = vendor;
        this.model  = model;
        this.ddr = ddr;
        this.frequency = frequency;
        this.volume =  volume;
        this.ramSpecification = this.vendor + " " + this.model + " " + this.ddr + " " + this.frequency + " " + this.volume;
    }

    public void setRam (String vendor, String model){
        this.vendor = vendor;
        this.model  = model;
        this.ddr = ddr;
        this.frequency = frequency;
        this.volume =  volume;
        this.ramSpecification = this.vendor + " " + this.model + " " + this.ddr + " " + this.frequency + " " + this.volume;
    }

    public String getShow() {
        String printRam = vendor + " " + model + " " + ddr + " " + frequency + " " + volume;
        return printRam;
    }

}

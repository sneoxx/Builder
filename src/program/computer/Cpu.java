package program.computer;

public class Cpu {
    final String className = "Cpu";
    private String vendor;
    private String model;
    private double frequency;
    private int core;
    public String CpuSpecification;
    static public int id;

    static public void showId() {
        System.out.println("Id процессора: " + id );
    }

    static {
        int id = 0;
    }

   /* {
        System.out.println("");
        System.out.println("Сlass " + className + ": новый экземпляр");
        id++;
        CPU.showId();
    }*/

    public Cpu() {
        this.vendor = "Intel";
        this.model  = "Pentium 4";
        this.frequency = 3.0;
        this.core = 1;
        this.CpuSpecification = this.vendor + " " + this.model + " " + this.frequency + "*" + this.core;
    }


    public Cpu(String vendor, String model, double frequency, int core){
        this.vendor = vendor;
        this.model  = model;
        this.frequency = frequency;
        this.core = core;
        this.CpuSpecification = this.vendor + " " + this.model + " " + this.frequency + "*" + this.core;
    }

    public Cpu getCpuStatic(Cpu xcpu) {
        return xcpu;
   }

    public Cpu(String vendor){
        this.vendor = vendor;
        this.model  = "Dual Core";
        this.frequency = 3.6;
        this.core = 2;
        this.CpuSpecification = this.vendor + " " + this.model + " " + this.frequency + "*" + this.core;
    }

    public Cpu(Cpu xCpu){
        this.vendor = xCpu.vendor;
        this.model  = xCpu.model;
        this.frequency = xCpu.frequency;
        this.core = xCpu.core;
        this.CpuSpecification = xCpu.vendor + " " + xCpu.model + " " + xCpu.frequency + "*" + xCpu.core;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCore() {
        return core;
    }

    public String getCpuSpecification() {
        return CpuSpecification;
    }

    public void setCpu (){
        this.vendor = "Intel";
        this.model  = "Pentium 4";
        this.frequency = 3.0;
        this.core = 1;
    }

    public void setCpu (String vendor, String model, double frequency, int core){
        this.vendor = vendor;
        this.model  = model;
        this.frequency = frequency;
        this.core = core;
    }

    public String getShow() {
        String printCpu = vendor + " " + model + " " + frequency + "*" + core;
        return printCpu;
    }



}

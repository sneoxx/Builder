package program.computer;

public class MotherBoard {
    final String className = "MotherBoard";
    private String vendor;
    private String model;
    private String socket;
    public String motherBoardSpecification;
    static public int id;

    static public void showId() {
        System.out.println("Id материнской платы: " + id );
    }

    static {
        int id = 0;
    }

 /*   {
        System.out.println("");
        System.out.println("Сlass " + className + ": новый экземпляр");
        id++;
        MotherBoard.showId();
    }*/

    public MotherBoard() {
        this.vendor = "Asus";
        this.model  = "EX-B360M-V5";
        this.socket = "Socket 1151";
        this.motherBoardSpecification = this.vendor + " " + this.model + " " + this.socket;
    }

    public MotherBoard(String vendor, String model, String socket){
        this.vendor = vendor;
        this.model  = model;
        this.socket = socket;
        this.motherBoardSpecification = this.vendor + " " + this.model + " " + this.socket;
    }

    public MotherBoard(MotherBoard xMotherBoard){
        this.vendor = xMotherBoard.vendor;
        this.model = xMotherBoard.model;
        this.socket = xMotherBoard.socket;
        this.motherBoardSpecification = xMotherBoard.vendor + " " + xMotherBoard.model + " " + xMotherBoard.socket;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public String getSocket() {
        return socket;
    }


    public String getMotherBoardSpecification() {
        return motherBoardSpecification;
    }

    public void setMotherBoard (){
        this.vendor = "Asus";
        this.model  = "EX-B360M-V5";
        this.socket = "Socket 1151";
        this.motherBoardSpecification = this.vendor + " " + this.model + " " + this.socket;
    }

    public void setMotherBoard (String vendor, String model, String socket){
        this.vendor = "Asus";
        this.model  = "EX-B360M-V5";
        this.socket = "Socket 1151";
        this.motherBoardSpecification = this.vendor + " " + this.model + " " + this.socket;
    }

    public String getShow() {
        String printMotherBoard = vendor + " " + model + " " + socket;
        return printMotherBoard;
    }



}

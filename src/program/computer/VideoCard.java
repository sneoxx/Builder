package program.computer;

public class VideoCard {
        final String className = "VideoCard ";
        private String vendor;
        private String model;
        private String chip;
        private String volume;
        private String coreFrequency;
        private String ddr;
        private String memoryFrequency;
        static public int id;
        public String videoCardSpecification;

        static public void showId() {
            System.out.println("Id видеокарты: " + id );
        }

        static {
            int id = 0;
        }

  /*      {
            System.out.println();
            System.out.println("Сlass " + className + ": новый экземпляр");
            id++;
            VideoCard.showId();
            this.getShow();
        }*/

        public VideoCard() {
            this.vendor = "Palit";
            this.model  = "NE5105T018G1-1070F";
            this.chip = "nVidia GeForce GTX 1050 Ti";
            this.volume = "4GB";
            this.coreFrequency = "1392 МГц";
            this.ddr = "GDDR5";
            this.memoryFrequency = "7.0ГГц";
            this.videoCardSpecification = this.vendor + " " + this.model +" " + this.chip + " " + this.coreFrequency + " " + this.volume + " " + this.ddr + " " + this.memoryFrequency;

        }

        public VideoCard(String vendor, String model, String volume, String chip, String coreFrequency, String ddr, String memoryFrequency){
            this.vendor = vendor;
            this.model  = model;
            this.chip = chip;
            this.volume = volume;
            this.coreFrequency = coreFrequency;
            this.ddr = ddr;
            this.memoryFrequency = memoryFrequency;
            this.videoCardSpecification = this.vendor + " " + this.model +" " + this.chip + " " + this.coreFrequency + " " + this.volume + " " + this.ddr + " " + this.memoryFrequency;
        }

        public VideoCard(VideoCard xVideoCard){
            this.vendor = xVideoCard.vendor;
            this.model  = xVideoCard.model;
            this.chip = xVideoCard.chip;
            this.coreFrequency= xVideoCard.coreFrequency;
            this.volume =  xVideoCard.volume;
            this.ddr = xVideoCard.ddr;
            this.memoryFrequency = xVideoCard.memoryFrequency;
            this.videoCardSpecification = this.vendor + " " + this.model +" " + this.chip + " " + this.coreFrequency + " " + this.volume + " " + this.ddr + " " + this.memoryFrequency;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public void setModel(String model) {
            this.model = model;
        }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public void setCoreFrequency(String coreFrequency) {
        this.coreFrequency = coreFrequency;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setDdr(String ddr) {
        this.ddr = ddr;
    }

    public void setMemoryFrequency(String memoryFrequency) {
        this.memoryFrequency = memoryFrequency;
    }


        public String getVendor() {
            return vendor;
        }

        public String getModel() {
            return model;
        }

    public String getChip() {
        return chip;
    }

    public String getCoreFrequency() {
        return coreFrequency;
    }

    public String getVolume() {
        return volume;
    }

    public String getDdr() {
        return ddr;
    }

    public String getMemoryFrequency() {
        return memoryFrequency;
    }

    public String getvideoCardSpecification() {
            return videoCardSpecification;
        }

        public void setVideoCard (){
            this.vendor = vendor;
            this.model  = model;
            this.chip = chip;
            this.coreFrequency = coreFrequency;
            this.volume = volume;
            this.ddr = ddr;
            this.memoryFrequency = memoryFrequency;
            this.videoCardSpecification = this.vendor + " " + this.model +" " + this.chip + " " + this.coreFrequency + " " + this.volume + " " + this.ddr + " " + this.memoryFrequency;
        }

        public void setVideoCard (String vendor, String model, String chip, String coreFrequency, String volume, String ddr, String memoryFrequency){
            this.vendor = "Palit";
            this.model  = "NE5105T018G1-1070F";
            this.chip = "nVidia GeForce GTX 1050 Ti";
            this.coreFrequency = "1392 МГц";
            this.volume = "4GB";
            this.ddr = "GDDR5";
            this.memoryFrequency = "7.0ГГц";
            this.videoCardSpecification = this.vendor + " " + this.model +" " + this.chip + " " + this.coreFrequency + " " + this.volume + " " + this.ddr + " " + this.memoryFrequency;
        }

        public String getShow() {
            String printVideoCard = vendor + " " + model + " " + chip + " " + coreFrequency + " " + volume + " " + ddr + " " + memoryFrequency;
            return printVideoCard;
        }

    }


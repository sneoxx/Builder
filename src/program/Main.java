/*Нужно с помощью классов реализовать (примерную) структуру компьютера. Должны быть реализованы методы выводящую ту или информацию о классе.
Например, есть класс компьютер, в себе он содержит классы процессора, Hdd, ram и тд.
У класса компьютера должны быть методы включить/выключить(которые просто выводят текст аля "комп включен").
И у всех классов должны быть методы которые выводят информацию о себе. Например класс CPU должен выводить что он intel core i7 3.4 Ггц и тд.
Информацию нужно хранить в полях. Чем подробней будет, тем лучше, но самое главное, чтобы вы показали в этих классах,то что было написано в лекциях. т.е.
1) должны быть поля со спецификаторами (private/public),
2) конструкторы по умолчанию и конструкторы с аргументами,
3) перегруженные методы, логические и статические блоки инициализации.
4) Статические поля и методы. И не нужно забывать о final полях.
5) Да, и у полей должны быть геттеры и сеттеры
и если захочешь после этого сделаешь наследование*/



package program;
import program.computer.*;

public class Main {
      public static void main(String[] args) {
          Cpu homeC = new Cpu("Intel", "Core i5", 3.6, 4);
          Computer homeComp = ComputerBuilder
                .newComputerBuilder()
                .vendor("Asus")
                .model("RT123454365458980897hjkgydu")
                .cpu(homeC)
                //.cpu("Intel", "Core i5", 3.6, 4)
                .ram("Corsair", "QTFD6", "DRRIII", 1333, 4)
                .motherBoard("Gigabyte ", "ER543", "1151")
                .hdd ("Seageate","RTYU587", "5200", "500ГБ")
                .videoCard("Palit", "JF56", "4ГБ", "GTX1050TI", "1366 МГц", "GDDR5", "7008МГц" )
                .bulid()  ;
                homeComp.getPrint();
                homeComp.on();



/*      CPU smallCPU = new CPU();
        System.out.println(smallCPU.getShow());

        CPU amdCPU = new CPU("AMD", "AMD A10-9700", 3.5, 4);
        System.out.println(amdCPU.getShow());

        CPU intelCPU = new CPU();
        intelCPU.setVendor("Intel");
        intelCPU.setModel("Core i7 4820K");
        intelCPU.setFrequency(3.7);
        intelCPU.setCore(4);
        System.out.println(intelCPU.getShow());*/


    }
}

package day11.task1;
// вJOBывай и вJAVAвай
public class Task1 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
//        Warehouse sklad1 = new Warehouse(0,0);
//        Worker Sasha = new Picker(0,true,sklad1);
//        Worker Victor = new Courier(0,true,sklad1);
//        businessProcess(Sasha);
//        businessProcess(Victor);
//        System.out.println(sklad1.toString());
//        System.out.println(Sasha.toString());
//        System.out.println(Victor.toString());
//        Warehouse sklad2 = new Warehouse(0,0);
//        Worker Saxar = new Picker(0,true,sklad2);
//        Worker Vanja = new Courier(0,true, sklad2);
//        businessProcess(Saxar);
//        businessProcess(Vanja);
//        System.out.println("первый склад и его сотрудники");
//        System.out.println(sklad1.toString());
//        System.out.println(Sasha.toString());
//        System.out.println(Victor.toString());
//        System.out.println("второй склад и его сотрудники");
//        System.out.println(sklad2.toString());
//        System.out.println(Saxar.toString());
//        System.out.println(Vanja.toString());

        Warehouse sklad3 = new Warehouse(10000,0);
        Worker Sax = new Picker(1000,false,sklad3);
        Sax.bonus();
        System.out.println(Sax.toString());
    }
        private static void businessProcess(Worker worker){
            for(int i=0; i<10000; i++) {
                worker.doWork();
            }
            worker.bonus();
        }
}

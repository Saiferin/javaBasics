package severstal_java_test;


public class Main {
    public static void main(String[] args) {

        //ссылки
        String htmlAmd = "https://www.citilink.ru/product/processor-amd-ryzen-threadripper-3990x-trx4-100-100000163wof-2-9ghz-bo-1527909/";
        String htmlIntel = "https://www.citilink.ru/product/processor-intel-core-i9-10980xe-lga-2066-box-bez-kulera-bx8069510980xe-1194563/";

        //CPU
        CPU intel = new CPU("Intel Core i9 10980XE", "2066", 88590);
        CPU amd = new CPU();
        amd.setModel("AMD Ryzen Threadripper 3990X");
        amd.setLga("TRX4");
        amd.setPrice(414750);

        //вывод CPU
        System.out.println(intel + " " + "link " + htmlIntel);
        System.out.println(amd + " " + "link " + htmlAmd);

        //Motherboard
        Motherboard asus = new Motherboard("ASUS TUF Gaming Z590-Plus WIFI", 20000);
        Motherboard msi = new Motherboard();
        msi.setModel("MSI MEG Z590 Godlike");
        msi.setPrice(95000);

        //вывод Motherboard
        System.out.println(asus);
        System.out.println(msi);
    }

}


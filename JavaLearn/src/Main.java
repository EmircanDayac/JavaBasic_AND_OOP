import Abstract.GameCalculator;
import Abstract.kidcalculator;
import Interface.CustomerManager_x;
import Interface.ICustomerDal;
import Interface.MysqlDal;
import Kalıtım.KrediUI;
import Kalıtım.Person;
import Kalıtım.TarımKrediManager;
import Kapsülleme.Product;
import Kolleksiyons.Kolleksiyonlar;
import Override_x.BaseÖdeme;
import Repository_Design_Generic_Sınıflar.Customer;
import Repository_Design_Generic_Sınıflar.Validator;
import Theread.KronometrThread;
import polymorphism.CustomerManager;
import polymorphism.DatabaseLogger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//import Abstract.*;abstract package içindeki her şeyi import et demek bu

public class Main {
    public static void main(String[] args) {
        int sayi = 10;
        String mesaj = "emircan";
        System.out.println(sayi + mesaj);
        if (sayi > 9) {
            System.out.println("sayı 9 dan büyük ");
        } else {
            System.out.println("9dan küçük");
        }
        switch (sayi) {
            case 10:
                System.out.println(sayi);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int j = 1;
        while (j < sayi) {
            j++;
            System.out.println("sayi");
        }
        int c = 0;
        do {
            c = c + 2;
            System.out.println(c);
        } while (c < 10);
        String[] Ogrenci = new String[10];

        Ogrenci[0] = "cafer";
        for (int i = 0; i < Ogrenci.length; i++) {
            System.out.println(Ogrenci[i]);

        }
        double[] mylist = {1.2, 1.3, 4.2, 12.3, 43.1};

        for (double number : mylist) {
            System.out.println(number);

        }


        String Message = "Bugün Huava Çok Güzel";

        System.out.println("5. Eleman" + Message.charAt(4));
        System.out.println(Message.concat("ov ye "));
        System.out.println(Message.startsWith("b"));
        System.out.println(Message.endsWith("l"));
        char[] array = new char[12];
        Message.getChars(2, 10, array, 0);

        System.out.println(array);

        System.out.println(Message.indexOf('B'));
        System.out.println(Message.lastIndexOf('u'));
        System.out.println(Message.replace(" ", "-"));
        System.out.println(Message.substring(2, 5));
        int tut = 0;
        for (String Kelimeler : Message.split(" ")) {
            System.out.println(Kelimeler);
            tut++;

        }
        System.out.println(tut);


        sayıbul(1.2);

        sayılarıtopla(12, 12, 34, 45);

        //encapsulation java + Constructor
        Product _product = new Product("apple", 20, 1000.0, "Computer");
        System.out.println(_product.getName() + "name");


        //Overloading Biliniyor
        //Kalıtım
        Person _person = new Person();
        _person.Surname = "dayaç";


        KrediUI _KREDİ = new KrediUI();
        _KREDİ.hesapşa(new TarımKrediManager());

//polymorphism
        CustomerManager _custom = new CustomerManager(new DatabaseLogger());
        _custom.add();
        //Override
        Override_x.BaseÖdeme[] _base = new BaseÖdeme[]{new Override_x.OgretmenOdemesi(), new Override_x.TarımOdemesi(), new Override_x.BaseÖdeme()};
        for (BaseÖdeme baseÖdeme : _base) {
            baseÖdeme.hesapla(100);
        }
//abstract yapı
        GameCalculator _gamecalculate = new kidcalculator();
        _gamecalculate.hesapla();

//Interface bir class birden fazla ınterfacei kalıtabilir
        ICustomerDal _customer = new MysqlDal();
        _customer.database();


        CustomerManager_x _x = new CustomerManager_x(new MysqlDal());
        _x.add();

        func2();
        //Hata Yönetimi

       /* BalanceManager _balance = new BalanceManager();
        _balance.getBalance();
        try {
            _balance.withdraw(200);
        } catch (BalanceException e) {
            throw new RuntimeException(e);
        }
        _balance.getBalance();*/


        //file okuma yazma
        CreateFile();
        GetInfoFıle();
        WriterFile();
        ReadFile();

        //kolleksiyon generic
        Validator _vali = new Validator();
        _vali.validate(new Customer());

        //thread
        KronometrThread _kro = new KronometrThread("emir");
        KronometrThread _kro2 = new KronometrThread("emi2");
        _kro.start();
        _kro2.start();

    }

    //kolleksiyonlar
    Kolleksiyonlar a = new Kolleksiyonlar();


    //Hata Yönetimi
    static public void func2() {
        try {
            int[] dizi = new int[2];
            dizi[3] = 0;
        } catch (Exception e) {
            System.out.println(e);

        } finally {
            System.out.println("hER TÜRLÜ ÇALIŞIR");
        }
    }


    public static void CreateFile() {
        File _file = new File("C:\\Users\\emirc\\Desktop\\JavaLearn\\Okul.txt");
        try {
            extracted(_file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void extracted(File _file) throws IOException {
        if (_file.exists()) {
            if (_file.createNewFile()) {
                System.out.println("Dosya Oluştu");
            }
            System.out.println("Dosya Var Zaten");

        }
    }

    public static void GetInfoFıle() {
        File _file = new File("C:\\Users\\emirc\\Desktop\\JavaLearn\\Okul.txt");
        if (_file.exists()) {
            System.out.println(_file.getName());
            System.out.println(_file.canWrite());
            System.out.println(_file.canRead());
            System.out.println(_file.getAbsolutePath());
            System.out.println(_file.length());

        }
    }

    public static void ReadFile() {
        File _file = new File("C:\\Users\\emirc\\Desktop\\JavaLearn\\Okul.txt");
        try {
            Scanner _scan = new Scanner(_file);
            while (_scan.hasNextLine()) {
                String Line = _scan.nextLine();
                System.out.println(Line);


            }
        } catch (Exception err) {
            System.out.println(err);
        }
    }

    public static void WriterFile() {
        File _file = new File("C:\\Users\\emirc\\Desktop\\JavaLearn\\Okul.txt");
        try {
            BufferedWriter Writer = new BufferedWriter(new FileWriter("C:\\Users\\emirc\\Desktop\\JavaLearn\\Okul.txt", true));
            Writer.write("data");
            ReadFile();
        } catch (Exception err) {
            System.out.println(err);
        }

    }


    public static void sayıbul(double aranacak) {

        double[] mylistx = {1.2, 1.3, 4.2, 12.3, 43.1};
        for (double sayılar : mylistx) {
            if (sayılar == aranacak) {
                System.out.println("bu sayı mevcut");
            }


        }
    }


    public static void sayılarıtopla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            System.out.println(sayi);
            toplam += sayi;
        }

        System.out.println(toplam);
    }
}
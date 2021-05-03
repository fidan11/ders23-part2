package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws Exception {
//        (ders-23,1:26-ci deqiqe)-tipin qirilmagi
//        Bizim haldada tipinqirilmasina baxa bilerik.
        CustomProcess<String> customProcess = new CustomProcess(4.5);
//        generic typesi ise Stringdir. Rowtype ne demekdir? yeni hecnesiz bunun ozu.
        CustomProcess<Number> customProcess2 = new CustomProcess<>(1);
        CustomProcess<Comparable> customProcess3 = new CustomProcess<>(1);

        List<String> l = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        foo(customProcess);
        foo(customProcess2);
        foo(customProcess3);
    }


    public static void foo(CustomProcess customProcess) {
        customProcess.setObj("");//sual qoyduqda deyir bura ne geldiyini bilmirem
        customProcess.setObj(5);
        customProcess.setObj(true);

    }
//    Method List<?> qebul edir,lakin hansi tip oldugunu bilmir.
//    Bu zaman get-e icaze verir add-e icaze vermir,cunki hansi tip data add olunacagini bilmir.
//        List<> evezine List olsaydi istenilen obyekt add oluna bilerdi. Mehs buna gore wildcard
//    istifade edilir.
//    List genishlene bilen massivdir.
//        ___________________

//        (ders-23,1:16-ci deqiqe)
//        CustomProcess<String> customProcess = new CustomProcess<>(4.5);//bu tipin rowtype-si customprocessdir,
////        generic typesi ise Stringdir. Rowtype ne demekdir? yeni hecnesiz bunun ozu.
//        CustomProcess<Number> customProcess2 = new CustomProcess<>(1);
//        CustomProcess<Comparable> customProcess3 = new CustomProcess<>(1);
//
//        List<String> l = new ArrayList<>();//burada String yazsaq bele metodda sual yazilsa orda yenede
////        neyise add ede bilmeyeceyik.
//        List<Integer> l2 = new ArrayList<>();
//        foo(l);
//        foo(l);
//        foo(l);
////List genishlenen arraydir, arrayde meselen 5 verende onnan artiq vere bilmirdik, amma listde burada elan etdikde
////        tipini String vermisik yeni list genericdir,
//    }
//
//
//    public static void foo(List<?> list) {//List list yazsaq istediyimiz sheyi elave etmek demekdir,cunki ortada bir
////        generic yoxdur object var,object olduguna gore istediyimiz sheyi elave ede bilirik.
////        customProcess.add("");//add ede bilmirik,cunki tipini bilmirik
////        customProcess.get(0);//get edib istifade ede bilirik,amma yenede tipini bilmirik ve bu bize type safety verir,
////        cunki o listi qoruyur ki,tipini bilmirsense hecne elave ede bilmersen,amma get edib istifade ede bilersen.
////Tipini vermedikde sual qoyduqda add etmeye icaze vermir type safetye gore.
//list.get(0);
//
//    }
//        __________________
//        (ders-23,1:05-ci deqiqe)
//        CustomProcess<String> customProcess = new CustomProcess(4.5);
//        CustomProcess<Number> customProcess2 = new CustomProcess(1);
//        CustomProcess<Comparable> customProcess3 = new CustomProcess(1);
////Tipi solda vermishik amma sagdada vermek olur
//
//        foo(customProcess);
//        foo(customProcess2);
//        foo(customProcess3);
//
//    }
//
//
//    public static void foo(CustomProcess<? super Float> customProcess) {//super yazdiqda process tersine gedir,
////        yeni number ondan extend edir, meselen numberin yerine float yazsaq yuxarida ise customprocess2-nin yerine
////number yazsaq,bu halda float numberden extend etmish olduguna gore onu goturecek. Comparable yazsaq bele olacaq,
////        cunki Float Comparable implement edib. Yeni Float numberinde comparableninde superidir,yeni onun ustundedir,
////        o extend edib numberden o implement edib comparabledan.
//
////        supernen yazdiqda float ondan extend etmis olduguna gore lowerbounddur.
////        extends number dedikde ise bu onu yuxari upper serhedidir.
//
////        extendin upper bound olmagi normaldir,cunki ele bir shey olmalidir ki, numberden extend etsin number
////        bizim yuxari serhedimizdir.
////        Bunun eksi ise yeni super lower bounddur.
////        Unbound ise <?> demekdir,yeni serhedi bilinmir.Yeni ne geleceyini bilmirem amma bura bir shey oturacaq.
//
//
//    }
//        ____________________
//        (ders-23,57-ci deqiqe)-Wild Card, lower bound, upper bound, unbound
//        Wild card nedir?

//        CustomProcess<String> customProcess = new CustomProcess(4.5);
//        CustomProcess<Integer> customProcess2 = new CustomProcess(1);
//        CustomProcess<Byte> customProcess3 = new CustomProcess(1);
//
//
//        foo(customProcess);
//        foo(customProcess2);
//        foo(customProcess3);
//        //burada iki ve uc ishleyecek bir yox,cunki numberden extend etmir String
//    }
//
////    public static void foo(CustomProcess<?> customProcess) {//bura sualin yerine float yazsaq methodu cagiranda gerek customprocess
//////        oturek ona, customprocess2 ve customprocess3 oture bilmeyeceyik,cunki tipleri float deyil.
//////        Amma sual yazdiqda bu sual deyir ki,ne oturuleceyini bilmirem ve gonder, amma
////
////    }
//
//    //        Niye gore bu sual isharesini istifade edirik? List ele bir anlayisdi ki,biz ora bir nece ferqli
////    ferqli elementler elave ederik,integer float ve s. List<?>onu deyir ki,yeni biz
//
//    public static void foo(CustomProcess<? extends Number> customProcess) {//customProcesse gonderilen tip ele bir tipdir ki,
////        o numberden extend edib.
//
//    }
//        ___________________
//        (ders-23,52-ci deqiqe) - Methodlarda Generics, AutoCasting
//        CustomProcess customProcess = new CustomProcess(4.5);
//        CustomProcess customProcess2 = new CustomProcess(1);
//        CustomProcess customProcess3 = new CustomProcess(1);
//
//        float obj1 = customProcess.processAndReturn();//bu floati tutub methoddaki anin yerine yapisdirir
//        int obj2 = customProcess2.processAndReturn();
//        byte obj3 = customProcess3.processAndReturn();
//
//        customProcess.foo(1);//tipi goturur avtomatik methodda olan A nin yerinde istifade edir.
//        customProcess.foo(true);//ne otursek tip ona gore deyisir,dynamic olaraq deyisir
//
//        String ii = customProcess.foo("ss");//bunlarda autocasting bash vermish olur
//
//
//    }
//        __________________
//        (ders-23,47-ci deqiqe)-type eraser
//        Compile olduqdan sonra burdaki float integer byte itir yerine object oturur, yeni tipler hamisi silinir
//        yerine object yazilir. Tip silinmese idi bele cixir ki 3 dene custom prosess olmalidi iclerindede ferqli
//        ferqli tipde obj olmalidi,bu ise mumkun deyil.
//        CustomProcess<Float> customProcess = new CustomProcess(4.5);
//        CustomProcess<Integer> customProcess2 = new CustomProcess(1);
//        CustomProcess<Byte> customProcess3 = new CustomProcess(1);
//
//        float obj1 =  customProcess.processAndReturn();
//        int obj2 = customProcess2.processAndReturn();
//        byte obj3 = customProcess3.processAndReturn();
//
//
//    }
//        ________________
//        (ders-23,45-ci deqiqe)
//        CustomProcess<Float> customProcess = new CustomProcess(4.5);
//        CustomProcess<Integer> customProcess2 = new CustomProcess(1);
//        CustomProcess<Byte> customProcess3 = new CustomProcess(1);
//
//        float obj1 =  customProcess.processAndReturn();
//        int obj2 = customProcess2.processAndReturn();
//        byte obj3 = customProcess3.processAndReturn();
//
//
//    }
//        _______________
//        (ders-23,30-cu deqiqe)-generics nedir?

//        CustomProcess<String, Integer, Boolean, Byte> customProcess = new CustomProcess("");//bura tip yazmadan type safety olmur,
////        ona gore olmur ki,biz yuxariya baxib yaziriq sehv baxsaq runtime zamani xeta cixacaq, amma generic vasitesi
////        ile stringe int cast etdikde compile zamani bizi tehlukeden qoruyur.
////        Tutaq ki biz bura String yazmasaq onun yerine Object yazilmish olur.
////        Generics-deqiq olmayan,deyise bilen(dynamic).
//        CustomProcess<Integer, Integer, Boolean, Byte> customProcess2 = new CustomProcess(1);
//        CustomProcess<Boolean, Integer, Boolean, Byte> customProcess3 = new CustomProcess(true);
//
//        String obj1 = (String) customProcess.processAndReturn();
//        int obj2 = (int) customProcess2.processAndReturn();
//        boolean obj3 = (boolean) customProcess3.processAndReturn();
//
//        //Bu methodlarin hamisi geriye obj oturur, ve String qaytardiqda mutleq cast etmeliyi, eyni shekilde int,
////        booleanda-da cast etmeliyik. Amma cashib sehv yazsaq error verecek. Bu esnada bu problemi aradan
////        qaldirmaq ucun generic anlayishi istifade olunur.
//    }


//        ___________________
//        (ders-23,25-ci deqiqe)-Multithreading ve Concarency arasindaki ferq
//        Multithreading seherden etdiyimiz sheydir. Concarency-corelarin parallel ishe dushmesidir.
//        Bes aralarindaki ferq nedir?Thread demek mutleq shekilde core ishe dusecek demek deyil, yeni mutleq deyil ki,
//        4 core varsa 4 de ishe dusecek.
//        Ferz edek metbexdeyik ve bir alma ve bir portagal var,her ikisinide dogramaliyiq.
//        Biri var birinci almani dograyib qurtaraq sonra portagali, yeni portagal gozleyir,
//        biride var bir alma bir portagal tezden bir alma bir portagal dograyirsan, yeni ortada iki adam iki core
//        ishlemir bir core ishleyir, bir adam ishlemeyine baxmayaraq parallel olaraq bir neche ishi gorur.
//        Ishin her terefli heresinen az az edilmesin multithreadingdir, ve concurent prosesde multithreading sayilir,
//yeni heqiqi menada eyni ish gedir. Concarent olanda iki ishci olur biri almani kesir biri portagali parallel olaraq.


//        Main m = new Main();
//        MyThread t = new MyThread("thread 1");
//        MyThread t2 = new MyThread("thread 2");
//        ExecutorService executor = Executors.newWorkStealingPool();
//
//        List l = new ArrayList();
//        l.add(t);
//        l.add(t2);
//        List s = (List) executor.invokeAll(l);
//        System.out.println(s);
//        for (int i = 0; i < s.size(); i++) {
//            Future c = (Future) s.get(i);
//            System.out.println(c.get());
//        }
//
//    }
//
//
//    public void method1nonstatic() {
//        try {
////            Thread.activeCount();
//            System.out.println("method 1");
//            System.out.println("method 1 - part 2");
//            System.out.println("method 1 - part 3");
//            Thread.sleep(5000);
//            System.out.println("method 1 - part 4");
//        } catch (Exception ex) {
//
//        }
//    }
//
//    public void method2nonstatic() {
//        try {
//            System.out.println("method 2");
//            System.out.println("method 2 - part 2");
//            System.out.println("method 2 - part 3");
//            Thread.sleep(5000);
//            System.out.println("method 2 - part 4");
//        } catch (Exception ex) {
//
//        }
//    }
//
//    public static void method1() {
//        System.out.println("method 1");
//        System.out.println("method 1 - part 2");
//        System.out.println("method 1 - part 3");
//        synchronized (Main.class) {
//            System.out.println("method 1 - part 4");
////
//        }
////
//    }
//
//    public static void method2() {
//        System.out.println("method 2");
//        synchronized (Main.class) {
//            System.out.println("method 2 syncronized");
//        }

//        ________________
//        (ders-23,18-ci deqiqe)-invokeAll, invokeAny
//        Qisaca invokeAny goturur butun threadleri run edir ve en birinci finish olmus threadin cavabini qaytarir,
//invokeAll ise hamisini run edir ve hamisinin neticesini list olaraq geriye qaytarir.
//        Main m = new Main();
//        MyThread t = new MyThread("thread 1");
//        MyThread t2 = new MyThread("thread 2");
//        ExecutorService executor = Executors.newWorkStealingPool();
//
//        List l = new ArrayList();
//        l.add(t);
//        l.add(t2);
//        List s = (List) executor.invokeAll(l);
//        System.out.println(s);
//        for (int i = 0; i < s.size(); i++) {
//            Future c = (Future) s.get(i);
//            System.out.println(c.get());
//        }
//
////        List l = new ArrayList();
////        l.add(t);
////        l.add(t2);
////        String s = (String) executor.invokeAny(l);//callable ile istifade edirik, butun threadleri invoke edir, invokeAny threadleri run edir
//////        ve geriye her hansisa ilk finish olmush threadin cavabini geriye qaytarir.
////        System.out.println(s);
//
//    }
//
//
//    public void method1nonstatic() {
//        try {
////            Thread.activeCount();
//            System.out.println("method 1");
//            System.out.println("method 1 - part 2");
//            System.out.println("method 1 - part 3");
//            Thread.sleep(5000);
//            System.out.println("method 1 - part 4");
//        } catch (Exception ex) {
//
//        }
//    }
//
//    public void method2nonstatic() {
//        try {
//            System.out.println("method 2");
//            System.out.println("method 2 - part 2");
//            System.out.println("method 2 - part 3");
//            Thread.sleep(5000);
//            System.out.println("method 2 - part 4");
//        } catch (Exception ex) {
//
//        }
//    }
//
//    public static void method1() {
//        System.out.println("method 1");
//        System.out.println("method 1 - part 2");
//        System.out.println("method 1 - part 3");
//        synchronized (Main.class) {
//            System.out.println("method 1 - part 4");
////
//        }
////
//    }
//
//    public static void method2() {
//        System.out.println("method 2");
//        synchronized (Main.class) {
//            System.out.println("method 2 syncronized");
//        }


//        _______________
//        (ders-23,17-ci deqiqe)-generic olmadan cast edirik
//        Normal threadde biz future istifade etmeyende biz bu tip sheyler ede bilmirik, thread bize geriye nese
//        qaytara bilmir, threadin isDone() olub olmadigini sorusa bilmirik, amma threadi callable etdikde elemek olur.
//Callable ve runnable arasinda ferq budur.
//        Main m = new Main();
//        MyThread t = new MyThread(m);
//
//
//        ExecutorService executor = Executors.newWorkStealingPool();
//        Future f1 = executor.submit(t);//generic string yazdiq ki, geriye string qaytarsin
//
//        System.out.println(f1.isDone());
//        String obj = (String) f1.get();//geriye string qaytaracaq
//        System.out.println(obj);
////        System.out.println(obj.getClass().getName());
////        Thread.sleep(6000);
//        System.out.println(f1.isDone());
//    }
//
//    public Object monitor1 = new Object();
//    public Object monitor2 = new Object();
//
//
//    public void method1nonstatic() {
//        try {
////            Thread.activeCount();
//            System.out.println("method 1");
//            System.out.println("method 1 - part 2");
//            System.out.println("method 1 - part 3");
//            Thread.sleep(5000);
//            System.out.println("method 1 - part 4");
//        } catch (Exception ex) {
//
//        }
//    }
//
//    public void method2nonstatic() {
//        try {
//            System.out.println("method 2");
//            System.out.println("method 2 - part 2");
//            System.out.println("method 2 - part 3");
//            Thread.sleep(5000);
//            System.out.println("method 2 - part 4");
//        } catch (Exception ex) {
//
//        }
//    }
//
//    public static void method1() {
//        System.out.println("method 1");
//        System.out.println("method 1 - part 2");
//        System.out.println("method 1 - part 3");
//        synchronized (Main.class) {
//            System.out.println("method 1 - part 4");
////
//        }
////
//    }
//
//    public static void method2() {
//        System.out.println("method 2");
//        synchronized (Main.class) {
//            System.out.println("method 2 syncronized");
//        }
//        _______________
//        (ders-23,16-ci deqiqe)-generics
//        Generic bizi cast etmekden azad edir.
//
//        Main m = new Main();
//        MyThread t = new MyThread(m);
//
//
//        ExecutorService executor = Executors.newWorkStealingPool();
//        Future<String> f1 = executor.submit(t);//generic string yazdiq ki, geriye string qaytarsin
//
//        System.out.println(f1.isDone());
//        String obj = f1.get();//geriye string qaytaracaq
//        System.out.println(obj);
////        System.out.println(obj.getClass().getName());
////        Thread.sleep(6000);
//        System.out.println(f1.isDone());
//    }
//
//    public Object monitor1 = new Object();
//    public Object monitor2 = new Object();
//
//
//    public void method1nonstatic() {
//        try {
////            Thread.activeCount();
//            System.out.println("method 1");
//            System.out.println("method 1 - part 2");
//            System.out.println("method 1 - part 3");
//            Thread.sleep(5000);
//            System.out.println("method 1 - part 4");
//        } catch (Exception ex) {
//
//        }
//    }
//
//    public void method2nonstatic() {
//        try {
//            System.out.println("method 2");
//            System.out.println("method 2 - part 2");
//            System.out.println("method 2 - part 3");
//            Thread.sleep(5000);
//            System.out.println("method 2 - part 4");
//        } catch (Exception ex) {
//
//        }
//    }
//
//    public static void method1() {
//        System.out.println("method 1");
//        System.out.println("method 1 - part 2");
//        System.out.println("method 1 - part 3");
//        synchronized (Main.class) {
//            System.out.println("method 1 - part 4");
////
//        }
////
//    }
//
//    public static void method2() {
//        System.out.println("method 2");
//        synchronized (Main.class) {
//            System.out.println("method 2 syncronized");
//        }
//        ______________
//        Threadleri oz variantimiz ile run elemek var birde executor service vasitesi ile
//        Main m = new Main();
//        MyThread t = new MyThread(m);
//        MyThread2 t2 = new MyThread2(m);
//
////        Executor executor = Executors.newSingleThreadExecutor();//Neqeder thread gondersekde o goturub tek tek run edecek
////        Executor executor1 = Executors.newSingleThreadScheduledExecutor();//vaxt qoyur necese saniye sonra run et
////        Executor.newFixedThreadPool()-corun sayina gore necedene desek o qederini run edir
////        Executor executor2 = Executors.newCachedThreadPool()-ethiyyac yarandigca threadlerin sayini artirir,ve buda
////        kompu yorur. Boshda thread varsa onu istifade edecek yoxdursa yenisini yaradacaq baxmayacaq nece coredur.
////        Executor executor = Executors.newWorkStealingPool()//mecbur edir ki,butun corelar ishe dushsun ve parallel
////        olaraq ishe dushsunler. ExecutorService executordan extend edir ve onun icindede submit var, amma executorda
////        yoxdu.
//
//        ExecutorService executor = Executors.newWorkStealingPool();
//        Future f1 = executor.submit(t);
//
//        System.out.println(f1.isDone());
//        Object obj = f1.get();
//        System.out.println(obj);
////        System.out.println(obj.getClass().getName());
////        Thread.sleep(6000);
//        System.out.println(f1.isDone());
//    }
//
//    public Object monitor1 = new Object();
//    public Object monitor2 = new Object();
//
//
//    public void method1nonstatic() {
//        try {
////            Thread.activeCount();
//            System.out.println("method 1");
//            System.out.println("method 1 - part 2");
//            System.out.println("method 1 - part 3");
//            Thread.sleep(5000);
//            System.out.println("method 1 - part 4");
//        } catch (Exception ex) {
//
//        }
//    }
//
//    public void method2nonstatic() {
//        try {
//            System.out.println("method 2");
//            System.out.println("method 2 - part 2");
//            System.out.println("method 2 - part 3");
//            Thread.sleep(5000);
//            System.out.println("method 2 - part 4");
//        } catch (Exception ex) {
//
//        }
//    }
//
//    public static void method1() {
//        System.out.println("method 1");
//        System.out.println("method 1 - part 2");
//        System.out.println("method 1 - part 3");
//        synchronized (Main.class) {
//            System.out.println("method 1 - part 4");
////
//        }
////
//    }
//
//    public static void method2() {
//        System.out.println("method 2");
//        synchronized (Main.class) {
//            System.out.println("method 2 syncronized");
//        }

}


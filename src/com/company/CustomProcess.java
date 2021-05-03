package com.company;

//(ders-23,57-ci deqiqe)-Wild Card, lower bound, upper bound, unbound
public class CustomProcess<T> {

    T obj;

    public CustomProcess(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T processAndReturn() {
        System.out.println("prosessed");
        return  obj;
    }

//___________________
//(ders-23,52-ci deqiqe)-Methodlarda Generics, AutoCasting
//public class CustomProcess {
////    Isteyirik ki, calssi Generic etmeyek. Yuxarida<> yazmaq evezine methodda yazib tipi elan edirik
//    Object obj;
//
//    public CustomProcess(Object obj) {
//        this.obj = obj;
//    }
//
//    public Object getObj() {
//        return obj;
//    }
//
//    public void setObj(Object obj) {
//        this.obj = obj;
//    }
//
//    public <A> A processAndReturn() {//diamond arasinda elan etdiyimiz tipi
//        System.out.println("prosessed");
//        return (A)obj;
//    }
//
////    public <A> void foo(A v){//A-nin tipinin ne olacagini bura menimseden kimi bilecek
////        System.out.println("processed");
////    }
//
//    public <A> A foo(A v){//A-nin tipinin ne olacagini bura menimseden kimi bilecek
//        System.out.println("processed");
//        return v;
//    }

//________________
//(ders-23,45-ci deqiqe)
//public class CustomProcess<ALMA extends Number> extends CustomProcess2<ALMA> {//ALMA ele bir tip olmalidir ki numberden extend elesin
    //CustomProcess2-den extend etdikde yerindece tipinide vere biler,oz tipini bura oturede biler.
//    CustomProcess CustomProcess2-ni istifade edib onu extend edir ve tipini verir ki,floatsan.
//    Yeni mainde istifade etdikde tipi vermek ile burada tipini vermek arasinda ferq yoxdur.
//    Istesem customprocesse oturulen alma tipini customprosess ikiye oturub alma yaza bilerik.
//    Bu ne demekdir,mainde float yazdiqda customprosess2-ye float oturulur, yeni bir tipi digerine oture bilirik.
//Bu o demekdir ki,customprocess2-de olan A floata cevrilir.Yeni biri digerine tipini oture bilir,ve ya hansi tipi
//    yazirsa o curde istifade ede biler.
//    ALMA obj;
//
//    public CustomProcess(ALMA obj) {
//        this.obj = obj;
//    }
//
//    public Object getObj() {
//        return obj;
//    }
//
//    public void setObj(ALMA obj) {
//        this.obj = obj;
//    }
//
//    public ALMA processAndReturn() {
//        System.out.println("prosessed");
//        return obj;
//    }


//________________
//public class CustomProcess<ALMA,E,T,B> {//bir nece tip olduqda hamisini istifade etmek mecburiyyetinde deyilik,
////    amma bir nece tip yazdiqsa gerek butun tiplerin yerine nese qoyasan.
//
//    //    Object obj;
//    ALMA obj;//harda Object gorsek yerine T yaziriq. Bu T sherti olaraq yazilmis bir sheydir. Bu T ne edir?
////    Bu T object yaradilanda bize sherait yaradir ki,her obyektin return tip deyishsin.Normalda oyreshmisik ki,
////    method yaradanda tipini yazib onuda istifade ele,amma indi T yazib ferqli ferqli meqamlarda ferqli ferqli
////    tipler qaytarmis oluruq. Buna deyirler generic. Yeni qisaca generic castingi evez edir. Generic type safetydir.
////    Tipin tehlukesizliyi.Realliqda ne return etdiyini bilmirik,qalxib yuxarida baxiriq.Sehv baxdiqda runtime error bash
////verir.
//
//    public CustomProcess(ALMA obj) {
//        this.obj = obj;
//    }
//
//    public Object getObj() {
//        return obj;
//    }
//
//    public void setObj(ALMA obj) {
//        this.obj = obj;
//    }
//
//    public ALMA processAndReturn() {//bu prosess bir ish gorur, geriye obj qaytarir
//        System.out.println("prosessed");
//        return obj;
//    }
}

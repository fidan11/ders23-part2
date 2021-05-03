package com.company;

//(ders-23,52-ci deqiqe) - Methodlarda Generics, AutoCasting
public class CustomProcess2<A extends Number> {




//__________________
//(ders-23,45-ci deqiqe)-Classlarda generics, Generic Class Generic Classdan extends edir
//public class CustomProcess2<A extends Number> {//ALMA ele bir tip olmalidir ki numberden extend elesin




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

public class Main {
    public static void main(String[] args) {
        //задание 1.1
        int salary= 29000;
        int total=0;
        for(int i=0;total < 2_459_000;i++) {
            total=total+total/120;
            total=total+salary;
            System.out.println("Месяц "+i+ " сумма накоплений равна"+total +"рублей");}


        //задание 1.2
        for (int e=0;e<11;e++){
        System.out.print(e);}
        int start=11;
        while ( start>0){ --start; System.out.print(start);}


        //задание 1.3
        int born =17;
        int dies=8;
        int totalPeople=0;
        int y =12_000_000;
   for (int i =2000;i<2010;i++){
       totalPeople=totalPeople+totalPeople/1000 * (born-dies);
       totalPeople=totalPeople+y ;
       System.out.println(" Год"+ i+" численность населения составляет "+ totalPeople );}


        //задание 2.1 и Задача 2.2
       double income= 15000;
       double s=0.07;
       for(int i=0;income<12_000_000;i++){income=income+income*s;
            if (i%6==0){
            System.out.println("Месяц"+i+"сумма"+Math.round(income));}}
    double income2= 15000;
    double s2=0.07;
        int HowManyYears=9;
    int year= 12*HowManyYears;
    for (year=0 ;year <12*HowManyYears;year++){income2=income2+income2*s;
        if (year%6==0){
        System.out.println("Месяц"+year +"сумма"+Math.round(income2));}


        // Задача 3.1
        int fly=79;
        for(int i=0;i<2022+100;i++){ if(i%79==0){System.out.println(i);
    }}


        //Задача 3.2
       for(int j=0; j<11;j++){ System.out.println(j+"+2="+j*2);
        }

//задание 2.4
        for(int w=0;w<31;w++){if (w%7==0)
       System.out.println("Сегодня пятница "+(w +5 )+"-е число. Необходимо подготовить отчет." );}}}}









public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

     Employee(String name,double salary, int workHours, int hireYear){

        this.name= name;
        this.salary= salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

     }

     void toStrings(){
         double vergi,artis,net;
         int bonus;


        System.out.println("Adi : "+this.name);
        System.out.println("Asli Maas: "+this.salary);
        System.out.println("Calisma Saati : " +this.workHours);
        System.out.println("ise Giris Yili : "+ this.hireYear);

        vergi= tax();
         System.out.println("Kesilen Vergi : "+vergi);
         bonus = bonus();
         System.out.println("Bonus : "+bonus);
         artis = raiseSalary();
         System.out.println("Artis :"+artis);
         net= this.salary+bonus+artis-vergi;
         System.out.println("Net Maas :"+net);

    }

    double tax(){
         double vergi;
        if(this.salary<=1000.0){
            return vergi=0;
         }else {
            return vergi= this.salary * 0.03;

         }
        }

         int bonus(){
            if(this.workHours>40){
                 int bonus1= (this.workHours-40)*30;
                 return  bonus1;
            }
            return 0;
         }

        double raiseSalary(){
         double artis;

          if(this.hireYear<10){
           return artis=this.salary*0.05;

          }else if(this.hireYear>9&&this.hireYear<20){
            return artis = this.salary*0.1;
          }else{
            return artis = this.salary*0.15;
          }


        }

    }



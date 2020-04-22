package day55;


abstract class ScrumTeam{
public     String Name , JobTitle;
public     double salary;


public abstract void DailyStandUp();
public abstract void Demo();
public void getEmployeeInfo(){
    System.out.println("Employee Name "+ Name);
    System.out.println("Job Title "+JobTitle);
    System.out.println("Salary: "+salary);
}
}





class Testers extends ScrumTeam{
    public Testers(String Name,String JobTitle, double salary){
        this.Name = Name;
        this.JobTitle = JobTitle;
        this.salary = salary;

    }

    @Override
    public void DailyStandUp() {
        System.out.println("Tester "+Name+" is talking");
    }

    @Override
    public void Demo() {
        System.out.println("Tester "+Name+" is doing demo");

    }
}
class Developers extends ScrumTeam{
    public Developers(String Name,String JobTitle,double salary){
        this.Name =Name;
        this.JobTitle = JobTitle;
        this.salary = salary;
    }

    public void DailyStandUp() {

    }

    public void Demo() {

    }
}

public class BOA {
    public static void main(String[] args) {

        Testers Madina = new Testers("Madina","ScrumMaster",90000);
        Madina.DailyStandUp();
        Madina.getEmployeeInfo();
        System.out.println("=====================================");
        Testers Akerke = new Testers("Akerke","Sdet",130000);
        Akerke.DailyStandUp();
        Akerke.getEmployeeInfo();

        Testers[] testers = {Madina,Akerke,};
        for(Testers each: testers){
            each.getEmployeeInfo();
        }

        Developers Nadire = new Developers("Nadire","Senior Developer",150000);
        Developers Mahir = new Developers("Mahir","Junior Developer",130000);
        Developers Parsa = new Developers("Parsa","Medium Developer",22000);
        Developers Delare = new Developers("Dilara","Developer",20000);

        Developers[] developers = {Nadire,Mahir,Parsa,Delare};

        for(Developers each: developers){
            each.getEmployeeInfo();
        }


    }
}

import java.util.Arrays;

public class Person{
    private String name;
    private String nationality;
    private String dateOfbirth;
    private String[] passport;
    private int seatNumber;
    //chooseSeat();
    public Person(String name, String nationality,String dateOfbirth,int seatNumber){
        this.name=name;
        this.nationality=nationality;
        this.dateOfbirth=dateOfbirth;
        this.seatNumber=seatNumber;
        this.passport=new String[3];
    }
    //intializaton of copy constructor
    public Person(Person source){
        
        this.name=source.name;
        this.nationality=source.nationality;
        this.dateOfbirth=source.dateOfbirth;
        this.seatNumber=source.seatNumber;
        this.passport=Arrays.copyOf(source.passport, source.passport.length);
    }
    public void set_passport(){
        this.passport[0]=this.name;
        this.passport[1]=this.nationality;
        this.passport[2]=this.dateOfbirth;

    }
    public String[] get_passport(){
        return Arrays.copyOf(this.passport, this.passport.length);
    }
    public String getname(){
        return this.name;
    }
    public String getnationality(){
        return this.nationality;
    }
    public String getdateOfbirth(){
        return this.dateOfbirth;
    }
    public int getseatNumber(){
        return this.seatNumber;
    }
    public void set_name(String name){
        this.name=name;
    }
    public void set_nationality(String nationality){
        this.nationality=nationality;
    }
    public void set_dateOfbirth(String dateOfbirth){
        this.dateOfbirth=dateOfbirth;
    }
    public void set_seatnumber(int seatNumber){
        this.seatNumber=seatNumber;}

    // public void different_approach(){
    //     System.out.println("Name: "+name);
    //     System.out.println("Nationality: "+nationality);
    //     System.out.println("Date Of Birth: "+dateOfbirth);
    //     System.out.println("Seat Number: "+seatNumber);}
    public boolean applyPassport(){
        double num=Math.random()*2;
        int num1=(int)num;
        if(num1==0){
            return false;
        }
        else if(num1==1){
            return true;
        }
        else{
            return true;
        }
    }
    public void chooseSeat(){
        double num2=Math.random()*11;
        int sum1=(int)num2;
        sum1+=1;
        this.seatNumber=sum1;
    }
    public String toString(){
        return "Name: "+this.name+"\n"+"Nationality: "+this.nationality+"\n"
        +"Date Of Birth: "+this.dateOfbirth+"\n"+"Seat Number: "+this.seatNumber+"\n"
        +"Passport: "+Arrays.toString(this.passport)+"\n\n";
    }

}
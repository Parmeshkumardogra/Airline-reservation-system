
import java.util.Scanner;
public class Airline {
    private Person[] seat;
    public Airline(){
        this.seat=new Person[11];
    }
    public Person[] getarray(){
        return (seat);
    }
    public Person getperson(int index){
        return new Person(this.seat[index]);
    }
    public void setPerson(Person obj){
        int seat_number_1=obj.getseatNumber()-1;
        this.seat[seat_number_1]=new Person(obj);
    }
    public void createReservation(Person obj){
        while(this.seat[obj.getseatNumber()-1] != null){
            System.out.println("\n"+ obj.getname() +" ,seat: "+obj.getseatNumber()+ " is already taken. Please choose another one.\n");
            obj.chooseSeat();
        }
        this.seat[obj.getseatNumber()-1]=new Person(obj);
        System.out.println("Thank you "+obj.getname() + " for flying with Java airlines. Your seat number is "+obj.getseatNumber()+".\n");
    }
    public String toString(){
        String temp="";
        for (int i = 0; i < this.seat.length; i++) {
            if(this.seat[i]!=null){temp+=this.seat[i].toString()+"\n\n";}
            else{temp+="Seat: "+(i+1)+" is empty\n\n";}
            
        }
        return temp;
     
    }
}

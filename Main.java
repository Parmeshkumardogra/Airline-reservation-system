import java.util.Arrays;

// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Person parmesh=new Person("Parmesh Kumar","Indian","11/03/2001",5);
       
        Person[] people = new Person[] 
        { new Person("Cleopatra", "Egypt", "69 BC", 1),
        new Person("Alexander the Great", "Macedon", "356 BC", 2),
        new Person("Julius Caesar", "Rome", "100 BC", 3),
        new Person("Hannibal", "Carthage", "247 BC", 4),
        new Person("Confucius", "China", "551 BC", 5),
        new Person("Pericles", "Greece", "429 BC", 6),
        new Person("Spartacus", "Thrace", "111 BC", 7),
        new Person("Marcus Aurelius", "Rome", "121 AD", 8),
        new Person("Leonidas", "Greece", "540 BC", 9),
        new Person("Sun Tzu", "China", "544 BC", 10),
        new Person("Hammurabi", "Babylon", "1750 BC", 10),
        };
        Airline airline = new Airline();
        for (int i = 0; i < people.length; i++) {
            if(people[i].applyPassport()==true){  //random reservation generation
                people[i].set_passport();
                airline.createReservation(people[i]);
            }
            
        }
        System.out.println("****************** RESERVATIONS COMPLETE! ******************");
        System.out.println(airline);
        
        
        
        
        // for (int i = 0; i < people.length; i++) {
        //     airline.createReservation(people[i]);                   
        // }
            
        // }
        // System.out.println("****************** RESERVATIONS COMPLETE! ******************");  
        // System.out.println(airline.toString());
        
        // System.out.println(Arrays.toString(airline.getarray()));

        // System.out.println(airline.getperson(0));
        // Person[] arr1=airline.getarray();
        // airline.creatReservation(people[1]);
        // System.out.println(Arrays.toString(arr1));
        
        // for (int i = 0; i < people.length; i++) {
        //     airline.creatReservation(people[i]);
        // }
        // for (int i = 0; i < people.length; i++) {
        //     System.out.println(airline.getperson(i)+"\n\n");
            
        // }
     }
 }
        // Person parmesh2=new Person(parmesh);
        // boolean val=parmesh.applyPassport();
        // if(val==true){
        //     System.out.println("Congratualations! "+parmesh.getname()+" your Passport is approved.");
        //     parmesh.set_passport();
        //     System.out.println(parmesh);
           
        // }else{
        //     System.out.println("We are sorry, "+parmesh.getname()+" we cannot process your application.");
        //     System.out.println(parmesh);
            
        // }


        // Airline a1=new Airline();
        // a1.setPerson(parmesh,0);
        // System.out.println(a1.getperson(0));
        // System.out.println(Arrays.toString(a1.getarray()));
        // System.out.println(a1.getperson(0).getname());
   

// Parmesh.chooseSeat();
// System.out.println("Name: "+Parmesh.getname());
// System.out.println("Nationality: "+Parmesh.getnationality());
// System.out.println("Date of birth "+Parmesh.getdateOfbirth());
// System.out.println("Seat number: "+Parmesh.getseatNumber());
// boolean val=Parmesh.applyPassport();
// if(val==true){
//     System.out.println("Congratualations! "+Parmesh.getname()+" your Passport is approved.");
// }else{
//     System.out.println("We are sorry, "+Parmesh.getname()+" we cannot process your application.");
// }
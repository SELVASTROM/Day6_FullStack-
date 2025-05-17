import java.util.*;
class CAR {
   private String model;
   private int speed;
   private boolean modified;
   private float fine;
    public String  setmodel(){
        return model;
    }
    public void getmodel(String models){
        this.model=models;
    }
    public int setspeed(){
        return speed;
    }
    public void getspeed(int speeds){
        if(speeds>=200){
            this.speed=speeds;
        }else{
            System.out.println("your car is slow like a tortoise");
        }
    }
    public boolean setmodified(){
        return modified;
    }
    public void getmodified(boolean modifieds){
        this.modified=modifieds;
    }
    public float setfine(){
        return fine;
    }
    public void getfine(float fines){
        this.fine=fines;
    }
    
}
class Speed {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        CAR r=new CAR();
        System.out.println("Enter model varient");
        r.getmodel(s.nextLine());
        System.out.println("Enter your highest speed");
        r.getspeed(s.nextInt());
        System.out.println("Enter your vechicle is modified or not");
        r.getmodified(s.nextBoolean());
        System.out.println("Enter your fine amount");
        r.getfine(s.nextFloat());
        System.out.println("Here your vechicle details");
        System.out.println("your model is"+r.setmodel());
        System.out.println("your highest speed is"+r.setspeed());
        if(r.setmodified()==true){
        System.out.println("so your car is modified");
        }else{
            System.out.println("you have a fresh car");
        }
        if(r.setfine()>1000){
        System.out.println("so you break lot of traffic rules");
        }else if(r.setfine()<1000 && r.setfine()>=0){
            System.out.println("some times bad luck happens");
        }else{
            System.out.println("nice man");
        }
        s.close();
    }
    
}

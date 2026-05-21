 class computer{
    public void getMyMusic(){
        System.out.println("I am playing music");
    }
    public String getMyPen(int cost){

        if(cost>=10){
            return "my pen";
             
            
        
       

    }return"nothing";}}
    
 
 public class abc {
    public static void main(String[] args) {
        computer cm=new computer();
        cm.getMyMusic();
        String pen=cm.getMyPen(2);
        System.out.println(pen);
        
    }
    
}

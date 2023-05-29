package ComposicionFuerteDebil;

public class Bateria {

   private double mAh;
   private String marca;
  
   public Bateria(double mAh,String marca){
      this.mAh=mAh;
      this.marca=marca;
   }
  
   public void setmAh(double mAh){
      this.mAh=mAh;
   }
  
   public double getmAh(){
      return mAh;
   }
   public void setMarca(String marca){
      this.marca=marca;
   }
   
   public String getMarca(){
      return marca;
   }
  }
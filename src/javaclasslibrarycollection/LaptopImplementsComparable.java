package javaclasslibrarycollection;

public class LaptopImplementsComparable implements Comparable<LaptopImplementsComparable>{
  String brand;
  int ram;
  int price;

  public LaptopImplementsComparable(String brand,int ram,int price){
    this.brand=brand;
    this.price=price;
    this.ram=ram;
  }
  public String getBrand(){
    return brand;
  }

  public int getRam(){
    return ram;
  }
  public int getPrice(){
    return price;
  }
  @Override
  public String toString(){
    return "Laptop [brand=" + brand + ", ram=" + ram +", price=" + price + "]";
  }
  @Override
  public int compareTo(LaptopImplementsComparable lap2){
    if(this.getRam()>lap2.getRam()) //calling methods with object using this keyword for LaptopImplementsComparable
      return 1;//if first object is greater than second object , we return +ve value
    else       //if first object is equal to second object , we return 0
      return-1;//if first object is less than second object , we return -ve value

  }







}

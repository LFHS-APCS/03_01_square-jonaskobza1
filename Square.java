
public class Square{


private double side;
public final int MAX_SIDE_LENGTH = 10;



public Square(double aSide){
  side = aSide;
}
public void setSide(double theSide){
  if (theSide <= MAX_SIDE_LENGTH && theSide > 0){
    side = theSide;
  }
}
public double getSide(){
  return side;
}

public String toString(){
  return "Square with side length = " +side;
}
public double area(){
  return side * side;
}
public double diagonal(){
  return side * 1.414213562;
}
}

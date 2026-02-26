public class Car {

       private String make = "Tesla";
       private String model = "Model IX";
       private Integer doors = 2;
       private boolean convertible = true;
       private String color = "Gray";

       public void describeCar(){

           System.out.println("Car=> with make => " + make + " model => " + doors + " doors");

       }

       public String getMake() {
              return make;
       }

       public String getModel() {
              return model;
       }

       public Integer getDoors() {
              return doors;
       }

       public void setModel(String model) {
              this.model = model;
       }

       public void setDoors(Integer doors) {
              this.doors = doors;
       }

       public void setConvertible(boolean convertible) {
              this.convertible = convertible;
       }

       public void setColor(String color) {
              this.color = color;
       }

       public boolean isConvertible() {
              return convertible;
       }

       public String getColor() {
              return color;
       }

       public void setMake(String make) {

              if(make == null) make = "Unknown";
              String lowercaseMake = make.toLowerCase();
              switch (lowercaseMake){
                     case "holden","porsche","tesla"->this.make = make;
                     default -> {
                            this.make = "Unsupported";
                     }

              }

       }


}
package sourseit.HomeWork.Sydorenko.HomeWork5;

public class Car implements Comparable
{

        public String brand;
        public int engineNumber;
        public String color;

        Car (String brand, int year, String color){
            this.brand = brand;
            this.engineNumber = year;
            this.color = color;

        }
        public String getBrand(){
            return brand;
        }
        public int getEngineNumber(){
            return engineNumber;
        }
        public String getColor(){
            return color;
        }


        @Override
        public String toString()
        {
            return "Car: " + getBrand() + ", model year vehicle: " + getEngineNumber() + ", color: " + getColor();
        }
        @Override
        public boolean equals (Object o) {
            if (((Car)o).getEngineNumber() == this.getEngineNumber()){
                return true;}
            else{
                return false;}
        }

        @Override
        public int hashCode(){
            return engineNumber;
    }

    @Override
    public int compareTo(Object o)
    {
        return this.getEngineNumber() > ((Car)o).getEngineNumber() ? 1 :
                                                        this.getEngineNumber() == ((Car)o).getEngineNumber() ? 0 : -1;
    }
}


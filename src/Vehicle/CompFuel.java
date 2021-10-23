package Vehicle;

    class Vehicle {
        int passenger;
        int fuelcap;
        int mpg;

        public Vehicle(int p, int f, int m) {  //konstruktor
            this.passenger = p;
            this.fuelcap = f;
            this.mpg = m;
        }

        int range() {           //method
        return mpg * fuelcap;}

        double fuelneeded (int miles) {   //method
            return (double) miles / mpg;
        }
    }






    class CompfFuel {

        public static void main(String[] args) {

            Vehicle minivan = new Vehicle(7, 16, 21);
            Vehicle sportcar = new Vehicle(2, 14, 12);

            double gallons;
            int distance = 252;


            gallons = minivan.fuelneeded(distance);

            System.out.println("Для преодоления "+distance+"миль мини-фургону требуется "+gallons+" галлонов топлива");

            gallons = sportcar.fuelneeded(distance);

            System.out.println("Для преодоления "+distance+"миль спорткару требуется "+gallons+" галлонов топлива");



        }
    }
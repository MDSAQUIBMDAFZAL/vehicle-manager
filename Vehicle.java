public class Vehicle {
    
	public static void main(String[] args){
        private PetrolEngine pE=new PetrolEngine();
        pE.start();
                
        private DieselEngine dE = new DieselEngine();
        dE.start();
        private ElectricEngine eE = new ElectricEngine();
        eE.start();
    }
}
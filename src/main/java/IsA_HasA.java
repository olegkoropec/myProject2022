public class IsA_HasA {
    public static void main(String[] args) {
        Pulsar myPulsar = new Pulsar();
        Bike myBike1 = new Bike();
        Bike myBike2 = new Pulsar();

        myBike1.setColor("BLACK");
        myBike2.setColor("BLACK");
        myBike1.setMaxSpeed(136);
        myBike2.setMaxSpeed(136);

        myBike1.bikeInfo();
        myPulsar.bikeInfo();
        myBike2.bikeInfo();
        myPulsar.PulsarStartDemo();
    }
}

class Bike {
    private String color;
    private int maxSpeed;

    public void bikeInfo() {
        System.out.println("Bike Color= " + color + " Max Speed= " + maxSpeed);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

class Pulsar extends Bike {         // Is A - відношення "являюсь" - Комрозиція. Т. таке відношення і є наслідування
    public void PulsarStartDemo() {
        Engine PulsarEngine = new Engine();
        PulsarEngine.stop();
    }

    public void bikeInfo() {
        System.out.println("Bike Color Max Speed ");
    }
}

class Engine {
    int weight;
    int number_celandines;
    Pulsar pulsar = new Pulsar();       // Has A - відношення "являюсь частиною" - Агрегація

    public Engine(Pulsar pulsar) {
        this.pulsar = pulsar;
    }

    public Engine() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumber_celandines() {
        return number_celandines;
    }

    public void setNumber_celandines(int number_celandines) {
        this.number_celandines = number_celandines;
    }

    public void start() {
        System.out.println("Started:");
    }

    public void stop() {
        System.out.println("Stopped:");
    }
}

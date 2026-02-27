class Transport {
    void travelMode() {
        System.out.println("Traveling");
    }
}

class Bus extends Transport {
    void travelMode() {
        System.out.println("Traveling by bus");
    }
}

class Train extends Transport {
    void travelMode() {
        System.out.println("Traveling by train");
    }
}

class Flight extends Transport {
    void travelMode() {
        System.out.println("Traveling by flight");
    }
}

public class TransportTravel {
    public static void main(String[] args) {

        Transport t;

        t = new Bus();
        t.travelMode();

        t = new Train();
        t.travelMode();

        t = new Flight();
        t.travelMode();
    }
}
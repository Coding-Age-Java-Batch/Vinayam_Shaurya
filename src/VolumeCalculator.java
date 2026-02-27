class VolumeCalculator {

    // Volume of Cube
    int volume(int side) {
        return side * side * side;
    }

    // Volume of Cuboid
    int volume(int length, int breadth, int height) {
        return length * breadth * height;
    }

    // Volume of Cylinder
    double volume(double radius, double height) {
        return 3.14 * radius * radius * height;
    }

    public static void main(String[] args) {

        VolumeCalculator vc = new VolumeCalculator();

        System.out.println("Volume of Cube: " + vc.volume(3));
        System.out.println("Volume of Cuboid: " + vc.volume(4, 5, 6));
        System.out.println("Volume of Cylinder: " + vc.volume(5.0, 4.0));
    }
}
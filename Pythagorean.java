public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        double sqA = Math.pow(legA, 2);
        double sqB = Math.pow(legB, 2);
        return Math.sqrt(sqA + sqB);
    }
}
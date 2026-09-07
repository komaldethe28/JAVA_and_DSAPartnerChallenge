// Q24: A person travels two distances with same distance but different speeds. Find average speed.

class AverageSpeed {
    public static void main(String[] args) {
        
        int speed1=60;
        int speed2=40;
        int avgSpeed=(2*speed1*speed2)/(speed1+speed2);
        System.out.println("Average Speed :"+avgSpeed);
    }
}
public class User {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.volumeUp();
        System.out.println(smartTv.volume);

        System.out.println("current channel before switching it: " + smartTv.channel);
        smartTv.setChannel(13);
        System.out.println("current channel after switching it: " + smartTv.channel);

        System.out.println("is the tv on? " + smartTv.isOn);
        System.out.println("current channel: " + smartTv.channel);
        System.out.println("current volume: " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("new status -> is the tv on? " + smartTv.isOn);

    }
}

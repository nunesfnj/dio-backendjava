public class SmartTv {
    boolean isOn     = false;
    int channel = 1;
    int volume = 25;

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public void volumeUp(){
        volume++;
    }

    public void volumeDown(){
        volume--;
    }

    public void setChannel(int newChannel){
        channel = newChannel;
    }

    public void nextChannel(){
        channel++;
    }

    public void previousChannel(){
        channel--;
    }
}


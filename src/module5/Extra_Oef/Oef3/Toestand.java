package module5.Extra_Oef.Oef3;

public enum Toestand {
    STARTED, PAUSED, STOPPED, UNREACHABLE;

    public void run(){
        System.out.println(this.name());
    }
}

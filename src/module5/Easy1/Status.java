package module5.Easy1;

public enum Status {
    STARTED, PAUSED, STOPPED, UNREACHABLE;


    Status() {
    }

    public void run(){
        System.out.println(this.name());
    }
}

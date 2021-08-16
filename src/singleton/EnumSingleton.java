package singleton;

public enum EnumSingleton {
    INSTANCE;

    public void talk() {
        System.out.println("This is an EnumSingleton " + this.hashCode());
    }
}

package tp5;

public enum Genero {
    RK("Rock"), TP("Trap"), JZ("Jazz"), HP("Hip Hop"), POP("Pop"), MT("Metal"), CL("Clasico");

    private String name;

    private Genero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

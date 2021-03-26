package clase2;

public class Contador {

    private Integer value;

    public Contador() { }

    public Contador(Integer value) {
        this.value = value;
    }

    public Contador(Contador contador) {
        this.value = contador.value;
    }

    public Integer incrementar() {
        return this.value++;
    }

    public Integer Decrementar() {
        return this.value--;
    }

}

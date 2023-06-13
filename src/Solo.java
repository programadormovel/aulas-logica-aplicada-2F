public class Solo {
    // Atributos
    String tipo;
    String cor;
    String substancias;
    boolean fertil;
    // Métodos
    public Planta gerarPlanta(Semente s1){
        Planta p1 = new Planta(s1);
        return p1;
    }
}

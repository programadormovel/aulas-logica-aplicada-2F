public class Main {
    public static void main(String[] args) {
        // Aula de Orientação à Objetos
        // Declarar objetos
        Pessoa adao;
        // Instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();
        // Definição do formato
        adao.nome = "Adão";
        adao.sobrenome = "Silva";
        eva.nome = "Eva";
        eva.sobrenome = "Silva";
        // Acionar comportamento
        adao.falar();
        eva.falar();


    }
}
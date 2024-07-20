/*
Cria uma interface funcional anotada, para evitar a criação de mais de um método abstrato.
Interface funcional contém um único método.
 */

@FunctionalInterface
public interface Figura {
    /*
    Cria um método para instanciar um objeto do tipo Retangulo.
     */
    Retangulo calcula(Double a, Double l);
}

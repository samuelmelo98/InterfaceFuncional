public class Main {
    public static void main(String[] args) {
        /*
        Instancia um objeto do tipo Retangulo por meio da interface Figura.
         */
        Figura figura = Retangulo::new;
        figura.calcula(10.0,10.2);
        System.out.println(figura.calcula(10.5,10.9));
    }
}

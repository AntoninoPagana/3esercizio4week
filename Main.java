public class Main {
    public static void main(String[] args) {
        dividoNumero(5);
    }
    public static void dividoNumero(int valore){
        try {
            int risultato = valore / 0;
            System.out.println("Il risultato della divisione e' " + risultato);
        } catch (Exception e){
            System.out.println("Errore: " + e);
        }
    }
}

//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array
//per 0 e gestista sia l'eccezione della divisione che quella di indice non presente nell'array,
//leggendone il messaggio.
//Eseguire sempre un blocco di codice scrivendo un messaggio in console.

public class Main {
    public static void main(String[] args) {
        dividiArray(3);
    }

    public static void dividiArray(int index) { //funzione che divide array in posizione indice/num
        int[] numeri = {4, 5, 6}; //creato array
        try {
            int risultato = numeri[index] / 0; // index sarà un numero che andrò a prendere
        } catch (ArithmeticException e) {
            System.out.println("Errore aritmetico è: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException a) { //indica che index non esiste all'interno dell'array
            System.out.println("Errore index è: " + a.getMessage());
        }
    }
}



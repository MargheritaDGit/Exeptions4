//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array
//per 0 e gestista sia l'eccezione della divisione che quella di indice non presente nell'array,
//leggendone il messaggio.
//Eseguire sempre un blocco di codice scrivendo un messaggio in console.

public class Main {
    public static void main(String[] args) {
        try {                                                   //eseguito funzione nel try e nel catch catturato errore
        System.out.println(dividiArray(5, 2));
    } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int dividiArray(int index, int num) { //funzione che divide array in posizione indice/num
        int[] numeri = {2, 4, 6, 8, 10};
        if (num == 0 || index > numeri.length - 1) {
            throw new ArithmeticException("Errore");
        } else {
            return numeri[index] / num;
        }
    }
}


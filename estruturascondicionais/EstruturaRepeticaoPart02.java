package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class EstruturaRepeticaoPart02 {
    public static void main(String[] args){
        // for
        // while
        // do while
        int contador = 1;

        while (contador <= 10){
            System.out.println(contador);

            contador++;
        }

        int numeroTabuada = 0;
        int i = 5;

        while (numeroTabuada <= 10){
            System.out.println(numeroTabuada + "x" + i + "=" + (numeroTabuada * i)  );

            numeroTabuada++;
        }
    }
}

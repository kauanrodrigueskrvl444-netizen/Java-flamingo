package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class ArraysPart01 {
    public static void main(String[] args){
        int[] idades = new int[4];
        idades[0] = 12;
        idades[1] = 21;
        idades[2] = 23;
        idades[3] = 51;

        for (int i = 0; i < idades.length; i++) {
            if(idades[i] == 23);{
                System.out.println("Idade encontrada " + idades[i] + " Na posição " +i );
            }
            i++;

        }
    }
}

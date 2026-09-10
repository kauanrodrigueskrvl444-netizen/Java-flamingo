package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class ArraysPart02 {
    public static void main(String[] args){
        int i = 0;
        String[] nomes = new String[4];

        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Naruto";
        nomes[3] = "Ichigo";


        nomes = new String[5];
        nomes[4] = "Zoro";


        while (i < nomes.length){
            System.out.println(nomes[i]);
            i++;
        }
    }
}

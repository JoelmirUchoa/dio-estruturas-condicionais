public class ResultadoEscolar {
    public static void main(String[] args) {
        // Condição ternária
        /*Podemos abreviar nosso algorítmico condicional refatorando com o conceito de operador ternário.*/ 

        //ternária simples
        /*int nota = 5 ;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);*/

        //ternária Composta
        int nota = 4 ;
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado); 

        /*int nota = 5 ;
        if (nota >= 7) {
            System.out.println("Aprovado");
        }else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }*/
    }
}

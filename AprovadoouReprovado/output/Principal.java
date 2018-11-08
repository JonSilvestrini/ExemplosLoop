public class Principal{
    public static void main(String args[]){

        System.out.println("Digite a primeira nota: ");
        double nota1 = Loop.ReadDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = Loop.ReadDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = Loop.ReadDouble();

        CalculoMedia media = new CalculoMedia();

        media.calcular(nota1,nota2,nota3);

        System.out.println("Sua nota é: " + media.pegarMedia());
        
        System.out.println(media.resultado());
    }
}

public class CalculoMedia{
    private double nota1, nota2, nota3, media;

      public double pegarMedia(){
        return this.media;
    }

      public void calcular(double n1, double n2, double n3){
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;

        this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
    }

      public String resultado() {
        if  (media >= 7) {
            return "Aprovado!";
        } else {
            return "Reprovado!";
        }
    }
}

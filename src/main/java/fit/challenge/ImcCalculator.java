package fit.challenge;

public class ImcCalculator {
  public static String calculate(double peso, double altura){
    double dResultado = peso / (altura * altura) ;

    if ( dResultado <= 18.499 )
      return "Magreza";
    else if ( dResultado <= 24.999 )
      return "Normal";
    else if ( dResultado <= 29.999 )
      return "Sobrepeso";

    return "Obesidade";
  }
}
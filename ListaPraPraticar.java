// método do ex01
  public static void olaMundo () {
    System.out.println ("Ola mundo!");
  }
  // método do ex02
  public static void recebeNumero () {
    int numero = 10;
    System.out.println ("O número informado foi " + numero);
  }
  // método do ex03
  public static void imprimeSoma () {
    int numero1 = 10;
    int numero2 = 20;
    int soma = numero1 + numero2;
    System.out.println ("A soma dos números é " + soma);
  }
  // método do ex04
  public static void calculaMedia () {
    int nota1 = 10;
    int nota2 = 20;
    int nota3 = 30;
    int nota4 = 40;
    int media = (nota1 + nota2 + nota3 + nota4) / 4;
    System.out.println ("A média das notas é " + media);
  }
  // método do ex05
  public static void converteMetrosParaCentimetros () {
    double metros = 10;
    double centimetros = metros * 100;
    System.out.println (metros + " metros equivalem a " + centimetros + " centímetros");
  }
  // método do ex06
  public static void calculaSalario () {
    double salarioHora = 10;
    int horasTrabalhadas = 160;
    double salarioMes = salarioHora * horasTrabalhadas;
    System.out.printf ("O salário do mês é %.2f " , salarioMes);
  }
  // método do ex07
  public static void converteFarenheitParaCelsius () {
    double farenheit = 10;
    double celsius = (5 * (farenheit - 32)) / 9;
    System.out.printf ("A temperatura de %.2f graus Farenheit equivale a %.2f graus Celsius" , farenheit , celsius);
  }
  // método do ex08
  public static void recebeTresNumeros () {
    int numero1 = 10;
    int numero2 = 20;
    double numero3 = 30.5;
    double produto = numero1 * 2 + numero2 / 2;
    double soma = numero1 * 3 + numero3;
    double cubo = (numero3*numero3*numero3);
    //double cubo = Math.pow(numero3, 3);
    System.out.println ("O produto do dobro do primeiro com metade do segundo é " + produto);
    System.out.println ("A soma do triplo do primeiro com o terceiro é " + soma);
    System.out.println ("O terceiro elevado ao cubo é " + cubo);
  }
  // método do ex09
  public static void calculaPesoIdeal () {
    double altura = 1.80;
    double pesoIdealHomem = (72.7 * altura) - 58;
    double pesoIdealMulher = (62.1 * altura) - 44.7;
    System.out.println("O peso ideal para um homem com altura " + altura + "m é " + pesoIdealHomem + "kg");
    System.out.println("O peso ideal para uma mulher com altura " + altura + "m é " + pesoIdealMulher + "kg");    
  }
  // método do ex10
  public static void calculaSalarioLiquido () {
    double salarioHora = 10;
    int horasTrabalhadas = 160;
    double salarioBruto = salarioHora * horasTrabalhadas;
    double inss = salarioBruto * 0.08;
    double sindicato = salarioBruto * 0.05;
    double salarioLiquido = salarioBruto - inss - sindicato;
    System.out.printf ("O salário bruto é %.2f " , salarioBruto);
    System.out.printf ("\nO valor pago ao INSS é %.2f " , inss);
    System.out.printf ("\nO valor pago ao sindicato é %.2f " , sindicato);
    System.out.printf ("\nO salário líquido é %.2f " , salarioLiquido);
  }
}

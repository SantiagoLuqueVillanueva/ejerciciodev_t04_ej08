public class App {
    public static void main(String[] args) throws Exception {
        try {
            double nota1  = Double.parseDouble(System.console().readLine("Introduzca la primera nota: "));
            double nota2  = Double.parseDouble(System.console().readLine("Introduzca la segunda nota: "));
            double nota3  = Double.parseDouble(System.console().readLine("Introduzca la tercera nota: "));
            double media = (nota1+nota2+nota3)/3;
            System.out.printf("La su nota media es de: %.2f%n", media);
            if (media >= 0 && media < 5){
                System.out.println("SUSPENSO");
            } else if (media == 5) {
                System.out.println("SUFICIENTE");
            } else if (media > 5 && media <= 6) {
                System.out.println("BIEN");
            } else if (media > 6 && media <= 8) {
                System.out.println("NOTABLE");
            } else if (media > 8 && media <= 10) {
                System.out.println("SOBRESALIENTE");
            } else {
                System.out.println("Introduzca una nota del [0-10].");
                return;
            }
        } catch (NumberFormatException e) {
            System.err.println("Introduzca una nota porfavor.");
            System.err.println(e);
        } catch (Exception e) {
            System.err.println("Un error inesperado ha ocurrido.");
            System.err.println(e);
        }
    }
}

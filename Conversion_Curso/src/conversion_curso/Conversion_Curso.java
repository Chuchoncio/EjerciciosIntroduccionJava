
package conversion_curso;

public class Conversion_Curso {

    public static void main(String[] args) {
        
        int horasTotales, horasPorSemana, semanasPorMes;
        
        double cantidadSemanas, cantidadMeses, cantidadDias;
        
        horasTotales = 500;
        horasPorSemana = 12;
        semanasPorMes = 4;
        
        cantidadSemanas = (double) horasTotales / horasPorSemana;
        cantidadMeses =  (double) Math.round(cantidadSemanas) / semanasPorMes;
        
        cantidadDias = (int) ((cantidadSemanas % 1) * 10);
        cantidadDias += (int) ((cantidadMeses % 1)*10);
        
        System.out.println("Cantidad de meses: " + (int)Math.floor(cantidadMeses));
        System.out.println("Cantidad de dias: " + (int)Math.floor(cantidadDias));
        
    }

}

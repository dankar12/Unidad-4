
public class prac2u4 {
	
	

    public static void main(String[] args) {
        double[][] calificaciones = {
                {90.5, 85.0, 78.5, 92.0},
                {88.0, 76.5, 89.0, 94.5},
                {70.0, 82.5, 91.0, 87.5}
        };

        double[] promedioEstudiantes = calcularPromedioEstudiantes(calificaciones);
        double[] promedioMaterias = calcularPromedioMaterias(calificaciones);

        System.out.println("Promedio de calificacion por estudiante:");
        for (int i = 0; i < promedioEstudiantes.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + promedioEstudiantes[i]);
        }

        System.out.println("\nPromedio de calificaciones por materia:");
        for (int j = 0; j < promedioMaterias.length; j++) {
            System.out.println("Materia " + (j + 1) + ": " + promedioMaterias[j]);
        }
    }

    public static double[] calcularPromedioEstudiantes(double[][] calificaciones) {
        int numEstudiantes = calificaciones.length;
        int numMaterias = calificaciones[0].length;
        double[] promedioEstudiantes = new double[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {
            double sumaCalificaciones = 0;
            for (int j = 0; j < numMaterias; j++) {
                sumaCalificaciones += calificaciones[i][j];
            }
            promedioEstudiantes[i] = sumaCalificaciones / numMaterias;
        }

        return promedioEstudiantes;
    }

    public static double[] calcularPromedioMaterias(double[][] calificaciones) {
        int numEstudiantes = calificaciones.length;
        int numMaterias = calificaciones[0].length;
        double[] promedioMaterias = new double[numMaterias];

        for (int j = 0; j < numMaterias; j++) {
            double sumaCalificaciones = 0;
            for (int i = 0; i < numEstudiantes; i++) {
                sumaCalificaciones += calificaciones[i][j];
            }
            promedioMaterias[j] = sumaCalificaciones / numEstudiantes;
        }

        return promedioMaterias;
    }

}




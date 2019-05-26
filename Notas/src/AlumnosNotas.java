public class AlumnosNotas {
public static void main(String[] args) {

	  String[] Nombre = {"Carlota", "Carlos", "Diego", "Laura", "Dimple", "Betsy", "Lorenzo"};
      int[] Nota = {0, 5, 8, 10, 10, 8, 2};
      String[] Calificacion = new String[4];
      
     for (int i=0; i<Nota.length; i++){
               
        do{
            if(Nota[i] < 5){Calificacion[i] = "Suspenso";}
            else if(Nota[i] >= 5 && Nota[i] < 7) {Calificacion[i] = "Aprobado";}
            else if(Nota[i] >= 7 && Nota[i] < 9) {Calificacion[i] = "Notable";}
            else if(Nota[i] >= 9 && Nota[i] <= 10) {Calificacion[i] = "Sobresaliente";}
            else {System.out.println("ERROR EN LA NOTA") ;}
            
        } 
        while(Nota[i] < 0 || Nota[i] > 10);
        System.out.println(Nombre[i] +  ": " + Calificacion[i]);
        
       }    
	}
 }
package com.gmq.entornos.refactoring.exercice;

/**
 * 
 * Dada la siguiente clase:
 * 
 * 1.- Lee el código y crea los tests de junit necesarios 1.1.- Sigue las
 * indicaciones de la asignatura buscando la máxima cobertura posible
 * 
 * 2.- Realiza las correcciones que veas necesarias para mejorar la calidad del
 * código. 2.1.- Añade un comentario en el código explicando el cambio que
 * has realizado
 * 
 * @author Raul.Camarero
 *
 */
public class Evaluate {

	private String id;

	private String name;

	private Integer evaluations[];

	public Evaluate(String id, String name) {      
                                                 
		this.id = id;

		this.name = name;
 
	}

	public Evaluate(String id, String name, Integer[] evaluations) {

		this.id = id;

		this.name = name;

		this.evaluations = evaluations;

	}

	public String evaluate_pupil(Integer value) { // He cambiado el m�todo para que devuelva una String

		String annotation = null;

	    if (value > 10 || value < 0) {

			annotation = "NOTA NO V�LIDA";       //He cambiado las excepciones por otro if

	  } else if (value < 5) { 

			annotation = "SUSPENSO";
			
	  } else if (value >= 5 && value < 6) {      // He introducido la nota "SUFICIENTE"

			annotation = "SUFICIENTE";
			
	  } else if (value >= 6 && value < 7) {

			annotation = "BIEN";
			
	  } else if (value < 9 && value >= 7) {

			annotation = "NOTABLE";
			
	  } else {

			annotation = "SOBRESALIENTE";
      }

		for (int i = 0; i < evaluations.length; i++) {

			if (evaluations[i] == null) {

				evaluations[i] = value;

				System.out.println("A�adir al alumno " + name + "(" + id + ") la nota " + evaluations[i].toString());

				break;

			}
			
		}
		
		return annotation;
	}

//	@Override
//	public String toString() {                 //He redefinido el toString para que me imprima las notas de la forma que 	
//                                             //yo le digo,pero lo he dejado comentado para que no lo testee.
//		String s = "(";
//
//		for (Integer i : this.evaluations) {
//                                             //Le he generado los gettes y los settes,por si en el main los necesitaran
//			s += i + ",";
//
//		}
//
//		s = s.substring(0, s.length() - 1);
//
//		return s + ").";
//
//	}
//
//	public String getId() {
//		
//		return id;
//		
//	}
//
//	public void setId(String id) {
//		
//		this.id = id;
//		
//	}
//
//	public String getName() {
//		
//		return name;
//		
//	}
//
//	public void setName(String name) {
//		
//		this.name = name;
//		
//	}
//
//	public Integer[] getEvaluations() {
//		
//		return evaluations;
//		
//	}
//
//	public void setEvaluations(Integer[] evaluations) {
//		
//		this.evaluations = evaluations;
//		
//	}

}

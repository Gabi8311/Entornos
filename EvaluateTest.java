package com.gmq.entornos.refactoring.exercice;

import static org.junit.Assert.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EvaluateTest {

	Evaluate evaluate;
	
	Evaluate evaluat;

	@BeforeEach
	void setUp() throws Exception {
		
		Integer [] notas = new Integer[5];
		
		evaluate = new Evaluate("1234","Gabi",notas);
		
		evaluat = new Evaluate("1234","Gabi");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		evaluate = null;
		
	}
	
	 @ParameterizedTest
	    @MethodSource("starting")
	    void should_start(int value,String resultado) {
		 
		 	assertEquals(resultado,evaluate.evaluate_pupil(value));
 
	 }
	 
	static Stream<Arguments> starting(){
		
	return Stream.of(
			
			Arguments.of(0,"SUSPENSO"), 
			Arguments.of(1,"SUSPENSO"),
			Arguments.of(2,"SUSPENSO"),
			Arguments.of(3,"SUSPENSO"),
			Arguments.of(4,"SUSPENSO"),
			Arguments.of(5,"SUFICIENTE"),
			Arguments.of(6,"BIEN"),
			Arguments.of(7,"NOTABLE"),
			Arguments.of(8,"NOTABLE"),
			Arguments.of(9,"SOBRESALIENTE"),
			Arguments.of(10,"SOBRESALIENTE"),
			Arguments.of(-10,"NOTA NO VÁLIDA"),
			Arguments.of(12,"NOTA NO VÁLIDA")
			
			);
		
	}

}

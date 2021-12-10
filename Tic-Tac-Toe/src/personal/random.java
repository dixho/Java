package personal;
import java.lang.Math;

public class random {

	public static int random(int limiteInferior, int limiteSuperior) {
		int random;
		random=(int)Math.floor(Math.random()*(limiteSuperior - limiteInferior +1)+limiteInferior);
		return random;
	 	}
}
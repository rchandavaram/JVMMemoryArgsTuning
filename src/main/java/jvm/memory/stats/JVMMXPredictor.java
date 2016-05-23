package jvm.memory.stats;

import jvm.memory.projections.Algorithm;
import jvm.memory.projections.Prediction;

public class JVMMXPredictor {
	Algorithm algo;
	public JVMMXPredictor(Algorithm algo) {
		this.algo = algo;
	}
	public void getPredictor(){
		Prediction p = algo.run();
		System.out.println(p);
	}
}

/**
 * 
 */
package jvm.memory.projections;

/**
 * @author rchandavaram
 * represents interface for supervised learning algorithm based on previous stats.
 * result of running this algorithm will be to find out standard deviation.
 */
public interface Algorithm {
	/**
	 * implementation of algorithm.
	 * Run data set them improve.
	 */
	public Prediction run();
}

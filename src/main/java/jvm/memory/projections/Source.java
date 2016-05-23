package jvm.memory.projections;

/**
 * @author rchandavaram
 * Can be different sources for training.
 * As of now we support either text file will know extension or jprof file.
 */
public interface Source {
	public Data getData(); 
}

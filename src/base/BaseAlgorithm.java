package base;

import interfaces.Ialgorithm;

public abstract class BaseAlgorithm implements Ialgorithm {
    protected String name;
    protected String minimalComplexity;
    protected String averageComplexity;
    protected String maximalCompleity;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMinimalComplexity() {
        return minimalComplexity;
    }

    @Override
    public String getAverageComplexity() {
        return averageComplexity;
    }

    @Override
    public String getMaximalComplexity() {
        return maximalCompleity;
    }
}

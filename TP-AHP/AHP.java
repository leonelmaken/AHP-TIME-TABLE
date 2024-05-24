public class AHP {
    private double[][] pairwiseMatrix;
    private double[] criteriaWeights;

    public AHP(double[][] pairwiseMatrix) {
        this.pairwiseMatrix = pairwiseMatrix;
        this.criteriaWeights = calculateWeights();
    }

    private double[] calculateWeights() {
        int size = pairwiseMatrix.length;
        double[] sums = new double[size];
        double[] weights = new double[size];

        // Sum of each column
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sums[i] += pairwiseMatrix[j][i];
            }
        }

        // Normalize and calculate weights
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pairwiseMatrix[j][i] /= sums[i];
            }
        }

        // Average of each row
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                weights[i] += pairwiseMatrix[i][j];
            }
            weights[i] /= size;
        }

        return weights;
    }

    public double[] getCriteriaWeights() {
        return criteriaWeights;
    }
}

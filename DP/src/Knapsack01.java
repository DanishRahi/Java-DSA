
public class Knapsack01 {

	public static int Knapsack(int[] weights, int values[], int MaxWeight) {

		return Knapsack(weights, values, MaxWeight, 0);
	}

	private static int Knapsack(int[] weights, int[] values, int maxWeight, int i) {

		if (i == weights.length || maxWeight == 0) {
			return 0;
		}

		if (weights[i] > maxWeight) {
			return Knapsack(weights, values, maxWeight, i + 1);
		} else {
			// INCLUDE ith item in this
			int op1 = values[i] + Knapsack(weights, values, maxWeight - weights[i], i + 1);
			// Don't include
			int op2 = values[i] + Knapsack(weights, values, maxWeight, i + 1);
			return Math.max(op1, op2);
		}
	}

	public static void main(String[] args) {

		int weights[] = { 8, 4, 5, 6, 7, 8 };
		int vallues[] = { 2, 3, 5, 6, 9, 5 };
		int maxWeight = 10;
		System.out.println(Knapsack(weights, vallues, maxWeight));
	}

}


// OVERLAPPING PROBLEM IN KNAPSACK01

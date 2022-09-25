package methods;

public class GaussElimination {

    public static void printMatrix(double a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }

    // Reduce matrix to upper triangular
    public static int PerformOperation(double a[][], int n) {
        int i, j, k = 0, c, flag = 0, m = 0;
        double pro = 0;

        for (i = 0; i < n; i++) {
            if (a[i][i] == 0) {
                c = 1;
                while ((i + c) < n && a[i + c][i] == 0)
                    c++;
                if ((i + c) == n) {
                    flag = 1;
                    break;
                }
                for (j = i, k = 0; k <= n; k++) {
                    double temp = a[j][k];
                    a[j][k] = a[j + c][k];
                    a[j + c][k] = temp;
                }
            }

            for (j = 0; j < n; j++) {

                if (i != j) {
                    double p = a[j][i] / a[i][i];

                    for (k = 0; k <= n; k++)
                        a[j][k] = a[j][k] - (a[i][k]) * p;
                }
            }
        }
        return flag;
    }

    public static void PrintResult(double a[][], int n, int flag) {
        if (flag == 2)
            System.out.println("There are infinite solutions");
        else if (flag == 3)
            System.out.println("There's no solution, please try again with different values");
        else {
            for (int i = 0; i < n; i++)
                System.out.print(a[i][n] / a[i][i] + " ");
        }
    }

    public static int CheckConsistency(double a[][], int n, int flag) {
        int i, j;
        double sum;

        flag = 3;
        for (i = 0; i < n; i++) {
            sum = 0;
            for (j = 0; j < n; j++)
                sum = sum + a[i][j];
            if (sum == a[i][j])
                flag = 2;
        }
        return flag;
    }
}

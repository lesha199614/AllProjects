package ProjectCalculator;

public class OpertionsHistory {
    private double[] array = new double[]{0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d};

    private void updateHistoryPrivate(double newValue) {
        for (int i = array.length-1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = newValue;
    }
    protected void updateHistory(double newValue){
        updateHistoryPrivate(newValue);
    }

    protected void showHistory() {
        System.out.println("==============================");
        System.out.println("История результатов:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.println();
        System.out.println("==============================");
    }
}

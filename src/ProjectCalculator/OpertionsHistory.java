package ProjectCalculator;

public class OpertionsHistory implements History{
    private double[] array = new double[10];

    @Override
    public void showHistory() {
        showHistoryPrivate();
    }
    @Override
    public void addValue(double newValue){
        addValuePrivate(newValue);
    }

    private void addValuePrivate (double newValue) {
        for (int i = array.length-1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = newValue;
    }

    private void showHistoryPrivate() {
        System.out.println("==============================");
        System.out.println("История результатов:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.println();
        System.out.println("==============================");
    }
}

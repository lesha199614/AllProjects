package ProjectCalculator;

import java.util.ArrayList;
import java.util.List;

public class HistoryArrayList implements History {

    List<Double> HistoryList = new ArrayList<>(10);

    @Override
    public void showHistory() {
        System.out.println(HistoryList.toString());
    }

    public void addValue(double newValue){
        addValuePrivate(newValue);
    }

    private void addValuePrivate(double newValue) {
        if (HistoryList.size() > 9) {
            HistoryList.remove(9);
        }
        HistoryList.add(0,newValue);
    }
}

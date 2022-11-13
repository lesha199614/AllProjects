package ProjectCalculator;

import java.util.ArrayList;
import java.util.List;

public class HistoryArrayList implements History {

    List<Double> historyList = new ArrayList<>();

    @Override
    public void showHistory() {
        System.out.println(historyList.toString());
    }

    public void addValue(double newValue){
        addValuePrivate(newValue);
    }

    private void addValuePrivate(double newValue) {
        historyList.add(0,newValue);
    }
}

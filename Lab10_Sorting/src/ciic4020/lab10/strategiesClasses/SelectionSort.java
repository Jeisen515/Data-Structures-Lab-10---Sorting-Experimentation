package ciic4020.lab10.strategiesClasses;

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort<E> extends AbstractSortingStrategy<E> {

	public SelectionSort(Comparator<E> cmp) { 
		super("SelectionSort", cmp); 
	}
	
	@Override
	public void sortList(ArrayList<E> dataSet) {
		int n = dataSet.size(); 
		
		for(int i = 0; i < n - 1; i++) {
			int minIndex = i;
			
			for(int j = i+1; j < n; j++) {
				if(cmp.compare(dataSet.get(j), dataSet.get(minIndex)) < 0){
					minIndex = j;
				}
			}
			E temp = dataSet.get(minIndex);
			dataSet.set(minIndex, dataSet.get(i));
			dataSet.set(i, temp);
		}

	}
}
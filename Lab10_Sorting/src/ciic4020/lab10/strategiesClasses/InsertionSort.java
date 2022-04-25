package ciic4020.lab10.strategiesClasses;

import java.util.ArrayList;
import java.util.Comparator;

public class InsertionSort<E> extends AbstractSortingStrategy<E> {

	public InsertionSort(Comparator<E> cmp) { 
		super("InsertionSort", cmp); 
	}
	
	@Override
	public void sortList(ArrayList<E> dataSet) {
		int n = dataSet.size(); 

		for( int i = 0; i < n; i++) {
			E tempVariable = dataSet.get(i);
			int j = i-1;
			while(j >= 0 && cmp.compare(dataSet.get(j), tempVariable) > 0) {
				dataSet.set(j+1 , dataSet.get(j));
				j--;
			}
			dataSet.set(j+1, tempVariable);
		}
	}

}
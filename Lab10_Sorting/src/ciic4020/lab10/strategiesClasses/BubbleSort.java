package ciic4020.lab10.strategiesClasses;

import java.util.ArrayList;
import java.util.Comparator;

public class BubbleSort<E> extends AbstractSortingStrategy<E> {

	public BubbleSort(Comparator<E> cmp) { 
		super("BubbleSort", cmp); 
	}
	
	@Override
	public void sortList(ArrayList<E> dataSet) {
		int n = dataSet.size(); 
		E tempVariable;

		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(cmp.compare(dataSet.get(j), dataSet.get(j+1)) > 0) {
					tempVariable = dataSet.get(j);
					dataSet.set(j, dataSet.get(j+1));
					dataSet.set(j+1 , tempVariable);	
				}
			}
		}		
		
	}

}
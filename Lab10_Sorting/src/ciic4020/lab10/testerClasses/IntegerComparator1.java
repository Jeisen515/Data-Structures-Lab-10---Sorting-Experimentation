package ciic4020.lab10.testerClasses;

import java.util.Comparator;

public class IntegerComparator1 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}

}

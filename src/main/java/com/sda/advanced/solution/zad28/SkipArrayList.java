package com.sda.advanced.solution.zad28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList extends ArrayList {

	public List getEveryNthElement(int startIndex, int skip) {

		List newCharList = new ArrayList();

		for (int i = 0; startIndex + skip * i < size(); i++) {
			newCharList.add(get(startIndex + skip * i));
		}

		return newCharList;
	}
}

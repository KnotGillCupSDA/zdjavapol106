package com.sda.advanced.solution.zad28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList<E> extends ArrayList<E> {

	public List<E> getEveryNthElement(int startIndex, int skip) {

		List<E> newCharList = new ArrayList<E>();

		for (int i = startIndex; i < size(); i += skip + 1) {
			newCharList.add(get(i));
		}

		return newCharList;
	}
}

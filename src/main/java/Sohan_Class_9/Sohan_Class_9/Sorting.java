package Sohan_Class_9.Sohan_Class_9;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
	
	public boolean Sort_By_Name(List<Developer> list) {

		Collections.sort(list, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}

		});

		int cnt = 0;
		Developer d;
		for (Developer dev : list) {
			cnt++;
			if(cnt==list.size()) break;
			String a = dev.getName();
			d = list.get(cnt);
			String b = d.getName();
			int result = a.compareTo(b);
			if (result > 0)
				return false;
		}

		return true;
	}

	public boolean Sort_By_age(List<Developer> list) {

		Collections.sort(list, new Comparator<Developer>() {

			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		int cnt = 0;
		Developer d;
		for (Developer dev : list) {
			cnt++;
			if(cnt==list.size()) break;
			int a = dev.getAge();
			d = list.get(cnt);
			int b = d.getAge();
			if (a > b)
				return false;
		}

		return true;
	}

	public boolean Sort_By_Salary(List<Developer> list) {

		Collections.sort(list, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSalry().compareTo(o2.getSalry());
			}
		});

		int cnt = 0;
		Developer d;
		for (Developer dev : list) {
			cnt++;
			if(cnt==list.size()) break;
			int a = dev.getAge();
			d = list.get(cnt);
			int b = d.getAge();
			if (a > b)
				return false;
		}

		return true;
	}

	public boolean Sort_By_lombok(List<Developer> list) {

		list.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
		// java 8 only, lambda also, to print the List

		int cnt = 0;
		Developer d;
		for (Developer dev : list) {
			cnt++;
			if(cnt==list.size()) break;
			String a = dev.getName();
			d = list.get(cnt);
			String b = d.getName();
			int result = a.compareTo(b);
			if (result > 0)
				return false;
		}

		return true;

	}

//System.out.println("After Sort by salary:");
//for (Developer developer : listDevs) {
//	System.out.println(developer);
//}

	List<Developer> listDevs = getDevelopers();

	public static List<Developer> getDevelopers() {

		List<Developer> result = Arrays.asList(new Developer("mkyong", new BigDecimal("70000"), 33),
				new Developer("alvin", new BigDecimal("80000"), 20),
				new Developer("jason", new BigDecimal("100000"), 10),
				new Developer("iris", new BigDecimal("170000"), 55));

		return result;
	}

}

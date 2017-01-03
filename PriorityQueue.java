import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		PriorityQueue<Person> pq = new PriorityQueue<Person>(new PersonSort());
		pq.add(new Person("김재진", 3, 1));
		pq.add(new Person("이정현", 3, 2));
		pq.add(new Person("해비", 3, 3));
		int len = pq.size();
		for(int i=0; i<len; i++) {
			Person p = pq.poll();
			System.out.println(p.name + p.age+ " " + p.seq);
		}
	}
}

class Person {
	String name;
	int age, seq;
	public Person(String name, int age, int seq) {
		this.name = name;
		this.age = age;
		this.seq = seq;
	}
}

class PersonSort implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.age > o2.age) {
			return -1;
		} else if(o1.age == o2.age) {
			if(o1.seq > o2.seq) {
				return -1;
			} else {
			return 0;
			}
		} else {
			return 1;
		}
	}
}
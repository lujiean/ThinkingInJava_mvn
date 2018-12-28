package com.thinkinginjava.holdingyourobj;

/*
 * Holding Your Objects
 */
import static com.thinkinginjava.tools.Tools.*;
import net.mindview.util.*;

import java.lang.reflect.Array;
import java.util.*;
public class Homework {

	public static void main(String[] args) {
		/*
		 * Exercise 1: (2) Create a new class called Gerbil with an int gerbilNumber that��s initialized in the constructor. 
		 * Give it a method called hop( ) that displays which gerbil number this is, and that it��s hopping. 
		 * Create an ArrayList and add Gerbil objects to the List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil.
		 */
		PrintExercise(1);
		ArrayList<Gerbil> listOfGerbil = new ArrayList<Gerbil>();
		listOfGerbil.add(new Gerbil(9));
		listOfGerbil.add(new Gerbil(78));
		for(Gerbil e : listOfGerbil)
			e.hop();
		for(int i = 0; i<listOfGerbil.size(); i++)
			listOfGerbil.get(i).hop();
		
		/*
		 * Exercise 2: (1) Modify SimpleCollection.java to use a Set for c.
		 */
		PrintExercise(2);
		SimpleCollection.main(null);
		
		/*
		 * Exercise 3: (2) Modify innerclasses/Sequence.java so that you can add any number of elements to it.
		 */
		PrintExercise(3);
		
		/*
		 * Exercise 4: (3) Create a generator class that produces character names (as String objects) from your favorite movie 
		 * (you can use Snow White or Star Wars as a fallback) each time you call next( ), 
		 * and loops around to the beginning of the character list when it runs out of names. 
		 * Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a TreeSet, then print each container.
		 */
		PrintExercise(4);
		Generator.main(null);
		
		/*
		 * Exercise 5: (3) Modify ListFeatures.java so that it uses Integers (remember autoboxing!) instead of Pets, and explain any difference in results.
		 */
		PrintExercise(5);
		ListFeatures.main(null);
		
		/*
		 * Exercise 6: (2) Modify ListFeatures.java so that it uses Strings instead of Pets, and explain any difference in results.
		 */
		PrintExercise(6);
		ListFeatures2.main(null);
		
		/*
		 * Exercise 7: (3) Create a class, then make an initialized array of objects of your class. 
		 * Fill a List from your array. Create a subset of your List by using subList( ), then remove this subset from your List.
		 */
		PrintExercise(7);
		Ex7[] ex7Arr = new Ex7[3];
		ex7Arr[0] = new Ex7(8);
		ex7Arr[1] = new Ex7(79);
		ex7Arr[2] = new Ex7(211);
		List<Ex7> lstEx7 = Arrays.asList(ex7Arr[0], ex7Arr[1], ex7Arr[2]);
		print(lstEx7.toString());
		
		List<Ex7> lstEx7Sub = lstEx7.subList(0, 2);
		print(lstEx7Sub.toString());
		List<Ex7> copy = new ArrayList<Ex7>(lstEx7);
		copy.removeAll(lstEx7Sub);
		print(copy.toString());
		print(lstEx7.toString()); 
		
//		List<Ex7> copy = new ArrayList<Ex7>(lstEx7);
//		List<Ex7> lstEx7Sub = copy.subList(0, 2);
//		print(lstEx7Sub.toString());
//		lstEx7.removeAll(lstEx7Sub);
//		print(lstEx7.toString());
		
		/*
		 * Exercise 8: (1) Modify Exercise l so it uses an Iterator to move through the List while calling hop( ).
		 */
		PrintExercise(8);
		ArrayList<Gerbil> listOfGerbil2 = new ArrayList<Gerbil>();
		listOfGerbil2.add(new Gerbil(9));
		listOfGerbil2.add(new Gerbil(78));
		
		Iterator<Gerbil> it = listOfGerbil2.iterator();
		while(it.hasNext()) {
			Gerbil gerbil = it.next();
			gerbil.hop();
		}
//		for(Gerbil e : listOfGerbil)
//			e.hop();
//		for(int i = 0; i<listOfGerbil.size(); i++)
//			listOfGerbil.get(i).hop();
		
		/*
		 * Exercise 9: (4) Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector.
		 */
		PrintExercise(9);
		Sequence.main(null);
		
		/*
		 * Exercise 10: (2) Change Exercise 9 in the Polymorphism chapter to use an ArrayList to hold 
		 * the Rodents and an Iterator to move through the sequence of Rodents.
		 */
		PrintExercise(10);

		/*
		// * Exercise 11: (2) Write a method that uses an Iterator to step through a Collection and print the toString( ) of each object in the container. 
		// Fill all the different types of Collections with objects and apply your method to each container.
		*/
		PrintExercise(11);
		
		/* 
		Exercise 12: (3) Create and populate a List<Integer>. 
		Create a second List<Integer> of the same size as the first, 
		and use ListIterators to read elements from the first List and insert them into the second in reverse order. 
		(You may want to explore a number of different ways to solve this problem.)
		 */
		PrintExercise(12);
		List<Integer> lst_Int_ex12_1st = new ArrayList<Integer>();
		lst_Int_ex12_1st.add(5);
		lst_Int_ex12_1st.add(7);
		lst_Int_ex12_1st.add(-9);
		lst_Int_ex12_1st.add(5);
		lst_Int_ex12_1st.add(1);
		lst_Int_ex12_1st.add(-1);
		List<Integer> lst_Int_ex12_2nd = new ArrayList<Integer>();
		ListIterator<Integer> lI_Int_ex12 = lst_Int_ex12_1st.listIterator();

		int len = lst_Int_ex12_1st.size();
		int max = 0, cur_integer;
		for (int i = 0; i < len; i++) {
			boolean f_b_first_int = true;
			while (lI_Int_ex12.hasNext()) {
				cur_integer = lI_Int_ex12.next();
				if (f_b_first_int) {
					max = cur_integer;
					f_b_first_int = false;
				}
				if(cur_integer > max){
					max = cur_integer;
				}
			}
			lst_Int_ex12_2nd.add(max);

			// rollback and remove max
			boolean f_b_remove = false;
			while (lI_Int_ex12.hasPrevious()) {
				cur_integer = lI_Int_ex12.previous();
				if ( ! f_b_remove) {
					if(cur_integer == max){
						lI_Int_ex12.remove();
						f_b_remove = true;
					}
				}
			}
		}
		System.out.println(lst_Int_ex12_2nd.toString());

		/* 
		Exercise 13: (3) In the innerclasses/GreenhouseController.java example, the class Controller uses an ArrayList. 
		Change the code to use a LinkedList instead, and use an Iterator to cycle through the set of events.
		*/

		/* 
		Exercise 14: (3) Create an empty LinkedList<Integer>. 
		Using a Listlterator, add Integers to the List by always inserting them in the middle of the List.
		*/
		PrintExercise(14);
		LinkedList<Integer> ll_ex14 = new LinkedList<Integer>();
		List<Integer> lst_ex14 = new ArrayList<Integer>();
		lst_ex14.add(1);
		lst_ex14.add(2);
		lst_ex14.add(3);
		lst_ex14.add(4);
		lst_ex14.add(5);
		ListIterator<Integer> li_ex14 = lst_ex14.listIterator();

		int ex14_cur_int;
		while (li_ex14.hasNext()) {
			ex14_cur_int = li_ex14.next();

			ll_ex14.addLast(ex14_cur_int);
			if (ll_ex14.size() <= 2) {
				// item count not > 3 no need put middle
			} else {
				// item add last and move to middle of LinkedList
				for (int i = ll_ex14.size() - 1; i >= ll_ex14.size()/2; i--) {
					if (i == ll_ex14.size()/2) {
						ll_ex14.set(i, ex14_cur_int);
					} else {
						ll_ex14.set(i, ll_ex14.get(i-1));
					}
				} 
			}
		}
		System.out.println(ll_ex14.toString());

		/* Exercise 15: (4) Stacks are often used to evaluate expressions in programming languages.
		Using net.mindview.util.Stack, evaluate the following expression, 
		where’+’ means "push the following letter onto the stack," and’-’ 
		means "pop the top of the stack and print it":
		"+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"
		*/
		PrintExercise(15);
		Stack<String> stack_ex15 = new Stack<String>();
		String str_ex15 = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—";
		int i = 0;
		String f_str;
		while (i < str_ex15.length()) {
			f_str = str_ex15.substring(i, i+1);
			if (f_str.equals("+")) {
				i++;
				f_str = str_ex15.substring(i, i+1);
				stack_ex15.push(f_str);
			} else if (f_str.equals("-")) {
				print(stack_ex15.pop());
			} else {
				print("Error");
			}
			i++;
		}
		print(stack_ex15.toString());

		/* 
		Exercise 16: (5) Create a Set of the vowels. 
		Working from UniqueWords.Java, count and display the number of vowels in each input word, 
		and also display the total number of vowels in the input file.
		*/
		PrintExercise(16);
		Set<String> set_ex16 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		set_ex16.add("a");
		set_ex16.add("e");
		set_ex16.add("i");
		set_ex16.add("o");
		set_ex16.add("u");

		String str_ex16 = "I am a foolish man!";
		String sub_str;
		int cnt = 0, tot_cnt = 0;
		for (String str : str_ex16.split(" ")) {
			cnt = 0;
			for (i = 0; i < str.length(); i++) {
				sub_str = str.substring(i, i+1);
				if (set_ex16.contains(sub_str)) {
					// is vol
					cnt++;
				}
			}
			System.out.printf("%d ", cnt);
			tot_cnt = tot_cnt + cnt;
		}
		System.out.println("total cnt = " + tot_cnt);
		// System.out.println(set_ex16);

		/* 
		Exercise 17: (2) Take the Gerbil class in Exercise 1 and put it into a Map instead,
		associating each Gerbil’s name (e.g. "Fuzzy" or "Spot") as a String (the key) for each
		Gerbil (the value) you put in the table. Get an Iterator for the keySet( ) and use it to move through the Map, 
		looking up the Gerbil for each key and printing out the key and telling the Gerbil to hop( ).
		*/
		PrintExercise(17);
		Map<String, Gerbil> map_ex17 = new HashMap<String, Gerbil>();
		map_ex17.put("Fuzzy", new Gerbil(9));
		map_ex17.put("Spot", new Gerbil(78));

		for (String key : map_ex17.keySet()) {
			Gerbil gb = map_ex17.get(key);
			System.out.printf("Key: %s ", key);
			gb.hop();
		}

		/* 
		Exercise 18: (3) Fill a HashMap with key-value pairs. 
		Print the results to show ordering by hash code. 
		Extract the pairs, sort by key, and place the result into a LinkedHashMap. 
		Show that the insertion order is maintained.
		*/
		PrintExercise(18);
		Map<Integer, String> map_ex18 = new HashMap<Integer, String>();
		Map<Integer, String> lmap_ex18 = new LinkedHashMap<Integer, String>();
		map_ex18.put(1, "hello");
		map_ex18.put(87, "what");
		map_ex18.put(9, "putty");

		for (Integer i_key : map_ex18.keySet()) {
			print(i_key + "=" + map_ex18.get(i_key));
		}

		//sort Key
		Integer[] sort_ex18 = map_ex18.keySet().toArray(new Integer[0]);
		int minIndex, temp;
		len = sort_ex18.length;
		for (i = 0; i < len - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < len; j++) {
				if(sort_ex18[j] < sort_ex18[minIndex]){
					minIndex = j;
				}
			}
			temp = sort_ex18[i];
			sort_ex18[i] = sort_ex18[minIndex];
			sort_ex18[minIndex] = temp;
		}

		// put into lhmap
		for (Integer i_key : sort_ex18) {
			lmap_ex18.put(i_key, map_ex18.get(i_key));
		}

		for (Integer i_key : lmap_ex18.keySet()) {
			print(i_key + "=" + lmap_ex18.get(i_key));
		}
		/* 
		Exercise 19: (2) Repeat the previous exercise with a HashSet and LinkedHashSet.
		*/

		/* 
		Exercise 20: (3) Modify Exercise 16 so that you keep a count of the occurrence of each vowel.
		*/

		/* 
		Exercise 21: (3) Using a Map<String,Integer>, follow the form of UniqueWords.java 
		to create a program that counts the occurrence of words in a file. 
		Sort the results using Collections.sort( ) with a second argument of String.CASE_INSENSITIVE_ORDER 
		(to produce an alphabetic sort), and display the result.
		*/
		PrintExercise(21);
		Map<String, Integer> map_ex21 = new TreeMap<String, Integer>();
		// Set<String> words = new TreeSet<String>(new TextFile("src\\main\\java\\com\\thinkinginjava\\holdingyourobj\\Generator.java", "\\W+"));
		ArrayList<String> arr_ex21 = new TextFile("src\\main\\java\\com\\thinkinginjava\\holdingyourobj\\testfile.txt", "\\W+");
		
		// System.out.println(words);
		Collections.sort(arr_ex21, String.CASE_INSENSITIVE_ORDER);
		System.out.println(arr_ex21);

		for (String str : arr_ex21) {
			if (map_ex21.containsKey(str)) {
				i = map_ex21.get(str);
				map_ex21.put(str, ++i);
			} else {
				map_ex21.put(str, 1);
			}
		}
		System.out.println(map_ex21);

		/* 
		Exercise 22: (5) Modify the previous exercise so that it uses a class containing a String and a count field to store each different word, 
		and a Set of these objects to maintain the list of words.
		*/
		PrintExercise(22);
		Set<Ex22Container> set_ex22 = new HashSet<Ex22Container>();
		// Set<String> words = new TreeSet<String>(new TextFile("src\\main\\java\\com\\thinkinginjava\\holdingyourobj\\Generator.java", "\\W+"));
		ArrayList<String> arr_ex22 = new TextFile("src\\main\\java\\com\\thinkinginjava\\holdingyourobj\\testfile.txt", "\\W+");
		
		// System.out.println(words);
		Collections.sort(arr_ex22, String.CASE_INSENSITIVE_ORDER);
		System.out.println(arr_ex22);

		for (String str : arr_ex22) {
			Ex22Container temp_ex22 = new Ex22Container(str);
			if (set_ex22.contains(temp_ex22)) {

				Ex22Container[] temp_ex22_arr = set_ex22.toArray(new Ex22Container[0]);
				for (i = 0; i < temp_ex22_arr.length; i++) {
					if (temp_ex22.equals(temp_ex22_arr[i])) {
						cur_integer = temp_ex22_arr[i].getCount();
						break;
					}
				}
				set_ex22.remove(o)
				
			} else {
				set_ex22.add(temp_ex22);
			}
		}
		System.out.println(set_ex22);
		
		/* 
		Exercise 23: (4) Starting with Statistics.java, create a program that runs the test repeatedly and looks to see if any one number tends to appear more than the others in the results.
		*/

		/* 
		Exercise 24: (2) Fill a LinkedHashMap with String keys and objects of your choice. Now extract the pairs, sort them based on the keys, and reinsert them into the Map.
		*/

		/* 
		Exercise 25: (3) Create a Map<String,ArrayList<Integer>>. Use net.mindview.TextFile to open a text file and read it in a word at a time (use "\\W+" as the second argument to the TextFile constructor). Count the words as you read them in, and for each word in the file, record in the ArrayList<Integer> the word count associated with that word—this is, in effect, the location in the file where that word was found.
		*/

		/* 
		Exercise 26: (4) Take the resulting Map from the previous exercise and re-create the order of the words as they appeared in the original file.
		*/
	}
}

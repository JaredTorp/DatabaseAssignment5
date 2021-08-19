import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RelationalAlgebra {

  public static void main(String[] args) {
    Set<Integer> a = createSet(1, 3, 5);
    Set<Integer> b = createSet(3, 4, 5);
    Set<Integer> c = createSet(2, 2, 2, 4, 4, 6, 6, 8, 8, 4);
    Set<Integer> d = createSet(2, 3, 5, 7, 3, 3, 3, 3, 3, 5, 5, 7, 7, 7, 7);
     /*
    System.out.println("Unions:");
    System.out.println(union(a, b));
    System.out.println(union(b, a));
    System.out.println(union(c, d));
    System.out.println(union(d, c));

    
    System.out.println("\nIntersections:");
    System.out.println(intersection(a, b));
    System.out.println(intersection(b, a));
    System.out.println(intersection(c, d));
    System.out.println(intersection(d, c));

    System.out.println("\nSet Differences:");
    System.out.println(setDifference(a, b));
    System.out.println(setDifference(b, a));
    System.out.println(setDifference(c, d));
    System.out.println(setDifference(d, c));
    */
    

    System.out.println("\nCartesian Products:");
    System.out.println(cartesianProduct(a, b));
    //System.out.println(cartesianProduct(b, a));
    /*
    System.out.println(cartesianProduct(c, d));
    System.out.println(cartesianProduct(d, c));
*/
    
    System.out.println("\nEnsure original values remain unchanged:");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }

  static Set<Integer> createSet(int... args) {
    final Set<Integer> result = new HashSet();
    for (int arg : args) {
      result.add(arg);
    }
    return result;
  }

  static Set<Integer> union(Set<Integer> a, Set<Integer> b) {
    Set<Integer> union = new HashSet();
    union.addAll(a);
    union.addAll(b);
    return union;
  }

  static Set<Integer> intersection(Set<Integer> a, Set<Integer> b) {
    Set<Integer> intersect = new HashSet();
	intersect.addAll(a);
	intersect.retainAll(b); //intersection instead of adding all
	return intersect;
  }

  
  static Set<Integer> setDifference(Set<Integer> a, Set<Integer> b) {
	Set<Integer> diff = new HashSet();
	diff.addAll(a);
	diff.removeAll(b); //intersection instead of adding all
	return diff;
  }

  /**
   * Set<Set<Integer>> can't be used, because it will remove duplicates.
   * e.g. (2, 2) would be simplify to (2).
   */
  static Set<List<Integer>> cartesianProduct(Set<Integer> a, Set<Integer> b) {
	
	Set<List<Integer>> cartProd = new HashSet<List<Integer>>();
	
	
	for (Integer elementA : a) {
		for (Integer elementB : b){
			List<Integer> tempList = new ArrayList<Integer>();
			tempList.add(elementA);
			tempList.add(elementB);
			cartProd.add(tempList);
		}
	}
	return cartProd;
  }
}

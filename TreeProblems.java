/*
 * *** Evey Kallmeyer / COMP 272/400C - 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // Copy setA and setB into a combined set
    TreeSet<Integer> result = new TreeSet<>(setA);
    result.addAll(setB);

    // Find all elements that overlap between setA and setB, and copy them into their own set
    TreeSet<Integer> overlappingIntegers = new TreeSet<>(setA);
    overlappingIntegers.retainAll(setB);

    // From the result set, remove all the values in the overlappingIntegers set
    result.removeAll(overlappingIntegers);

    // return the outlier integers
    return result;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // Use iterator to search for an even key
    Iterator<Integer> iterator = treeMap.keySet().iterator();
    while (iterator.hasNext()) {
      int key = iterator.next();
      // If the key is even, remove it
      if (key % 2 == 0) {
        iterator.remove();
      }
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // If tree1 and tree2 are not equal, return false
    if (tree1.size() != tree2.size()) {
      return false;
    }

    // Identify if a tree contains a certain key
    for (Map.Entry<Integer, String> entry : tree1.entrySet()) {
      
      // Define key and value for clarity
      Integer key = entry.getKey();
      String value = entry.getValue();
      
      // If tree2 does not contain the key, the trees are not equal
      if (!tree2.containsKey(key)) {
        return false;
      // If tree2's value is not equal to tree1's value, the trees are not equal
      } else if (!Objects.equals(tree2.get(key), value)) {
        return false;
      }
    }

    // Return true if trees are equal
    return true;

  }

} // end treeProblems class

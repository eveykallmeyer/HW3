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
    TreeSet<Integer> overlappingIntergers = new TreeSet<>(setA);
    overlappingIngtegers.retainAll(setB);

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

    // INSERT CODE HERE.

    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE

    return false;

  }

} // end treeProblems class

/**
 * @name        Simple Java Calculator
 * @package     ph.calculator
 * @file        Main.java
 * @author      SORIA Pierre-Henry
 * @email       pierrehs@hotmail.com
 * @link        http://github.com/pH-7
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 * @create      2012-03-30
 *
 * @modifiedby  Achintha Gunasekara
 * @modweb      http://www.achinthagunasekara.com
 * @modemail    contact@achinthagunasekara.com
 */

package simplejavacalculator;

public class SimpleJavaCalculator {
   public static String test7 = "test"; // static-ok
   public static String test34;
   public static String test9;    // static-ok
   public static String test10;
   public static String test11;    // static-ok
   public static String test12;
   public static String valm;    // static-ok
   public static String valn;
   public static String valab;    // static-ok
   public static String valnq;
   public static String man;    // static-ok
   public static String nat;
   public static void main(String[] args) {
      try {
         UI uiCal = new UI();
         uiCal.init();
      }
      catch (Exception e) {
         System.out.println(e.getMessage());   
      }
      
   }
}

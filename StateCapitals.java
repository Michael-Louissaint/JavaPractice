import java.util.HashMap;
import java.io.*;

import java.util.Map;


public class StateCapitals {

        public static void main (String[] args) {
            HashMap<String, String> map
                    = new HashMap<>();
            map.put("Alabama","Montgomery");
            map.put("Alaska","Juneau");
            map.put("Arizona","Phoenix");
            map.put("Arkansas","Little Rock");


            System.out.println("STATE/CAPITAL PAIRS:");
            System.out.println("====================");
            for (Map.Entry<String, String> e : map.entrySet())
                System.out.println(e.getKey() + "---" + e.getValue());
            System.out.println("...");



            System.out.println("STATES:");
            System.out.println("=======");
            for (String i : map.keySet()) {
                System.out.println(i);
            }
            System.out.println("...");


            System.out.println("CAPITALS:");
            System.out.println("=========");
            for (String i : map.values()) {
                System.out.println(i);
            }

        }


    }



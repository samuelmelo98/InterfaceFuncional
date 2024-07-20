package model;

import com.sun.javafx.collections.UnmodifiableObservableMap;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringJoinerAndStringTokenizer {

    static String nomes = "Samuel, Anderson, Maria, Geni, Manoel";

    public static void main(String[] args) {
        /**
         * Quebra string na ,
         */
        StringTokenizer st = new StringTokenizer(nomes, ",");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        /**
         * Unir string com delimitador, usando StringJoiner
         */

        StringJoiner sj = new StringJoiner(",");
        sj.add("Samuel");
        sj.add("Maria");
        sj.add("Geni");
        System.out.println(sj);

    }
}

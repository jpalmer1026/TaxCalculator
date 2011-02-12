package com.javapowertools.taxcalculator;

/**
 * Created by IntelliJ IDEA.
 * User: jeff
 * Date: 2/11/11
 * Time: 2:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        String jvm = System.getProperty("java.version");
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        System.out.println("Running Java " + jvm
                + " on " + osName
                + " (version " + osVersion + ")");
    }
}

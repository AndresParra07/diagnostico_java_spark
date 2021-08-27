package minsait.ttaa.datio.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Common {

    public static final String SPARK_MODE = "local[*]";
    public static final String HEADER = "header";
    public static final String INFER_SCHEMA = "inferSchema";
    public static final String INPUT_PATH = "src/test/resources/data/players_21.csv";
    public static final String OUTPUT_PATH = "src/test/resources/data/output";


    public static final List<String> listFilterPlayerCatAB = Arrays.asList("A", "B");


    public static final List<String> listFilterPlayerCatCD = Arrays.asList("C", "D");

}

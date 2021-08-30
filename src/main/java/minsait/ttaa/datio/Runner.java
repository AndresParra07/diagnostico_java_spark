package minsait.ttaa.datio;


import minsait.ttaa.datio.engine.Transformer;
import org.apache.spark.sql.SparkSession;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.Config;

import java.io.File;

import static minsait.ttaa.datio.common.Common.SPARK_MODE;

public class Runner {
    static SparkSession spark = SparkSession
            .builder()
            .master(SPARK_MODE)
            .getOrCreate();

    public static void main(String[] args) {

        File myConfigFile = new File("src/main/resources/params.confg");
        Config fileConfig = ConfigFactory.parseFile(myConfigFile).getConfig("params");
        Config conf = ConfigFactory.load(fileConfig);

        Transformer engine = new Transformer(spark, conf);

    }
}

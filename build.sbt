name := "scalaprograms"

version := "0.1"

scalaVersion := "2.12.15"

libraryDependencies ++= Seq(

  "org.apache.spark" %% "spark-core" % "3.2.0" % "provided",
  "org.apache.spark" %% "spark-sql" % "3.2.0" % "provided",
  "org.apache.spark" %% "spark-avro" % "3.2.0" % "provided",
  "org.apache.hadoop" % "hadoop-client" % "3.2.1" % "provided",
  "org.apache.hadoop" % "hadoop-yarn-client" % "3.2.1" % "provided",
  "org.apache.kafka" % "kafka-clients" % "3.2.0" % "provided",
  "org.apache.spark" %% "spark-streaming" % "3.2.0" % "provided",
  "org.apache.spark" %% "spark-streaming-kafka-0-10" % "3.2.0" % "provided",
  "org.apache.spark" %% "spark-sql-kafka-0-10" % "3.2.0" % "provided",
  "org.apache.spark" %% "spark-sql-kafka-0-10" % "3.2.0" % "provided",


  "io.confluent" % "kafka-avro-serializer" % "7.1.1" from "https://packages.confluent.io/maven/io/confluent/kafka-avro-serializer/7.1.1/kafka-avro-serializer-7.1.1.jar" ,
  "io.confluent" % "kafka-schema-registry-client" % "7.1.1"  from "https://packages.confluent.io/maven/io/confluent/kafka-schema-registry-client/7.1.1/kafka-schema-registry-client-7.1.1.jar",
  "io.confluent" % "kafka-schema-serializer" % "7.1.1"  from "https://packages.confluent.io/maven/io/confluent/kafka-schema-serializer/7.1.1/kafka-schema-serializer-7.1.1.jar",

  //"za.co.absa" %% "abris" % "6.3.0" % "provided" from "https://repo1.maven.org/maven2/za/co/absa/abris_2.12/6.3.0/abris_2.12-6.3.0.jar",
  "za.co.absa" %% "abris" % "6.3.0"  from "https://repo1.maven.org/maven2/za/co/absa/abris_2.12/6.3.0/abris_2.12-6.3.0.jar",



  // https://mvnrepository.com/artifact/org.apache.spark/spark-catalyst
  //"org.apache.spark" %% "spark-catalyst" % "3.1.2" % "provided",
  // "org.apache.spark" %% "spark-catalyst" % "3.1.2",


  // Testing Libraries
  "org.scalatest" %% "scalatest" % "3.2.12" % "test",
  "org.scalacheck" %% "scalacheck" % "1.15.4" % "test"

)

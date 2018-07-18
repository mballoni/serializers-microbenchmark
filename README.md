WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.openjdk.jmh.util.Utils (file:/home/sagan/repositories/json-microb/target/benchmarks.jar) to field java.io.Console.cs
WARNING: Please consider reporting this to the maintainers of org.openjdk.jmh.util.Utils
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
# JMH version: 1.21
# VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11
# VM invoker: /usr/lib/jvm/java-9-oracle/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: br.com.poc.fastjson.FastJsonSerializationBenchmark.serializeFastJson

# Run progress: 0,00% complete, ETA 01:06:40
# Fork: 1 of 5
# Warmup Iteration   1: 5024881,484 ops/s
# Warmup Iteration   2: 4772083,088 ops/s
# Warmup Iteration   3: 5315585,629 ops/s
# Warmup Iteration   4: 5333428,496 ops/s
# Warmup Iteration   5: 5328468,302 ops/s
Iteration   1: 5330270,200 ops/s
Iteration   2: 5338907,782 ops/s
Iteration   3: 5334051,284 ops/s
Iteration   4: 5322065,613 ops/s
Iteration   5: 5334908,439 ops/s

# Run progress: 2,50% complete, ETA 01:05:14
# Fork: 2 of 5
# Warmup Iteration   1: 4839847,813 ops/s
# Warmup Iteration   2: 4902037,754 ops/s
# Warmup Iteration   3: 5028924,368 ops/s
# Warmup Iteration   4: 5023240,303 ops/s
# Warmup Iteration   5: 5016375,627 ops/s
Iteration   1: 5021349,075 ops/s
Iteration   2: 5030135,459 ops/s
Iteration   3: 5025394,660 ops/s
Iteration   4: 5026511,596 ops/s
Iteration   5: 4999495,930 ops/s

# Run progress: 5,00% complete, ETA 01:03:33
# Fork: 3 of 5
# Warmup Iteration   1: 4994321,840 ops/s
# Warmup Iteration   2: 4964239,960 ops/s
# Warmup Iteration   3: 5180751,530 ops/s
# Warmup Iteration   4: 5284499,073 ops/s
# Warmup Iteration   5: 5275637,899 ops/s
Iteration   1: 5269757,945 ops/s
Iteration   2: 5251374,278 ops/s
Iteration   3: 5293659,108 ops/s
Iteration   4: 5278583,272 ops/s
Iteration   5: 5283813,323 ops/s

# Run progress: 7,50% complete, ETA 01:01:52
# Fork: 4 of 5
# Warmup Iteration   1: 5095450,911 ops/s
# Warmup Iteration   2: 5052522,700 ops/s
# Warmup Iteration   3: 5128292,696 ops/s
# Warmup Iteration   4: 5163199,680 ops/s
# Warmup Iteration   5: 5191261,428 ops/s
Iteration   1: 5206406,399 ops/s
Iteration   2: 5247909,054 ops/s
Iteration   3: 5246107,741 ops/s
Iteration   4: 5235971,489 ops/s
Iteration   5: 5187923,467 ops/s

# Run progress: 10,00% complete, ETA 01:00:12
# Fork: 5 of 5
# Warmup Iteration   1: 5122590,199 ops/s
# Warmup Iteration   2: 5175901,495 ops/s
# Warmup Iteration   3: 5323840,326 ops/s
# Warmup Iteration   4: 5335902,626 ops/s
# Warmup Iteration   5: 5310787,960 ops/s
Iteration   1: 5322287,521 ops/s
Iteration   2: 5319536,648 ops/s
Iteration   3: 5327743,836 ops/s
Iteration   4: 5324795,437 ops/s
Iteration   5: 5324367,961 ops/s


Result "br.com.poc.fastjson.FastJsonSerializationBenchmark.serializeFastJson":
  5235333,101 ±(99.9%) 87792,771 ops/s [Average]
  (min, avg, max) = (4999495,930, 5235333,101, 5338907,782), stdev = 117200,838
  CI (99.9%): [5147540,330, 5323125,872] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11
# VM invoker: /usr/lib/jvm/java-9-oracle/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: br.com.poc.gson.GSONSerializationBenchmark.serializeGSON

# Run progress: 12,50% complete, ETA 00:58:31
# Fork: 1 of 5
# Warmup Iteration   1: 1590582,242 ops/s
# Warmup Iteration   2: 1905991,924 ops/s
# Warmup Iteration   3: 1927277,677 ops/s
# Warmup Iteration   4: 1928748,153 ops/s
# Warmup Iteration   5: 1930047,943 ops/s
Iteration   1: 1928939,358 ops/s
Iteration   2: 1928364,416 ops/s
Iteration   3: 1929539,730 ops/s
Iteration   4: 1920781,656 ops/s
Iteration   5: 1927338,523 ops/s

# Run progress: 15,00% complete, ETA 00:56:52
# Fork: 2 of 5
# Warmup Iteration   1: 1588087,722 ops/s
# Warmup Iteration   2: 1915057,112 ops/s
# Warmup Iteration   3: 1929595,890 ops/s
# Warmup Iteration   4: 1927519,988 ops/s
# Warmup Iteration   5: 1929404,889 ops/s
Iteration   1: 1899508,894 ops/s
Iteration   2: 1888931,492 ops/s
Iteration   3: 
1914213,083 ops/s
Iteration   4: 1933315,941 ops/s
Iteration   5: 1935937,427 ops/s

# Run progress: 17,50% complete, ETA 00:55:11
# Fork: 3 of 5
# Warmup Iteration   1: 1550837,286 ops/s
# Warmup Iteration   2: 


1855837,766 ops/s
# Warmup Iteration   3: 1879146,576 ops/s
# Warmup Iteration   4: 1874777,608 ops/s
# Warmup Iteration   5: 1876818,892 ops/s
Iteration   1: 1877175,680 ops/s
Iteration   2: 1877414,930 ops/s
Iteration   3: 1873746,383 ops/s
Iteration   4: 1877796,266 ops/s
Iteration   5: 1878845,400 ops/s

# Run progress: 20,00% complete, ETA 00:53:31
# Fork: 4 of 5
# Warmup Iteration   1: 1540017,955 ops/s
# Warmup Iteration   2: 1850852,092 ops/s
# Warmup Iteration   3: 1864173,732 ops/s
# Warmup Iteration   4: 1868000,295 ops/s
# Warmup Iteration   5: 1865498,263 ops/s
Iteration   1: 1853161,192 ops/s
Iteration   2: 1864848,008 ops/s
Iteration   3: 1861441,812 ops/s
Iteration   4: 1869146,715 ops/s
Iteration   5: 1867832,989 ops/s

# Run progress: 22,50% complete, ETA 00:51:51
# Fork: 5 of 5
# Warmup Iteration   1: 1587297,241 ops/s
# Warmup Iteration   2: 1912611,197 ops/s
# Warmup Iteration   3: 1912236,225 ops/s
# Warmup Iteration   4: 1912733,032 ops/s
# Warmup Iteration   5: 1892006,754 ops/s
Iteration   1: 1903584,896 ops/s
Iteration   2: 1912194,572 ops/s
Iteration   3: 1912356,570 ops/s
Iteration   4: 1912480,638 ops/s
Iteration   5: 1909666,104 ops/s


Result "br.com.poc.gson.GSONSerializationBenchmark.serializeGSON":
  1898342,507 ±(99.9%) 19628,291 ops/s [Average]
  (min, avg, max) = (1853161,192, 1898342,507, 1935937,427), stdev = 26203,207
  CI (99.9%): [1878714,216, 1917970,798] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11
# VM invoker: /usr/lib/jvm/java-9-oracle/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: br.com.poc.jackson.JacksonSerializationBenchmark.serializeJackson

# Run progress: 25,00% complete, ETA 00:50:10
# Fork: 1 of 5
# Warmup Iteration   1: 3827707,535 ops/s
# Warmup Iteration   2: 3968774,736 ops/s
# Warmup Iteration   3: 4044342,642 ops/s
# Warmup Iteration   4: 4033374,577 ops/s
# Warmup Iteration   5: 4043799,498 ops/s
Iteration   1: 4022157,054 ops/s
Iteration   2: 4021885,151 ops/s
Iteration   3: 4048420,100 ops/s
Iteration   4: 4051651,298 ops/s
Iteration   5: 4039020,997 ops/s

# Run progress: 27,50% complete, ETA 00:48:30
# Fork: 2 of 5
# Warmup Iteration   1: 3878338,505 ops/s
# Warmup Iteration   2: 4030360,203 ops/s
# Warmup Iteration   3: 4133753,010 ops/s
# Warmup Iteration   4: 4123326,124 ops/s
# Warmup Iteration   5: 4122042,118 ops/s
Iteration   1: 4117808,880 ops/s
Iteration   2: 4135943,365 ops/s
Iteration   3: 4133590,232 ops/s
Iteration   4: 4125531,911 ops/s
Iteration   5: 4136809,887 ops/s

# Run progress: 30,00% complete, ETA 00:46:50
# Fork: 3 of 5
# Warmup Iteration   1: 3809118,207 ops/s
# Warmup Iteration   2: 3930752,980 ops/s
# Warmup Iteration   3: 4038344,250 ops/s
# Warmup Iteration   4: 4024141,621 ops/s
# Warmup Iteration   5: 4044804,291 ops/s
Iteration   1: 4037078,748 ops/s
Iteration   2: 4041134,456 ops/s
Iteration   3: 4008978,682 ops/s
Iteration   4: 4042108,161 ops/s
Iteration   5: 4042013,374 ops/s

# Run progress: 32,50% complete, ETA 00:45:10
# Fork: 4 of 5
# Warmup Iteration   1: 3798406,478 ops/s
# Warmup Iteration   2: 3940792,518 ops/s
# Warmup Iteration   3: 4041124,562 ops/s
# Warmup Iteration   4: 4037998,140 ops/s
# Warmup Iteration   5: 4039157,604 ops/s
Iteration   1: 4039248,796 ops/s
Iteration   2: 4042636,588 ops/s
Iteration   3: 4041665,944 ops/s
Iteration   4: 4043644,366 ops/s
Iteration   5: 4042588,937 ops/s

# Run progress: 35,00% complete, ETA 00:43:30
# Fork: 5 of 5
# Warmup Iteration   1: 3758150,156 ops/s
# Warmup Iteration   2: 3917223,077 ops/s
# Warmup Iteration   3: 3994265,042 ops/s
# Warmup Iteration   4: 3999776,059 ops/s
# Warmup Iteration   5: 4007621,633 ops/s
Iteration   1: 3960387,097 ops/s
Iteration   2: 3941278,019 ops/s
Iteration   3: 4032891,062 ops/s
Iteration   4: 4045624,829 ops/s
Iteration   5: 4037316,935 ops/s


Result "br.com.poc.jackson.JacksonSerializationBenchmark.serializeJackson":
  4049256,595 ±(99.9%) 36378,244 ops/s [Average]
  (min, avg, max) = (3941278,019, 4049256,595, 4136809,887), stdev = 48563,915
  CI (99.9%): [4012878,350, 4085634,839] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11
# VM invoker: /usr/lib/jvm/java-9-oracle/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: br.com.poc.protobuf.ProtobufSerializationBenchmark.serializeProtobuf

# Run progress: 37,50% complete, ETA 00:41:50
# Fork: 1 of 5
# Warmup Iteration   1: WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/home/sagan/repositories/json-microb/target/benchmarks.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
7103622,790 ops/s
# Warmup Iteration   2: 7359203,293 ops/s
# Warmup Iteration   3: 7451313,336 ops/s
# Warmup Iteration   4: 7437075,176 ops/s
# Warmup Iteration   5: 7435606,873 ops/s
Iteration   1: 7450491,690 ops/s
Iteration   2: 7439225,323 ops/s
Iteration   3: 7448866,190 ops/s
Iteration   4: 7445557,121 ops/s
Iteration   5: 7457848,734 ops/s

# Run progress: 40,00% complete, ETA 00:40:09
# Fork: 2 of 5
# Warmup Iteration   1: WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/home/sagan/repositories/json-microb/target/benchmarks.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
7057823,775 ops/s
# Warmup Iteration   2: 7324961,943 ops/s
# Warmup Iteration   3: 7532186,564 ops/s
# Warmup Iteration   4: 7540906,694 ops/s
# Warmup Iteration   5: 7542802,422 ops/s
Iteration   1: 7529373,130 ops/s
Iteration   2: 7553206,280 ops/s
Iteration   3: 7543229,290 ops/s
Iteration   4: 7373941,668 ops/s
Iteration   5: 7454749,125 ops/s

# Run progress: 42,50% complete, ETA 00:38:29
# Fork: 3 of 5
# Warmup Iteration   1: WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/home/sagan/repositories/json-microb/target/benchmarks.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
6978834,549 ops/s
# Warmup Iteration   2: 7255724,786 ops/s
# Warmup Iteration   3: 7476436,590 ops/s
# Warmup Iteration   4: 7348426,200 ops/s
# Warmup Iteration   5: 7361362,465 ops/s
Iteration   1: 7487141,502 ops/s
Iteration   2: 7541657,226 ops/s
Iteration   3: 7518757,142 ops/s
Iteration   4: 7521888,195 ops/s
Iteration   5: 7562542,639 ops/s

# Run progress: 45,00% complete, ETA 00:36:48
# Fork: 4 of 5
# Warmup Iteration   1: WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/home/sagan/repositories/json-microb/target/benchmarks.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
7016938,779 ops/s
# Warmup Iteration   2: 7286651,901 ops/s
# Warmup Iteration   3: 7504971,000 ops/s
# Warmup Iteration   4: 7489204,543 ops/s
# Warmup Iteration   5: 7500924,627 ops/s
Iteration   1: 7508063,486 ops/s
Iteration   2: 7493858,889 ops/s
Iteration   3: 7500373,545 ops/s
Iteration   4: 7511980,217 ops/s
Iteration   5: 7512376,579 ops/s

# Run progress: 47,50% complete, ETA 00:35:08
# Fork: 5 of 5
# Warmup Iteration   1: WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/home/sagan/repositories/json-microb/target/benchmarks.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
7021678,590 ops/s
# Warmup Iteration   2: 7281259,235 ops/s
# Warmup Iteration   3: 7504406,623 ops/s
# Warmup Iteration   4: 7502429,466 ops/s
# Warmup Iteration   5: 7494808,079 ops/s
Iteration   1: 7494053,434 ops/s
Iteration   2: 7495045,777 ops/s
Iteration   3: 7488630,172 ops/s
Iteration   4: 7491219,109 ops/s
Iteration   5: 7489077,925 ops/s


Result "br.com.poc.protobuf.ProtobufSerializationBenchmark.serializeProtobuf":
  7492526,175 ±(99.9%) 31719,176 ops/s [Average]
  (min, avg, max) = (7373941,668, 7492526,175, 7562542,639), stdev = 42344,192
  CI (99.9%): [7460807,000, 7524245,351] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11
# VM invoker: /usr/lib/jvm/java-9-oracle/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: br.com.poc.fastjson.FastJsonSerializationBenchmark.serializeFastJson

# Run progress: 50,00% complete, ETA 00:33:27
# Fork: 1 of 5
# Warmup Iteration   1: ≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op

# Run progress: 52,50% complete, ETA 00:31:47
# Fork: 2 of 5
# Warmup Iteration   1: ≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op

# Run progress: 55,00% complete, ETA 00:30:06
# Fork: 3 of 5
# Warmup Iteration   1: ≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op

# Run progress: 57,50% complete, ETA 00:28:26
# Fork: 4 of 5
# Warmup Iteration   1: ≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op

# Run progress: 60,00% complete, ETA 00:26:46
# Fork: 5 of 5
# Warmup Iteration   1: ≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op


Result "br.com.poc.fastjson.FastJsonSerializationBenchmark.serializeFastJson":
  ≈ 10⁻⁷ s/op


# JMH version: 1.21
# VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11
# VM invoker: /usr/lib/jvm/java-9-oracle/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: br.com.poc.gson.GSONSerializationBenchmark.serializeGSON

# Run progress: 62,50% complete, ETA 00:25:05
# Fork: 1 of 5
# Warmup Iteration   1: ≈ 10⁻⁶ s/op
# Warmup Iteration   2: ≈ 10⁻⁶ s/op
# Warmup Iteration   3: ≈ 10⁻⁶ s/op
# Warmup Iteration   4: ≈ 10⁻⁶ s/op
# Warmup Iteration   5: ≈ 10⁻⁶ s/op
Iteration   1: ≈ 10⁻⁶ s/op
Iteration   2: ≈ 10⁻⁶ s/op
Iteration   3: ≈ 10⁻⁶ s/op
Iteration   4: ≈ 10⁻⁶ s/op
Iteration   5: ≈ 10⁻⁶ s/op

# Run progress: 65,00% complete, ETA 00:23:25
# Fork: 2 of 5
# Warmup Iteration   1: ≈ 10⁻⁶ s/op
# Warmup Iteration   2: ≈ 10⁻⁶ s/op
# Warmup Iteration   3: ≈ 10⁻⁶ s/op
# Warmup Iteration   4: ≈ 10⁻⁶ s/op
# Warmup Iteration   5: ≈ 10⁻⁶ s/op
Iteration   1: ≈ 10⁻⁶ s/op
Iteration   2: ≈ 10⁻⁶ s/op
Iteration   3: ≈ 10⁻⁶ s/op
Iteration   4: ≈ 10⁻⁶ s/op
Iteration   5: ≈ 10⁻⁶ s/op

# Run progress: 67,50% complete, ETA 00:21:44
# Fork: 3 of 5
# Warmup Iteration   1: ≈ 10⁻⁶ s/op
# Warmup Iteration   2: ≈ 10⁻⁶ s/op
# Warmup Iteration   3: ≈ 10⁻⁶ s/op
# Warmup Iteration   4: ≈ 10⁻⁶ s/op
# Warmup Iteration   5: ≈ 10⁻⁶ s/op
Iteration   1: ≈ 10⁻⁶ s/op
Iteration   2: ≈ 10⁻⁶ s/op
Iteration   3: ≈ 10⁻⁶ s/op
Iteration   4: ≈ 10⁻⁶ s/op
Iteration   5: ≈ 10⁻⁶ s/op

# Run progress: 70,00% complete, ETA 00:20:04
# Fork: 4 of 5
# Warmup Iteration   1: ≈ 10⁻⁶ s/op
# Warmup Iteration   2: ≈ 10⁻⁶ s/op
# Warmup Iteration   3: ≈ 10⁻⁶ s/op
# Warmup Iteration   4: ≈ 10⁻⁶ s/op
# Warmup Iteration   5: ≈ 10⁻⁶ s/op
Iteration   1: ≈ 10⁻⁶ s/op
Iteration   2: ≈ 10⁻⁶ s/op
Iteration   3: ≈ 10⁻⁶ s/op
Iteration   4: ≈ 10⁻⁶ s/op
Iteration   5: ≈ 10⁻⁶ s/op

# Run progress: 72,50% complete, ETA 00:18:24
# Fork: 5 of 5
# Warmup Iteration   1: ≈ 10⁻⁶ s/op
# Warmup Iteration   2: ≈ 10⁻⁶ s/op
# Warmup Iteration   3: ≈ 10⁻⁶ s/op
# Warmup Iteration   4: ≈ 10⁻⁶ s/op
# Warmup Iteration   5: ≈ 10⁻⁶ s/op
Iteration   1: ≈ 10⁻⁶ s/op
Iteration   2: ≈ 10⁻⁶ s/op
Iteration   3: ≈ 10⁻⁶ s/op
Iteration   4: ≈ 10⁻⁶ s/op
Iteration   5: ≈ 10⁻⁶ s/op


Result "br.com.poc.gson.GSONSerializationBenchmark.serializeGSON":
  ≈ 10⁻⁶ s/op


# JMH version: 1.21
# VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11
# VM invoker: /usr/lib/jvm/java-9-oracle/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: br.com.poc.jackson.JacksonSerializationBenchmark.serializeJackson

# Run progress: 75,00% complete, ETA 00:16:43
# Fork: 1 of 5
# Warmup Iteration   1: ≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op

# Run progress: 77,50% complete, ETA 00:15:03
# Fork: 2 of 5
# Warmup Iteration   1: ≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op

# Run progress: 80,00% complete, ETA 00:13:23
# Fork: 3 of 5
# Warmup Iteration   1: ≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op

# Run progress: 82,50% complete, ETA 00:11:42
# Fork: 4 of 5
# Warmup Iteration   1: ≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op

# Run progress: 85,00% complete, ETA 00:10:02
# Fork: 5 of 5
# Warmup Iteration   1: ≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op


Result "br.com.poc.jackson.JacksonSerializationBenchmark.serializeJackson":
  ≈ 10⁻⁷ s/op


# JMH version: 1.21
# VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11
# VM invoker: /usr/lib/jvm/java-9-oracle/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: br.com.poc.protobuf.ProtobufSerializationBenchmark.serializeProtobuf

# Run progress: 87,50% complete, ETA 00:08:21
# Fork: 1 of 5
# Warmup Iteration   1: WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/home/sagan/repositories/json-microb/target/benchmarks.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op

# Run progress: 90,00% complete, ETA 00:06:41
# Fork: 2 of 5
# Warmup Iteration   1: WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/home/sagan/repositories/json-microb/target/benchmarks.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op

# Run progress: 92,50% complete, ETA 00:05:01
# Fork: 3 of 5
# Warmup Iteration   1: WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/home/sagan/repositories/json-microb/target/benchmarks.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op

# Run progress: 95,00% complete, ETA 00:03:20
# Fork: 4 of 5
# Warmup Iteration   1: WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/home/sagan/repositories/json-microb/target/benchmarks.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op

# Run progress: 97,50% complete, ETA 00:01:40
# Fork: 5 of 5
# Warmup Iteration   1: WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/home/sagan/repositories/json-microb/target/benchmarks.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
≈ 10⁻⁷ s/op
# Warmup Iteration   2: ≈ 10⁻⁷ s/op
# Warmup Iteration   3: ≈ 10⁻⁷ s/op
# Warmup Iteration   4: ≈ 10⁻⁷ s/op
# Warmup Iteration   5: ≈ 10⁻⁷ s/op
Iteration   1: ≈ 10⁻⁷ s/op
Iteration   2: ≈ 10⁻⁷ s/op
Iteration   3: ≈ 10⁻⁷ s/op
Iteration   4: ≈ 10⁻⁷ s/op
Iteration   5: ≈ 10⁻⁷ s/op


Result "br.com.poc.protobuf.ProtobufSerializationBenchmark.serializeProtobuf":
  ≈ 10⁻⁷ s/op


# Run complete. Total time: 01:06:55

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                                         Mode  Cnt        Score       Error  Units
b.c.p.fastjson.FastJsonSerializationBenchmark.serializeFastJson  thrpt   25  5235333,101 ± 87792,771  ops/s
b.c.p.gson.GSONSerializationBenchmark.serializeGSON              thrpt   25  1898342,507 ± 19628,291  ops/s
b.c.p.jackson.JacksonSerializationBenchmark.serializeJackson     thrpt   25  4049256,595 ± 36378,244  ops/s
b.c.p.protobuf.ProtobufSerializationBenchmark.serializeProtobuf  thrpt   25  7492526,175 ± 31719,176  ops/s
b.c.p.fastjson.FastJsonSerializationBenchmark.serializeFastJson   avgt   25       ≈ 10⁻⁷               s/op
b.c.p.gson.GSONSerializationBenchmark.serializeGSON               avgt   25       ≈ 10⁻⁶               s/op
b.c.p.jackson.JacksonSerializationBenchmark.serializeJackson      avgt   25       ≈ 10⁻⁷               s/op
b.c.p.protobuf.ProtobufSerializationBenchmark.serializeProtobuf   avgt   25       ≈ 10⁻⁷               s/op
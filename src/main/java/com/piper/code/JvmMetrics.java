package com.piper.code;

public interface JvmMetrics{

  /* HEAP */
  long heapInitialized();
  long heapUsed();
  long heapCommitted();
  long heapMaximized();

  /* NON-HEAP, 方法区 */
  long nonHeapInitialized();
  long nonHeapUsed();
  long nonHeapCommitted();
  long nonHeapMaximized();

  /* Thread */
  int threadCount();
  int daemonThreadCount();
  int peakThreadCount();

  /* Runtime */
  long jvmUptime();
  String jvmVendor();
  String jvmVersion();

  /* OS */
  String arch();
  String osName();
  String osVersion();
  int processors();
  double loadavg(); // 最近1分钟

  /* Class */
  int loadedClassCount();
  long totalLoadedClassCount();
  long unloadedClassCount();

  /* Compilation */
  String JITCompilerName();
}

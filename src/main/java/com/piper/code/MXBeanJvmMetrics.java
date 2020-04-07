package com.piper.code;

public class MXBeanJvmMetrics implements JvmMetrics {
  final MXBeanContainer container = MXBeanContainer.getInstance();

  @Override
  public long heapInitialized() {
    return container.memory.getHeapMemoryUsage().getInit();
  }

  @Override
  public long heapUsed() {
    return container.memory.getHeapMemoryUsage().getUsed();
  }

  @Override
  public long heapCommitted() {
    return container.memory.getHeapMemoryUsage().getCommitted();
  }

  @Override
  public long heapMaximized() {
    return container.memory.getHeapMemoryUsage().getMax();
  }

  @Override
  public long nonHeapInitialized() {
    return container.memory.getNonHeapMemoryUsage().getInit();
  }

  @Override
  public long nonHeapUsed() {
    return container.memory.getNonHeapMemoryUsage().getUsed();
  }

  @Override
  public long nonHeapCommitted() {
    return container.memory.getNonHeapMemoryUsage().getCommitted();
  }

  @Override
  public long nonHeapMaximized() {
    return container.memory.getNonHeapMemoryUsage().getMax();
  }

  @Override
  public int threadCount() {
    return container.thread.getThreadCount();
  }

  @Override
  public int daemonThreadCount() {
    return container.thread.getDaemonThreadCount();
  }

  @Override
  public int peakThreadCount() {
    return container.thread.getPeakThreadCount();
  }

  @Override
  public long jvmUptime() {
    return container.runtime.getUptime();
  }

  @Override
  public String jvmVendor() {
    return container.runtime.getVmVendor();
  }

  @Override
  public String jvmVersion() {
    return container.runtime.getVmVersion();
  }

  @Override
  public String arch() {
    return container.system.getArch();
  }

  @Override
  public String osName() {
    return container.system.getName();
  }

  @Override
  public String osVersion() {
    return container.system.getVersion();
  }

  @Override
  public int processors() {
    return container.system.getAvailableProcessors();
  }

  @Override
  public double loadavg() {
    return container.system.getSystemLoadAverage();
  }

  @Override
  public int loadedClassCount() {
    return container.classloading.getLoadedClassCount();
  }

  @Override
  public long totalLoadedClassCount() {
    return container.classloading.getTotalLoadedClassCount();
  }


  @Override
  public long unloadedClassCount() {
    return container.classloading.getUnloadedClassCount();
  }

  @Override
  public String JITCompilerName() {
    return container.compilation.getName();
  }
}

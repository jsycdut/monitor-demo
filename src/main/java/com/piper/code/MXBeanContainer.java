package com.piper.code;

import java.lang.management.ManagementFactory;
import java.lang.management.*;

public final class MXBeanContainer {
  final MemoryMXBean memory;
  final ThreadMXBean thread;
  final RuntimeMXBean runtime;
  final OperatingSystemMXBean system;
  final ClassLoadingMXBean classloading;
  final CompilationMXBean compilation;

  private static volatile MXBeanContainer INSTANCE;

  private MXBeanContainer(){
    this.memory = ManagementFactory.getMemoryMXBean();
    this.thread = ManagementFactory.getThreadMXBean();
    this.runtime = ManagementFactory.getRuntimeMXBean();
    this.system = ManagementFactory.getOperatingSystemMXBean();
    this.classloading = ManagementFactory.getClassLoadingMXBean();
    this.compilation = ManagementFactory.getCompilationMXBean();
  }

  public static MXBeanContainer getInstance(){
    if (INSTANCE == null) {
      synchronized(MXBeanContainer.class) {
        if (INSTANCE == null) {
          INSTANCE = new MXBeanContainer();
        }
      }
    }

    return INSTANCE;
  }
}

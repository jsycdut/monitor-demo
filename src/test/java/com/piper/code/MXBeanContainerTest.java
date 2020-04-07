package com.piper.code;

import java.util.Set;
import java.util.concurrent.Executors;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.junit.Test;

public class MXBeanContainerTest{
  Set<MXBeanContainer> set = new HashSet<>();
  Executor pool = Executors.newFixedThreadPool(100);

  @Test
  public void testSingleton() {
    
  }
}

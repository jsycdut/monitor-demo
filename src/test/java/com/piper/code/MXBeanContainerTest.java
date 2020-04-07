package com.piper.code;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.junit.Test;

public class MXBeanContainerTest{
  Map<MXBeanContainer, Object> map = new ConcurrentHashMap<>();
  Executor pool = Executors.newFixedThreadPool(100);

  @Test
  public void testSingleton() {
    for (int i = 0; i < 1000; i++) {
      pool.execute(()->{
        MXBeanContainer m = MXBeanContainer.getInstance();
        map.put(m, new Object());
      });
    }

    assertEquals(1, map.size());
  }
}

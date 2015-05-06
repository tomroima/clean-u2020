package com.gior.skeleton.example.data.cache.serializer;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum JsonSerializer_Factory implements Factory<JsonSerializer> {
INSTANCE;

  @Override
  public JsonSerializer get() {  
    return new JsonSerializer();
  }

  public static Factory<JsonSerializer> create() {  
    return INSTANCE;
  }
}


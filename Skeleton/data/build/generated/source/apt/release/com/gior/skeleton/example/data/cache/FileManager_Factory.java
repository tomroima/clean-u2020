package com.gior.skeleton.example.data.cache;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum FileManager_Factory implements Factory<FileManager> {
INSTANCE;

  @Override
  public FileManager get() {  
    return new FileManager();
  }

  public static Factory<FileManager> create() {  
    return INSTANCE;
  }
}


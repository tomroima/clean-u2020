package com.gior.skeleton.example.presentation;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum UIThread_Factory implements Factory<UIThread> {
INSTANCE;

  @Override
  public UIThread get() {  
    return new UIThread();
  }

  public static Factory<UIThread> create() {  
    return INSTANCE;
  }
}


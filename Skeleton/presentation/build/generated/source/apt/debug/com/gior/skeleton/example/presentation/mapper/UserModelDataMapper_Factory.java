package com.gior.skeleton.example.presentation.mapper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum UserModelDataMapper_Factory implements Factory<UserModelDataMapper> {
INSTANCE;

  @Override
  public UserModelDataMapper get() {  
    return new UserModelDataMapper();
  }

  public static Factory<UserModelDataMapper> create() {  
    return INSTANCE;
  }
}


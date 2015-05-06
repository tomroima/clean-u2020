package com.gior.skeleton.example.data.entity.mapper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum UserEntityDataMapper_Factory implements Factory<UserEntityDataMapper> {
INSTANCE;

  @Override
  public UserEntityDataMapper get() {  
    return new UserEntityDataMapper();
  }

  public static Factory<UserEntityDataMapper> create() {  
    return INSTANCE;
  }
}


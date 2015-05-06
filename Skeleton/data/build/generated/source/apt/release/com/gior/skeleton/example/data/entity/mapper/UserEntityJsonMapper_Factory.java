package com.gior.skeleton.example.data.entity.mapper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum UserEntityJsonMapper_Factory implements Factory<UserEntityJsonMapper> {
INSTANCE;

  @Override
  public UserEntityJsonMapper get() {  
    return new UserEntityJsonMapper();
  }

  public static Factory<UserEntityJsonMapper> create() {  
    return INSTANCE;
  }
}


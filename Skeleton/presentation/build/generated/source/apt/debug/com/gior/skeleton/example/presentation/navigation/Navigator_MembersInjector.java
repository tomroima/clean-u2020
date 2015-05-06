package com.gior.skeleton.example.presentation.navigation;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Navigator_MembersInjector implements MembersInjector<Navigator> {

  @Override
  public void injectMembers(Navigator instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.Navigator();
  }

  public static MembersInjector<Navigator> create() {  
      return new Navigator_MembersInjector();
  }
}


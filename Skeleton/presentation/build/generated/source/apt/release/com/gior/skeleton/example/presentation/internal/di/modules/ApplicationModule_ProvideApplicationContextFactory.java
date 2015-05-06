package com.gior.skeleton.example.presentation.internal.di.modules;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideApplicationContextFactory implements Factory<Context> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideApplicationContextFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {  
    Context provided = module.provideApplicationContext();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Context> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideApplicationContextFactory(module);
  }
}


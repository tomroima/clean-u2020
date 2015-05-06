package com.gior.skeleton.example.presentation.internal.di.modules;

import com.gior.skeleton.example.data.cache.UserCache;
import com.gior.skeleton.example.data.cache.UserCacheImpl;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideUserCacheFactory implements Factory<UserCache> {
  private final ApplicationModule module;
  private final Provider<UserCacheImpl> userCacheProvider;

  public ApplicationModule_ProvideUserCacheFactory(ApplicationModule module, Provider<UserCacheImpl> userCacheProvider) {  
    assert module != null;
    this.module = module;
    assert userCacheProvider != null;
    this.userCacheProvider = userCacheProvider;
  }

  @Override
  public UserCache get() {  
    UserCache provided = module.provideUserCache(userCacheProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<UserCache> create(ApplicationModule module, Provider<UserCacheImpl> userCacheProvider) {  
    return new ApplicationModule_ProvideUserCacheFactory(module, userCacheProvider);
  }
}


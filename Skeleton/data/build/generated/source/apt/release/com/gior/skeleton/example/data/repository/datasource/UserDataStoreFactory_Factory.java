package com.gior.skeleton.example.data.repository.datasource;

import android.content.Context;
import com.gior.skeleton.example.data.cache.UserCache;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UserDataStoreFactory_Factory implements Factory<UserDataStoreFactory> {
  private final Provider<Context> contextProvider;
  private final Provider<UserCache> userCacheProvider;

  public UserDataStoreFactory_Factory(Provider<Context> contextProvider, Provider<UserCache> userCacheProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert userCacheProvider != null;
    this.userCacheProvider = userCacheProvider;
  }

  @Override
  public UserDataStoreFactory get() {  
    return new UserDataStoreFactory(contextProvider.get(), userCacheProvider.get());
  }

  public static Factory<UserDataStoreFactory> create(Provider<Context> contextProvider, Provider<UserCache> userCacheProvider) {  
    return new UserDataStoreFactory_Factory(contextProvider, userCacheProvider);
  }
}


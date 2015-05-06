package com.gior.skeleton.example.data.cache;

import android.content.Context;
import com.gior.skeleton.example.data.cache.serializer.JsonSerializer;
import com.gior.skeleton.example.domain.executor.ThreadExecutor;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UserCacheImpl_Factory implements Factory<UserCacheImpl> {
  private final Provider<Context> contextProvider;
  private final Provider<JsonSerializer> userCacheSerializerProvider;
  private final Provider<FileManager> fileManagerProvider;
  private final Provider<ThreadExecutor> executorProvider;

  public UserCacheImpl_Factory(Provider<Context> contextProvider, Provider<JsonSerializer> userCacheSerializerProvider, Provider<FileManager> fileManagerProvider, Provider<ThreadExecutor> executorProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert userCacheSerializerProvider != null;
    this.userCacheSerializerProvider = userCacheSerializerProvider;
    assert fileManagerProvider != null;
    this.fileManagerProvider = fileManagerProvider;
    assert executorProvider != null;
    this.executorProvider = executorProvider;
  }

  @Override
  public UserCacheImpl get() {  
    return new UserCacheImpl(contextProvider.get(), userCacheSerializerProvider.get(), fileManagerProvider.get(), executorProvider.get());
  }

  public static Factory<UserCacheImpl> create(Provider<Context> contextProvider, Provider<JsonSerializer> userCacheSerializerProvider, Provider<FileManager> fileManagerProvider, Provider<ThreadExecutor> executorProvider) {  
    return new UserCacheImpl_Factory(contextProvider, userCacheSerializerProvider, fileManagerProvider, executorProvider);
  }
}


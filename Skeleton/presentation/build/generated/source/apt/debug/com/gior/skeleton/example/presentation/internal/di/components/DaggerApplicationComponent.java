package com.gior.skeleton.example.presentation.internal.di.components;

import android.content.Context;
import com.gior.skeleton.example.data.cache.FileManager;
import com.gior.skeleton.example.data.cache.FileManager_Factory;
import com.gior.skeleton.example.data.cache.UserCache;
import com.gior.skeleton.example.data.cache.UserCacheImpl;
import com.gior.skeleton.example.data.cache.UserCacheImpl_Factory;
import com.gior.skeleton.example.data.cache.serializer.JsonSerializer;
import com.gior.skeleton.example.data.cache.serializer.JsonSerializer_Factory;
import com.gior.skeleton.example.data.entity.mapper.UserEntityDataMapper;
import com.gior.skeleton.example.data.entity.mapper.UserEntityDataMapper_Factory;
import com.gior.skeleton.example.data.executor.JobExecutor;
import com.gior.skeleton.example.data.executor.JobExecutor_Factory;
import com.gior.skeleton.example.data.repository.UserDataRepository;
import com.gior.skeleton.example.data.repository.UserDataRepository_Factory;
import com.gior.skeleton.example.data.repository.datasource.UserDataStoreFactory;
import com.gior.skeleton.example.data.repository.datasource.UserDataStoreFactory_Factory;
import com.gior.skeleton.example.domain.executor.PostExecutionThread;
import com.gior.skeleton.example.domain.executor.ThreadExecutor;
import com.gior.skeleton.example.domain.repository.UserRepository;
import com.gior.skeleton.example.presentation.UIThread;
import com.gior.skeleton.example.presentation.UIThread_Factory;
import com.gior.skeleton.example.presentation.internal.di.modules.ApplicationModule;
import com.gior.skeleton.example.presentation.internal.di.modules.ApplicationModule_ProvideApplicationContextFactory;
import com.gior.skeleton.example.presentation.internal.di.modules.ApplicationModule_ProvideNavigatorFactory;
import com.gior.skeleton.example.presentation.internal.di.modules.ApplicationModule_ProvidePostExecutionThreadFactory;
import com.gior.skeleton.example.presentation.internal.di.modules.ApplicationModule_ProvideThreadExecutorFactory;
import com.gior.skeleton.example.presentation.internal.di.modules.ApplicationModule_ProvideUserCacheFactory;
import com.gior.skeleton.example.presentation.internal.di.modules.ApplicationModule_ProvideUserRepositoryFactory;
import com.gior.skeleton.example.presentation.navigation.Navigator;
import com.gior.skeleton.example.presentation.view.activity.BaseActivity;
import com.gior.skeleton.example.presentation.view.activity.BaseActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Navigator> provideNavigatorProvider;
  private MembersInjector<BaseActivity> baseActivityMembersInjector;
  private Provider<Context> provideApplicationContextProvider;
  private Provider<JobExecutor> jobExecutorProvider;
  private Provider<ThreadExecutor> provideThreadExecutorProvider;
  private Provider<UIThread> uIThreadProvider;
  private Provider<PostExecutionThread> providePostExecutionThreadProvider;
  private Provider<JsonSerializer> jsonSerializerProvider;
  private Provider<FileManager> fileManagerProvider;
  private Provider<UserCacheImpl> userCacheImplProvider;
  private Provider<UserCache> provideUserCacheProvider;
  private Provider<UserDataStoreFactory> userDataStoreFactoryProvider;
  private Provider<UserEntityDataMapper> userEntityDataMapperProvider;
  private Provider<UserDataRepository> userDataRepositoryProvider;
  private Provider<UserRepository> provideUserRepositoryProvider;

  private DaggerApplicationComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideNavigatorProvider = ScopedProvider.create(ApplicationModule_ProvideNavigatorFactory.create(builder.applicationModule));
    this.baseActivityMembersInjector = BaseActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideNavigatorProvider);
    this.provideApplicationContextProvider = ScopedProvider.create(ApplicationModule_ProvideApplicationContextFactory.create(builder.applicationModule));
    this.jobExecutorProvider = ScopedProvider.create(JobExecutor_Factory.create());
    this.provideThreadExecutorProvider = ScopedProvider.create(ApplicationModule_ProvideThreadExecutorFactory.create(builder.applicationModule, jobExecutorProvider));
    this.uIThreadProvider = ScopedProvider.create(UIThread_Factory.create());
    this.providePostExecutionThreadProvider = ScopedProvider.create(ApplicationModule_ProvidePostExecutionThreadFactory.create(builder.applicationModule, uIThreadProvider));
    this.jsonSerializerProvider = ScopedProvider.create(JsonSerializer_Factory.create());
    this.fileManagerProvider = ScopedProvider.create(FileManager_Factory.create());
    this.userCacheImplProvider = ScopedProvider.create(UserCacheImpl_Factory.create(provideApplicationContextProvider, jsonSerializerProvider, fileManagerProvider, provideThreadExecutorProvider));
    this.provideUserCacheProvider = ScopedProvider.create(ApplicationModule_ProvideUserCacheFactory.create(builder.applicationModule, userCacheImplProvider));
    this.userDataStoreFactoryProvider = ScopedProvider.create(UserDataStoreFactory_Factory.create(provideApplicationContextProvider, provideUserCacheProvider));
    this.userEntityDataMapperProvider = ScopedProvider.create(UserEntityDataMapper_Factory.create());
    this.userDataRepositoryProvider = ScopedProvider.create(UserDataRepository_Factory.create(userDataStoreFactoryProvider, userEntityDataMapperProvider));
    this.provideUserRepositoryProvider = ScopedProvider.create(ApplicationModule_ProvideUserRepositoryFactory.create(builder.applicationModule, userDataRepositoryProvider));
  }

  @Override
  public void inject(BaseActivity baseActivity) {  
    baseActivityMembersInjector.injectMembers(baseActivity);
  }

  @Override
  public Context context() {  
    return provideApplicationContextProvider.get();
  }

  @Override
  public ThreadExecutor threadExecutor() {  
    return provideThreadExecutorProvider.get();
  }

  @Override
  public PostExecutionThread postExecutionThread() {  
    return providePostExecutionThreadProvider.get();
  }

  @Override
  public UserRepository userRepository() {  
    return provideUserRepositoryProvider.get();
  }

  public static final class Builder {
    private ApplicationModule applicationModule;
  
    private Builder() {  
    }
  
    public ApplicationComponent build() {  
      if (applicationModule == null) {
        throw new IllegalStateException("applicationModule must be set");
      }
      return new DaggerApplicationComponent(this);
    }
  
    public Builder applicationModule(ApplicationModule applicationModule) {  
      if (applicationModule == null) {
        throw new NullPointerException("applicationModule");
      }
      this.applicationModule = applicationModule;
      return this;
    }
  }
}


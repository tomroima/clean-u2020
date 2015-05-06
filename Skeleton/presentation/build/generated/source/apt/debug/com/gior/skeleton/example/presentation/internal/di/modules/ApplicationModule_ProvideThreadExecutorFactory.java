package com.gior.skeleton.example.presentation.internal.di.modules;

import com.gior.skeleton.example.data.executor.JobExecutor;
import com.gior.skeleton.example.domain.executor.ThreadExecutor;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideThreadExecutorFactory implements Factory<ThreadExecutor> {
  private final ApplicationModule module;
  private final Provider<JobExecutor> jobExecutorProvider;

  public ApplicationModule_ProvideThreadExecutorFactory(ApplicationModule module, Provider<JobExecutor> jobExecutorProvider) {  
    assert module != null;
    this.module = module;
    assert jobExecutorProvider != null;
    this.jobExecutorProvider = jobExecutorProvider;
  }

  @Override
  public ThreadExecutor get() {  
    ThreadExecutor provided = module.provideThreadExecutor(jobExecutorProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ThreadExecutor> create(ApplicationModule module, Provider<JobExecutor> jobExecutorProvider) {  
    return new ApplicationModule_ProvideThreadExecutorFactory(module, jobExecutorProvider);
  }
}


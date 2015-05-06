package com.gior.skeleton.example.presentation.internal.di.modules;

import com.gior.skeleton.example.domain.executor.PostExecutionThread;
import com.gior.skeleton.example.domain.executor.ThreadExecutor;
import com.gior.skeleton.example.domain.interactor.UseCase;
import com.gior.skeleton.example.domain.repository.UserRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UserModule_ProvideGetUserDetailsUseCaseFactory implements Factory<UseCase> {
  private final UserModule module;
  private final Provider<UserRepository> userRepositoryProvider;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;

  public UserModule_ProvideGetUserDetailsUseCaseFactory(UserModule module, Provider<UserRepository> userRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider) {  
    assert module != null;
    this.module = module;
    assert userRepositoryProvider != null;
    this.userRepositoryProvider = userRepositoryProvider;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
  }

  @Override
  public UseCase get() {  
    UseCase provided = module.provideGetUserDetailsUseCase(userRepositoryProvider.get(), threadExecutorProvider.get(), postExecutionThreadProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<UseCase> create(UserModule module, Provider<UserRepository> userRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider) {  
    return new UserModule_ProvideGetUserDetailsUseCaseFactory(module, userRepositoryProvider, threadExecutorProvider, postExecutionThreadProvider);
  }
}


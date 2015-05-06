package com.gior.skeleton.example.domain.interactor;

import com.gior.skeleton.example.domain.executor.PostExecutionThread;
import com.gior.skeleton.example.domain.executor.ThreadExecutor;
import com.gior.skeleton.example.domain.repository.UserRepository;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GetUserDetailsUseCase_Factory implements Factory<GetUserDetailsUseCase> {
  private final MembersInjector<GetUserDetailsUseCase> membersInjector;
  private final Provider<Integer> userIdProvider;
  private final Provider<UserRepository> userRepositoryProvider;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;

  public GetUserDetailsUseCase_Factory(MembersInjector<GetUserDetailsUseCase> membersInjector, Provider<Integer> userIdProvider, Provider<UserRepository> userRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert userIdProvider != null;
    this.userIdProvider = userIdProvider;
    assert userRepositoryProvider != null;
    this.userRepositoryProvider = userRepositoryProvider;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
  }

  @Override
  public GetUserDetailsUseCase get() {  
    GetUserDetailsUseCase instance = new GetUserDetailsUseCase(userIdProvider.get(), userRepositoryProvider.get(), threadExecutorProvider.get(), postExecutionThreadProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<GetUserDetailsUseCase> create(MembersInjector<GetUserDetailsUseCase> membersInjector, Provider<Integer> userIdProvider, Provider<UserRepository> userRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider) {  
    return new GetUserDetailsUseCase_Factory(membersInjector, userIdProvider, userRepositoryProvider, threadExecutorProvider, postExecutionThreadProvider);
  }
}


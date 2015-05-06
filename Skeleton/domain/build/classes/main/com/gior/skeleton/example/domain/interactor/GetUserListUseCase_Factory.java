package com.gior.skeleton.example.domain.interactor;

import com.gior.skeleton.example.domain.executor.PostExecutionThread;
import com.gior.skeleton.example.domain.executor.ThreadExecutor;
import com.gior.skeleton.example.domain.repository.UserRepository;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GetUserListUseCase_Factory implements Factory<GetUserListUseCase> {
  private final MembersInjector<GetUserListUseCase> membersInjector;
  private final Provider<UserRepository> userRepositoryProvider;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;

  public GetUserListUseCase_Factory(MembersInjector<GetUserListUseCase> membersInjector, Provider<UserRepository> userRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert userRepositoryProvider != null;
    this.userRepositoryProvider = userRepositoryProvider;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
  }

  @Override
  public GetUserListUseCase get() {  
    GetUserListUseCase instance = new GetUserListUseCase(userRepositoryProvider.get(), threadExecutorProvider.get(), postExecutionThreadProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<GetUserListUseCase> create(MembersInjector<GetUserListUseCase> membersInjector, Provider<UserRepository> userRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider) {  
    return new GetUserListUseCase_Factory(membersInjector, userRepositoryProvider, threadExecutorProvider, postExecutionThreadProvider);
  }
}


package com.gior.skeleton.example.presentation.internal.di.modules;

import com.gior.skeleton.example.domain.interactor.GetUserListUseCase;
import com.gior.skeleton.example.domain.interactor.UseCase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UserModule_ProvideGetUserListUseCaseFactory implements Factory<UseCase> {
  private final UserModule module;
  private final Provider<GetUserListUseCase> getUserListUseCaseProvider;

  public UserModule_ProvideGetUserListUseCaseFactory(UserModule module, Provider<GetUserListUseCase> getUserListUseCaseProvider) {  
    assert module != null;
    this.module = module;
    assert getUserListUseCaseProvider != null;
    this.getUserListUseCaseProvider = getUserListUseCaseProvider;
  }

  @Override
  public UseCase get() {  
    UseCase provided = module.provideGetUserListUseCase(getUserListUseCaseProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<UseCase> create(UserModule module, Provider<GetUserListUseCase> getUserListUseCaseProvider) {  
    return new UserModule_ProvideGetUserListUseCaseFactory(module, getUserListUseCaseProvider);
  }
}


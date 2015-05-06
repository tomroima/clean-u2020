package com.gior.skeleton.example.presentation.internal.di.modules;

import com.gior.skeleton.example.data.repository.UserDataRepository;
import com.gior.skeleton.example.domain.repository.UserRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideUserRepositoryFactory implements Factory<UserRepository> {
  private final ApplicationModule module;
  private final Provider<UserDataRepository> userDataRepositoryProvider;

  public ApplicationModule_ProvideUserRepositoryFactory(ApplicationModule module, Provider<UserDataRepository> userDataRepositoryProvider) {  
    assert module != null;
    this.module = module;
    assert userDataRepositoryProvider != null;
    this.userDataRepositoryProvider = userDataRepositoryProvider;
  }

  @Override
  public UserRepository get() {  
    UserRepository provided = module.provideUserRepository(userDataRepositoryProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<UserRepository> create(ApplicationModule module, Provider<UserDataRepository> userDataRepositoryProvider) {  
    return new ApplicationModule_ProvideUserRepositoryFactory(module, userDataRepositoryProvider);
  }
}


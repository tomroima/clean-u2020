package com.gior.skeleton.example.presentation.presenter;

import com.gior.skeleton.example.domain.interactor.UseCase;
import com.gior.skeleton.example.presentation.mapper.UserModelDataMapper;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UserDetailsPresenter_Factory implements Factory<UserDetailsPresenter> {
  private final MembersInjector<UserDetailsPresenter> membersInjector;
  private final Provider<UseCase> getUserDetailsUseCaseProvider;
  private final Provider<UserModelDataMapper> userModelDataMapperProvider;

  public UserDetailsPresenter_Factory(MembersInjector<UserDetailsPresenter> membersInjector, Provider<UseCase> getUserDetailsUseCaseProvider, Provider<UserModelDataMapper> userModelDataMapperProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert getUserDetailsUseCaseProvider != null;
    this.getUserDetailsUseCaseProvider = getUserDetailsUseCaseProvider;
    assert userModelDataMapperProvider != null;
    this.userModelDataMapperProvider = userModelDataMapperProvider;
  }

  @Override
  public UserDetailsPresenter get() {  
    UserDetailsPresenter instance = new UserDetailsPresenter(getUserDetailsUseCaseProvider.get(), userModelDataMapperProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<UserDetailsPresenter> create(MembersInjector<UserDetailsPresenter> membersInjector, Provider<UseCase> getUserDetailsUseCaseProvider, Provider<UserModelDataMapper> userModelDataMapperProvider) {  
    return new UserDetailsPresenter_Factory(membersInjector, getUserDetailsUseCaseProvider, userModelDataMapperProvider);
  }
}


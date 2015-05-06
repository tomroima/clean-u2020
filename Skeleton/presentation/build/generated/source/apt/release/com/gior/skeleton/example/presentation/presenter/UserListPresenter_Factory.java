package com.gior.skeleton.example.presentation.presenter;

import com.gior.skeleton.example.domain.interactor.UseCase;
import com.gior.skeleton.example.presentation.mapper.UserModelDataMapper;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UserListPresenter_Factory implements Factory<UserListPresenter> {
  private final MembersInjector<UserListPresenter> membersInjector;
  private final Provider<UseCase> getUserListUserCaseProvider;
  private final Provider<UserModelDataMapper> userModelDataMapperProvider;

  public UserListPresenter_Factory(MembersInjector<UserListPresenter> membersInjector, Provider<UseCase> getUserListUserCaseProvider, Provider<UserModelDataMapper> userModelDataMapperProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert getUserListUserCaseProvider != null;
    this.getUserListUserCaseProvider = getUserListUserCaseProvider;
    assert userModelDataMapperProvider != null;
    this.userModelDataMapperProvider = userModelDataMapperProvider;
  }

  @Override
  public UserListPresenter get() {  
    UserListPresenter instance = new UserListPresenter(getUserListUserCaseProvider.get(), userModelDataMapperProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<UserListPresenter> create(MembersInjector<UserListPresenter> membersInjector, Provider<UseCase> getUserListUserCaseProvider, Provider<UserModelDataMapper> userModelDataMapperProvider) {  
    return new UserListPresenter_Factory(membersInjector, getUserListUserCaseProvider, userModelDataMapperProvider);
  }
}


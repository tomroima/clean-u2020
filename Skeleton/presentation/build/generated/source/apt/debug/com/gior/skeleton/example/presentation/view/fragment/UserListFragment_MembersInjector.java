package com.gior.skeleton.example.presentation.view.fragment;

import com.gior.skeleton.example.presentation.presenter.UserListPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UserListFragment_MembersInjector implements MembersInjector<UserListFragment> {
  private final MembersInjector<BaseFragment> supertypeInjector;
  private final Provider<UserListPresenter> userListPresenterProvider;

  public UserListFragment_MembersInjector(MembersInjector<BaseFragment> supertypeInjector, Provider<UserListPresenter> userListPresenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert userListPresenterProvider != null;
    this.userListPresenterProvider = userListPresenterProvider;
  }

  @Override
  public void injectMembers(UserListFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.userListPresenter = userListPresenterProvider.get();
  }

  public static MembersInjector<UserListFragment> create(MembersInjector<BaseFragment> supertypeInjector, Provider<UserListPresenter> userListPresenterProvider) {  
      return new UserListFragment_MembersInjector(supertypeInjector, userListPresenterProvider);
  }
}


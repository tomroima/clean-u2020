package com.gior.skeleton.example.presentation.view.fragment;

import com.gior.skeleton.example.presentation.presenter.UserDetailsPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UserDetailsFragment_MembersInjector implements MembersInjector<UserDetailsFragment> {
  private final MembersInjector<BaseFragment> supertypeInjector;
  private final Provider<UserDetailsPresenter> userDetailsPresenterProvider;

  public UserDetailsFragment_MembersInjector(MembersInjector<BaseFragment> supertypeInjector, Provider<UserDetailsPresenter> userDetailsPresenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert userDetailsPresenterProvider != null;
    this.userDetailsPresenterProvider = userDetailsPresenterProvider;
  }

  @Override
  public void injectMembers(UserDetailsFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.userDetailsPresenter = userDetailsPresenterProvider.get();
  }

  public static MembersInjector<UserDetailsFragment> create(MembersInjector<BaseFragment> supertypeInjector, Provider<UserDetailsPresenter> userDetailsPresenterProvider) {  
      return new UserDetailsFragment_MembersInjector(supertypeInjector, userDetailsPresenterProvider);
  }
}


package com.gior.skeleton.example.presentation.internal.di.components;

import android.app.Activity;
import com.gior.skeleton.example.domain.executor.PostExecutionThread;
import com.gior.skeleton.example.domain.executor.ThreadExecutor;
import com.gior.skeleton.example.domain.interactor.GetUserListUseCase;
import com.gior.skeleton.example.domain.interactor.GetUserListUseCase_Factory;
import com.gior.skeleton.example.domain.interactor.UseCase;
import com.gior.skeleton.example.domain.repository.UserRepository;
import com.gior.skeleton.example.presentation.internal.di.modules.ActivityModule;
import com.gior.skeleton.example.presentation.internal.di.modules.ActivityModule_ActivityFactory;
import com.gior.skeleton.example.presentation.internal.di.modules.UserModule;
import com.gior.skeleton.example.presentation.internal.di.modules.UserModule_ProvideGetUserDetailsUseCaseFactory;
import com.gior.skeleton.example.presentation.internal.di.modules.UserModule_ProvideGetUserListUseCaseFactory;
import com.gior.skeleton.example.presentation.mapper.UserModelDataMapper;
import com.gior.skeleton.example.presentation.mapper.UserModelDataMapper_Factory;
import com.gior.skeleton.example.presentation.presenter.UserDetailsPresenter;
import com.gior.skeleton.example.presentation.presenter.UserDetailsPresenter_Factory;
import com.gior.skeleton.example.presentation.presenter.UserListPresenter;
import com.gior.skeleton.example.presentation.presenter.UserListPresenter_Factory;
import com.gior.skeleton.example.presentation.view.fragment.UserDetailsFragment;
import com.gior.skeleton.example.presentation.view.fragment.UserDetailsFragment_MembersInjector;
import com.gior.skeleton.example.presentation.view.fragment.UserListFragment;
import com.gior.skeleton.example.presentation.view.fragment.UserListFragment_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerUserComponent implements UserComponent {
  private Provider<Activity> activityProvider;
  private Provider<UserRepository> userRepositoryProvider;
  private Provider<ThreadExecutor> threadExecutorProvider;
  private Provider<PostExecutionThread> postExecutionThreadProvider;
  private Provider<GetUserListUseCase> getUserListUseCaseProvider;
  private Provider<UseCase> provideGetUserListUseCaseProvider;
  private Provider<UserModelDataMapper> userModelDataMapperProvider;
  private Provider<UserListPresenter> userListPresenterProvider;
  private MembersInjector<UserListFragment> userListFragmentMembersInjector;
  private Provider<UseCase> provideGetUserDetailsUseCaseProvider;
  private Provider<UserDetailsPresenter> userDetailsPresenterProvider;
  private MembersInjector<UserDetailsFragment> userDetailsFragmentMembersInjector;

  private DaggerUserComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.activityProvider = ScopedProvider.create(ActivityModule_ActivityFactory.create(builder.activityModule));
    this.userRepositoryProvider = new Factory<UserRepository>() {
      @Override public UserRepository get() {
        UserRepository provided = builder.applicationComponent.userRepository();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.threadExecutorProvider = new Factory<ThreadExecutor>() {
      @Override public ThreadExecutor get() {
        ThreadExecutor provided = builder.applicationComponent.threadExecutor();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.postExecutionThreadProvider = new Factory<PostExecutionThread>() {
      @Override public PostExecutionThread get() {
        PostExecutionThread provided = builder.applicationComponent.postExecutionThread();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.getUserListUseCaseProvider = GetUserListUseCase_Factory.create((MembersInjector) MembersInjectors.noOp(), userRepositoryProvider, threadExecutorProvider, postExecutionThreadProvider);
    this.provideGetUserListUseCaseProvider = ScopedProvider.create(UserModule_ProvideGetUserListUseCaseFactory.create(builder.userModule, getUserListUseCaseProvider));
    this.userModelDataMapperProvider = ScopedProvider.create(UserModelDataMapper_Factory.create());
    this.userListPresenterProvider = ScopedProvider.create(UserListPresenter_Factory.create((MembersInjector) MembersInjectors.noOp(), provideGetUserListUseCaseProvider, userModelDataMapperProvider));
    this.userListFragmentMembersInjector = UserListFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), userListPresenterProvider);
    this.provideGetUserDetailsUseCaseProvider = ScopedProvider.create(UserModule_ProvideGetUserDetailsUseCaseFactory.create(builder.userModule, userRepositoryProvider, threadExecutorProvider, postExecutionThreadProvider));
    this.userDetailsPresenterProvider = ScopedProvider.create(UserDetailsPresenter_Factory.create((MembersInjector) MembersInjectors.noOp(), provideGetUserDetailsUseCaseProvider, userModelDataMapperProvider));
    this.userDetailsFragmentMembersInjector = UserDetailsFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), userDetailsPresenterProvider);
  }

  @Override
  public Activity activity() {  
    return activityProvider.get();
  }

  @Override
  public void inject(UserListFragment userListFragment) {  
    userListFragmentMembersInjector.injectMembers(userListFragment);
  }

  @Override
  public void inject(UserDetailsFragment userDetailsFragment) {  
    userDetailsFragmentMembersInjector.injectMembers(userDetailsFragment);
  }

  public static final class Builder {
    private ActivityModule activityModule;
    private UserModule userModule;
    private ApplicationComponent applicationComponent;
  
    private Builder() {  
    }
  
    public UserComponent build() {  
      if (activityModule == null) {
        throw new IllegalStateException("activityModule must be set");
      }
      if (userModule == null) {
        this.userModule = new UserModule();
      }
      if (applicationComponent == null) {
        throw new IllegalStateException("applicationComponent must be set");
      }
      return new DaggerUserComponent(this);
    }
  
    public Builder activityModule(ActivityModule activityModule) {  
      if (activityModule == null) {
        throw new NullPointerException("activityModule");
      }
      this.activityModule = activityModule;
      return this;
    }
  
    public Builder userModule(UserModule userModule) {  
      if (userModule == null) {
        throw new NullPointerException("userModule");
      }
      this.userModule = userModule;
      return this;
    }
  
    public Builder applicationComponent(ApplicationComponent applicationComponent) {  
      if (applicationComponent == null) {
        throw new NullPointerException("applicationComponent");
      }
      this.applicationComponent = applicationComponent;
      return this;
    }
  }
}


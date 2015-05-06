package com.gior.skeleton.example.presentation.internal.di.components;

import android.app.Activity;
import com.gior.skeleton.example.presentation.internal.di.modules.ActivityModule;
import com.gior.skeleton.example.presentation.internal.di.modules.ActivityModule_ActivityFactory;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<Activity> activityProvider;

  private DaggerActivityComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.activityProvider = ScopedProvider.create(ActivityModule_ActivityFactory.create(builder.activityModule));
  }

  @Override
  public Activity activity() {  
    return activityProvider.get();
  }

  public static final class Builder {
    private ActivityModule activityModule;
    private ApplicationComponent applicationComponent;
  
    private Builder() {  
    }
  
    public ActivityComponent build() {  
      if (activityModule == null) {
        throw new IllegalStateException("activityModule must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException("applicationComponent must be set");
      }
      return new DaggerActivityComponent(this);
    }
  
    public Builder activityModule(ActivityModule activityModule) {  
      if (activityModule == null) {
        throw new NullPointerException("activityModule");
      }
      this.activityModule = activityModule;
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


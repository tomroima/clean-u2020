// Generated code from Butter Knife. Do not modify!
package com.gior.skeleton.example.presentation.view.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.gior.skeleton.example.presentation.view.activity.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165184, "field 'btn_LoadData' and method 'navigateToUserList'");
    target.btn_LoadData = finder.castView(view, 2131165184, "field 'btn_LoadData'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.navigateToUserList();
        }
      });
  }

  @Override public void reset(T target) {
    target.btn_LoadData = null;
  }
}

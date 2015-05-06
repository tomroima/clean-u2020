// Generated code from Butter Knife. Do not modify!
package com.gior.skeleton.example.presentation.view.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class UserListFragment$$ViewInjector<T extends com.gior.skeleton.example.presentation.view.fragment.UserListFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165187, "field 'rv_users'");
    target.rv_users = finder.castView(view, 2131165187, "field 'rv_users'");
    view = finder.findRequiredView(source, 2131165190, "field 'rl_progress'");
    target.rl_progress = finder.castView(view, 2131165190, "field 'rl_progress'");
    view = finder.findRequiredView(source, 2131165191, "field 'rl_retry'");
    target.rl_retry = finder.castView(view, 2131165191, "field 'rl_retry'");
    view = finder.findRequiredView(source, 2131165192, "field 'bt_retry' and method 'onButtonRetryClick'");
    target.bt_retry = finder.castView(view, 2131165192, "field 'bt_retry'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onButtonRetryClick();
        }
      });
  }

  @Override public void reset(T target) {
    target.rv_users = null;
    target.rl_progress = null;
    target.rl_retry = null;
    target.bt_retry = null;
  }
}

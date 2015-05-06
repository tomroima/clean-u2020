// Generated code from Butter Knife. Do not modify!
package com.gior.skeleton.example.presentation.view.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class UserDetailsFragment$$ViewInjector<T extends com.gior.skeleton.example.presentation.view.fragment.UserDetailsFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165193, "field 'iv_cover'");
    target.iv_cover = finder.castView(view, 2131165193, "field 'iv_cover'");
    view = finder.findRequiredView(source, 2131165194, "field 'tv_fullname'");
    target.tv_fullname = finder.castView(view, 2131165194, "field 'tv_fullname'");
    view = finder.findRequiredView(source, 2131165195, "field 'tv_email'");
    target.tv_email = finder.castView(view, 2131165195, "field 'tv_email'");
    view = finder.findRequiredView(source, 2131165196, "field 'tv_followers'");
    target.tv_followers = finder.castView(view, 2131165196, "field 'tv_followers'");
    view = finder.findRequiredView(source, 2131165197, "field 'tv_description'");
    target.tv_description = finder.castView(view, 2131165197, "field 'tv_description'");
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
    target.iv_cover = null;
    target.tv_fullname = null;
    target.tv_email = null;
    target.tv_followers = null;
    target.tv_description = null;
    target.rl_progress = null;
    target.rl_retry = null;
    target.bt_retry = null;
  }
}

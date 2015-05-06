// Generated code from Butter Knife. Do not modify!
package com.gior.skeleton.example.presentation.view.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class UsersAdapter$UserViewHolder$$ViewInjector<T extends com.gior.skeleton.example.presentation.view.adapter.UsersAdapter.UserViewHolder> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165189, "field 'textViewTitle'");
    target.textViewTitle = finder.castView(view, 2131165189, "field 'textViewTitle'");
  }

  @Override public void reset(T target) {
    target.textViewTitle = null;
  }
}

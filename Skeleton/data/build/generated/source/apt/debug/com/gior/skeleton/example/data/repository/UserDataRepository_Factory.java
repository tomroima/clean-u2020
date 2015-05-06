package com.gior.skeleton.example.data.repository;

import com.gior.skeleton.example.data.entity.mapper.UserEntityDataMapper;
import com.gior.skeleton.example.data.repository.datasource.UserDataStoreFactory;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UserDataRepository_Factory implements Factory<UserDataRepository> {
  private final Provider<UserDataStoreFactory> dataStoreFactoryProvider;
  private final Provider<UserEntityDataMapper> userEntityDataMapperProvider;

  public UserDataRepository_Factory(Provider<UserDataStoreFactory> dataStoreFactoryProvider, Provider<UserEntityDataMapper> userEntityDataMapperProvider) {  
    assert dataStoreFactoryProvider != null;
    this.dataStoreFactoryProvider = dataStoreFactoryProvider;
    assert userEntityDataMapperProvider != null;
    this.userEntityDataMapperProvider = userEntityDataMapperProvider;
  }

  @Override
  public UserDataRepository get() {  
    return new UserDataRepository(dataStoreFactoryProvider.get(), userEntityDataMapperProvider.get());
  }

  public static Factory<UserDataRepository> create(Provider<UserDataStoreFactory> dataStoreFactoryProvider, Provider<UserEntityDataMapper> userEntityDataMapperProvider) {  
    return new UserDataRepository_Factory(dataStoreFactoryProvider, userEntityDataMapperProvider);
  }
}


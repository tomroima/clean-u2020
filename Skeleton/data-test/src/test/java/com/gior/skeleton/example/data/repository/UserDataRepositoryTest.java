/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gior.skeleton.example.data.repository;

import com.gior.skeleton.example.data.ApplicationTestCase;
import com.gior.skeleton.example.data.entity.UserEntity;
import com.gior.skeleton.example.data.entity.mapper.UserEntityDataMapper;
import com.gior.skeleton.example.data.repository.datasource.UserDataStore;
import com.gior.skeleton.example.data.repository.datasource.UserDataStoreFactory;
import com.gior.skeleton.example.domain.User;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import rx.Observable;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;

public class UserDataRepositoryTest extends ApplicationTestCase {

  private static final int FAKE_USER_ID = 123;

  private UserDataRepository userDataRepository;

  @Mock private UserDataStoreFactory mockUserDataStoreFactory;
  @Mock private UserEntityDataMapper mockUserEntityDataMapper;
  @Mock private UserDataStore mockUserDataStore;
  @Mock private UserEntity mockUserEntity;
  @Mock private User mockUser;

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    resetSingleton(UserDataRepository.class);
    userDataRepository = new UserDataRepository(mockUserDataStoreFactory,
        mockUserEntityDataMapper);

    given(mockUserDataStoreFactory.create(anyInt())).willReturn(mockUserDataStore);
    given(mockUserDataStoreFactory.createCloudDataStore()).willReturn(mockUserDataStore);
  }

  @Test
  public void testGetUsersHappyCase() {
    List<UserEntity> usersList = new ArrayList<>();
    usersList.add(new UserEntity());
    given(mockUserDataStore.getUserEntityList()).willReturn(Observable.just(usersList));

    userDataRepository.getUsers();

    verify(mockUserDataStoreFactory).createCloudDataStore();
    verify(mockUserDataStore).getUserEntityList();
  }

  @Test
  public void testGetUserHappyCase() {
    UserEntity userEntity = new UserEntity();
    given(mockUserDataStore.getUserEntityDetails(FAKE_USER_ID)).willReturn(Observable.just(userEntity));
    userDataRepository.getUser(FAKE_USER_ID);

    verify(mockUserDataStoreFactory).create(FAKE_USER_ID);
    verify(mockUserDataStore).getUserEntityDetails(FAKE_USER_ID);
  }
}

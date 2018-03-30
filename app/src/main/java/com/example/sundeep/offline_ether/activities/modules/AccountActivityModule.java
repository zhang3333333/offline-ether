package com.example.sundeep.offline_ether.activities.modules;

import com.example.sundeep.offline_ether.activities.AccountActivity;
import com.example.sundeep.offline_ether.api.ether.EtherApi;
import com.example.sundeep.offline_ether.entities.EtherAddress;
import com.example.sundeep.offline_ether.mvc.presenters.AccountPresenter;
import com.example.sundeep.offline_ether.mvc.views.AccountView;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import io.objectbox.BoxStore;

@Module
public abstract class AccountActivityModule {

    @Provides
    static AccountPresenter provideAccountPresenter(AccountView mainView, EtherApi etherApi, BoxStore boxStore) {
        return new AccountPresenter(mainView, boxStore.boxFor(EtherAddress.class), etherApi);
    }

    @Binds
    abstract AccountView provideMainView(AccountActivity mainActivity);

}

package com.example.sundeep.offline_ether.activities.modules;

import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;

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

    @Provides
    static LinearLayoutManager provideLinearLayoutManager(AccountActivity accountActivity) {
        return new LinearLayoutManager(accountActivity);
    }

    @Provides
    static DividerItemDecoration provideDividerItemDecoration(AccountActivity accountActivity, LinearLayoutManager linearLayoutManager) {
        return new DividerItemDecoration(accountActivity, linearLayoutManager.getOrientation());
    }

    @Binds
    abstract AccountView provideMainView(AccountActivity mainActivity);

}

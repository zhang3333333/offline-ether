package com.example.sundeep.offline_ether.di;

import com.example.sundeep.offline_ether.fragments.BalanceCurrencyFragment;
import com.example.sundeep.offline_ether.fragments.BalanceEtherFragment;
import com.example.sundeep.offline_ether.fragments.modules.BalanceCurrencyFragmentModule;
import com.example.sundeep.offline_ether.fragments.modules.BalanceEtherFragmentModule;
import com.example.sundeep.offline_ether.fragments.modules.BalancePresenterModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuilder {

    @PerChildFragment
    @ContributesAndroidInjector(modules = {BalanceEtherFragmentModule.class, BalancePresenterModule.class})
    abstract BalanceEtherFragment balanceEtherFragmentInjector();

    @PerChildFragment
    @ContributesAndroidInjector(modules = {BalanceCurrencyFragmentModule.class, BalancePresenterModule.class})
    abstract BalanceCurrencyFragment balanceCurrencyFragmentInjector();

}

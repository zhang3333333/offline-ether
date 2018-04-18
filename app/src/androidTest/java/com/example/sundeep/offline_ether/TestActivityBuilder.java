package com.example.sundeep.offline_ether;

import com.example.sundeep.offline_ether.activities.AddressScannerActivity;
import com.example.sundeep.offline_ether.activities.MainActivity;
import com.example.sundeep.offline_ether.activities.modules.AddressScannerModule;
import com.example.sundeep.offline_ether.activities.modules.MainActivityModule;
import com.example.sundeep.offline_ether.activities.modules.MainFragmentModule;
import com.example.sundeep.offline_ether.di.PerActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class TestActivityBuilder {

    @PerActivity
    @ContributesAndroidInjector(modules = { MainActivityModule.class, MainFragmentModule.class })
    abstract MainActivity bindMainActivity();

    @PerActivity
    @ContributesAndroidInjector(modules = { AddressScannerModule.class })
    abstract AddressScannerActivity bindAddressScannerActivity();

}
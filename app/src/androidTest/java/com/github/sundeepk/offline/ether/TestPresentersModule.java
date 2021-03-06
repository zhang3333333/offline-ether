package com.github.sundeepk.offline.ether;

import com.github.sundeepk.offline.ether.mvc.presenters.AccountPresenter;
import com.github.sundeepk.offline.ether.mvc.presenters.BalanceCurrencyPresenter;
import com.github.sundeepk.offline.ether.mvc.presenters.BalanceEtherPresenter;
import com.github.sundeepk.offline.ether.mvc.presenters.EthGasPresenter;
import com.github.sundeepk.offline.ether.mvc.presenters.MainPresenter;
import com.github.sundeepk.offline.ether.mvc.presenters.SendTransactionPresenter;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class TestPresentersModule {

    private AccountPresenter accountPresenter = Mockito.mock(AccountPresenter.class);
    private MainPresenter mainPresenter = Mockito.mock(MainPresenter.class);
    private BalanceEtherPresenter balanceEtherPresenter = Mockito.mock(BalanceEtherPresenter.class);
    private BalanceCurrencyPresenter balanceCurrencyPresenter = Mockito.mock(BalanceCurrencyPresenter.class);
    private SendTransactionPresenter sendTransactionPresenter = Mockito.mock(SendTransactionPresenter.class);
    private EthGasPresenter ethGasPresenter = Mockito.mock(EthGasPresenter.class);

    @Provides
    public MainPresenter provideMainPresenter() {
        return mainPresenter;
    }

    @Provides
    public BalanceEtherPresenter providesBalanceEtherPresenter() {
        return balanceEtherPresenter;
    }

    @Provides
    public BalanceCurrencyPresenter providesBalanceCurrencyPresenter() {
        return balanceCurrencyPresenter;
    }

    @Provides
    public AccountPresenter providesAccountPresenter(){
        return accountPresenter;
    }

    @Provides
    public SendTransactionPresenter providesSendTransactionPresenter(){
        return sendTransactionPresenter;
    }

    @Provides
    public EthGasPresenter providesEthGasPresenter(){
        return ethGasPresenter;
    }

}
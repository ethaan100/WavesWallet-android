package com.wavesplatform.wallet.v2.data.manager

import com.wavesplatform.wallet.v2.data.model.remote.response.coinomat.CreateTunnel
import com.wavesplatform.wallet.v2.data.model.remote.response.coinomat.GetTunnel
import com.wavesplatform.wallet.v2.data.model.remote.response.coinomat.Limit
import io.reactivex.Observable
import javax.inject.Inject

class CoinomatManager @Inject constructor() : DataManager() {

    fun loadRate(crypto: String?, address: String?, fiat: String?, amount: String?): Observable<String> {
        return coinomatService.rate(crypto, address, fiat, amount)
    }

    fun loadLimits(crypto: String?, address: String?, fiat: String?): Observable<Limit> {
        return coinomatService.limits(crypto, address, fiat)
    }

    fun createTunnel(currencyFrom: String?, currencyTo: String?, address: String?): Observable<CreateTunnel> {
        return coinomatService.createTunnel(currencyFrom, currencyTo, address)
    }

    fun getTunnel(xtId: String?, k1: String?, k2: String?, lang: String): Observable<GetTunnel> {
        return coinomatService.getTunnel(xtId, k1, k2, lang)
    }

}
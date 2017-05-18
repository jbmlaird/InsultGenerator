package bj.fuckoff.network

import bj.fuckoff.model.FuckOffResponse
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

/**
 * Created by Josh Laird on 18/05/2017.
 */
class FuckOffImpl(val fuckOffService: FuckOffService) {
    fun fuckOffAnyway(company: String, name: String): Observable<FuckOffResponse> {
        return fuckOffService.fuckOffAnyway(company, name)
                .subscribeOn(Schedulers.io())
    }
}
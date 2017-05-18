package bj.insult.network

import bj.insult.model.FuckOffResponse
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

/**
 * Created by Josh Laird on 18/05/2017.
 */
class InsultImpl(val insultService: InsultService) {
    fun fuckOffAnyway(company: String, name: String): Observable<FuckOffResponse> {
        return insultService.fuckOffAnyway(company, name)
                .subscribeOn(Schedulers.io())
    }
}
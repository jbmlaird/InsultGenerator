package bj.insult.insult

import bj.insult.network.InsultImpl
import io.reactivex.android.schedulers.AndroidSchedulers

/**
 * Created by Josh Laird on 18/05/2017.
 */
class InsultPresenter(val view: InsultContract.View, val insultImpl: InsultImpl) : InsultContract.Presenter {
    fun fetchInsult(targetName: String, yourName: String) {
        insultImpl.fuckOffAnyway(targetName, yourName)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ (message) ->
                    view.displayInsult(message)
                },
                        { error ->
                            error.printStackTrace()
                        })
    }
}
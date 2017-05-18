package bj.fuckoff.insult

import bj.fuckoff.network.FuckOffImpl
import io.reactivex.android.schedulers.AndroidSchedulers

/**
 * Created by Josh Laird on 18/05/2017.
 */
class InsultPresenter(val view: InsultContract.View, val fuckOffImpl: FuckOffImpl) : InsultContract.Presenter {
    fun fetchInsult(targetName: String, yourName: String) {
        fuckOffImpl.fuckOffAnyway(targetName, yourName)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ (message) ->
                    view.displayInsult(message)
                },
                        { error ->
                            error.printStackTrace()
                        })
    }
}
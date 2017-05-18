package bj.insult.insult

import bj.insult.model.FuckOffResponse
import bj.insult.network.InsultImpl
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Josh Laird on 18/05/2017.
 */
class InsultPresenter(val view: InsultContract.View, val insultImpl: InsultImpl) : InsultContract.Presenter {
    var index = 0
    lateinit var observable: Observable<FuckOffResponse>
    fun fetchInsult(targetName: String, yourName: String) {
        when (index) {
            0 -> observable = insultImpl.fuckOffAnyway(targetName, yourName)
            1 -> observable = insultImpl.backOff(targetName, yourName)
            2 -> observable = insultImpl.bag(yourName)
            3 -> observable = insultImpl.ballmer(targetName, yourName)
            4 -> observable = insultImpl.bday(targetName, yourName)
            5 -> observable = insultImpl.because(yourName)
            6 -> observable = insultImpl.blackadder(targetName, yourName)
            7 -> observable = insultImpl.bm(targetName, yourName)
            8 -> observable = insultImpl.bucket(yourName)
            9 -> observable = insultImpl.bus(targetName, yourName)
            10 -> observable = insultImpl.bye(targetName)
            11 -> observable = insultImpl.chainsaw(yourName, yourName)
            12 -> observable = insultImpl.cocksplat(targetName, yourName)
            13 -> observable = insultImpl.cool(targetName)
            14 -> observable = insultImpl.dalton(yourName, yourName)
            15 -> observable = insultImpl.deraadt(targetName, yourName)
            16 -> observable = insultImpl.diabetes(targetName)
            17 -> observable = insultImpl.donut(yourName, yourName)
            18 -> observable = insultImpl.everyone(targetName)
            19 -> observable = insultImpl.everything(targetName)
            20 -> observable = insultImpl.family(yourName)
            21 -> observable = insultImpl.fascinating(targetName)
            22 -> observable = insultImpl.field(targetName, yourName)
            23 -> observable = insultImpl.flying(yourName)
            24 -> observable = insultImpl.give(targetName)
            25 -> observable = insultImpl.ing(targetName, yourName)
            26 -> observable = insultImpl.keep(yourName, yourName)
            27 -> observable = insultImpl.king(targetName, yourName)
            28 -> observable = insultImpl.linus(targetName, yourName)
            29 -> observable = insultImpl.look(yourName, yourName)
            30 -> observable = insultImpl.looking(targetName)
            31 -> observable = insultImpl.outside(targetName, yourName)
            32 -> observable = insultImpl.pulp(yourName)
            33 -> observable = insultImpl.shakespeare(targetName, yourName)
            34 -> observable = insultImpl.shutup(targetName, yourName)
            35 -> observable = insultImpl.think(yourName, yourName)
            36 -> observable = insultImpl.zero(yourName)
        }
        index++
        observable
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ (message) ->
                    view.displayInsult(message)
                },
                        { error ->
                            error.printStackTrace()
                        })
    }
}
package bj.insult.network

import bj.insult.model.FuckOffResponse
import io.reactivex.Observable

/**
 * Created by Josh Laird on 18/05/2017.
 */
class InsultImpl(val insultService: InsultService) {
    fun fuckOffAnyway(company: String, name: String): Observable<FuckOffResponse> {
        return insultService.fuckOffAnyway(company, name)
    }

    fun backOff(targetName: String, yourName: String): Observable<FuckOffResponse> {
        return insultService.backOff(targetName, yourName)
    }

    fun bag(yourName: String): Observable<FuckOffResponse> {
        return insultService.bag(yourName)
    }

    fun ballmer(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.ballmer(name, from)
    }

    fun bday(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.bday(name, from)
    }

    fun because(from: String): Observable<FuckOffResponse> {
        return insultService.because(from)
    }

    fun blackadder(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.blackadder(name, from)
    }

    fun bm(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.bm(name, from)
    }

    fun bucket(from: String): Observable<FuckOffResponse> {
        return insultService.bucket(from)
    }

    fun bus(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.bus(name, from)
    }

    fun bye(from: String): Observable<FuckOffResponse> {
        return insultService.bye(from)
    }

    fun chainsaw(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.chainsaw(name, from)
    }

    fun cocksplat(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.cocksplat(name, from)
    }

    fun cool(from: String): Observable<FuckOffResponse> {
        return insultService.cool(from)
    }

    fun dalton(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.dalton(name, from)
    }

    fun deraadt(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.deraadt(name, from)
    }

    fun diabetes(from: String): Observable<FuckOffResponse> {
        return insultService.diabetes(from)
    }

    fun donut(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.donut(name, from)
    }

    fun everyone(from: String): Observable<FuckOffResponse> {
        return insultService.everyone(from)
    }

    fun everything(from: String): Observable<FuckOffResponse> {
        return insultService.everything(from)
    }

    fun family(from: String): Observable<FuckOffResponse> {
        return insultService.family(from)
    }

    fun fascinating(from: String): Observable<FuckOffResponse> {
        return insultService.fascinating(from)
    }

    fun field(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.field(name, from)
    }

    fun flying(from: String): Observable<FuckOffResponse> {
        return insultService.flying(from)
    }

    fun give(from: String): Observable<FuckOffResponse> {
        return insultService.give(from)
    }

    fun ing(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.ing(name, from)
    }

    fun keep(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.keep(name, from)
    }

    fun king(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.king(name, from)
    }

    fun linus(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.linus(name, from)
    }

    fun look(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.look(name, from)
    }

    fun looking(from: String): Observable<FuckOffResponse> {
        return insultService.looking(from)
    }

    fun outside(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.outside(name, from)
    }

    fun pulp(from: String): Observable<FuckOffResponse> {
        return insultService.pulp(from)
    }

    fun shakespeare(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.shakespeare(name, from)
    }

    fun shutup(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.shutup(name, from)
    }

    fun think(name: String, from: String): Observable<FuckOffResponse> {
        return insultService.think(name, from)
    }

    fun zero(from: String): Observable<FuckOffResponse> {
        return insultService.zero(from)
    }
}
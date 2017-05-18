package bj.insult.network

import bj.insult.model.FuckOffResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Josh Laird on 18/05/2017.
 */
interface InsultService {
    @GET("/anyway/{company}/{from}")
    fun fuckOffAnyway(@Path("company") company: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/back/{name}/{from}")
    fun backOff(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/bag/{from}")
    fun bag(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/ballmer/{name}/{name}/{from}")
    fun ballmer(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/bday/{name}/{from}")
    fun bday(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/because/{from}")
    fun because(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/blackadder/{name}/{from}")
    fun blackadder(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/bm/{name}/{from}")
    fun bm(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/bm/{from}")
    fun bucket(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/bus/{name}/{from}")
    fun bus(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/bye/{from}")
    fun bye(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/chainsaw/{name}/{from}")
    fun chainsaw(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/cocksplat/{name}/{from}")
    fun cocksplat(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/cool/{from}")
    fun cool(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/dalton/{name}/{from}")
    fun dalton(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/deraadt/{name}/{from}")
    fun deraadt(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/diabetes/{from}")
    fun diabetes(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/donut/{name}/{from}")
    fun donut(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/everyone/{from}")
    fun everyone(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/everything/{from}")
    fun everything(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/family/{from}")
    fun family(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/fascinating/{from}")
    fun fascinating(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/field/{name}/{from}/Your mum")
    fun field(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/flying/{from}")
    fun flying(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/give/{from}")
    fun give(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/ing/{from}")
    fun ing(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/keep/{name}/{from}")
    fun keep(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/king/{name}/{from}")
    fun king(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/linus/{name}/{from}")
    fun linus(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/look/{name}/{from}")
    fun look(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/looking/{from}")
    fun looking(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/outside/{name}/{from}")
    fun outside(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/pulp/English/{from}")
    fun pulp(@Path("from") from: String): Observable<FuckOffResponse>

    @GET("/shakespeare/{name}/{from}")
    fun shakespeare(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/shutup/{name}/{from}")
    fun shutup(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/think/{name}/{from}")
    fun think(@Path("name") name: String, @Path("from") from: String): Observable<FuckOffResponse>

    @GET("/zero/{from}")
    fun zero(@Path("from") from: String): Observable<FuckOffResponse>
}
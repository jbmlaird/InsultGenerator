package bj.fuckoff.network

import bj.fuckoff.model.FuckOffResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

/**
 * Created by Josh Laird on 18/05/2017.
 */
interface FuckOffService {
    @Headers("Accept: application/json")
    @GET("/anyway/{company}/{from}")
    fun fuckOffAnyway(@Path("company") company: String, @Path("from") from: String): Observable<FuckOffResponse>
}
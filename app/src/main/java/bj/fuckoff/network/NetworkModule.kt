package bj.fuckoff.network

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by Josh Laird on 18/05/2017.
 */
@Module
class NetworkModule {
    @Provides
    fun provideFuckOffService(): FuckOffService {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://www.foaas.com")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        return retrofit.create(FuckOffService::class.java)
    }

    @Provides
    fun provideFuckOffImpl(fuckOffService: FuckOffService): FuckOffImpl {
        return FuckOffImpl(fuckOffService)
    }
}
package bj.fuckoff.insult

import bj.fuckoff.network.FuckOffImpl
import dagger.Module
import dagger.Provides

/**
 * Created by Josh Laird on 18/05/2017.
 */
@Module
class InsultModule(val insultView: InsultController) {
    @Provides
    fun provideInsultView(): InsultContract.View {
        return insultView
    }

    @Provides
    fun provideMainPresenter(fuckOffImpl: FuckOffImpl): InsultPresenter {
        return InsultPresenter(insultView, fuckOffImpl)
    }
}
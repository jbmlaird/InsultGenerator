package bj.insult.insult

import bj.insult.network.InsultImpl
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
    fun provideMainPresenter(insultImpl: InsultImpl): InsultPresenter {
        return InsultPresenter(insultView, insultImpl)
    }
}
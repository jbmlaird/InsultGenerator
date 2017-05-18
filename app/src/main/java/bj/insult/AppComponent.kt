package bj.insult

import bj.insult.insult.InsultComponent
import bj.insult.network.NetworkModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Josh Laird on 18/05/2017.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, NetworkModule::class))
interface AppComponent {
    fun inject(application: App)
    fun insultComponentBuilder(): InsultComponent.Builder
}
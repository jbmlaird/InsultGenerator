package bj.fuckoff.insult

import dagger.Subcomponent

/**
 * Created by Josh Laird on 18/05/2017.
 */
@Subcomponent(modules = arrayOf(InsultModule::class))
interface InsultComponent {
    fun inject(controller: InsultController)

    @Subcomponent.Builder
    interface Builder {
        fun buildInsultModule(module: InsultModule): Builder

        fun build(): InsultComponent
    }
}
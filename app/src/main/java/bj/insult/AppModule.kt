package bj.insult

import dagger.Module
import dagger.Provides

/**
 * Created by Josh Laird on 18/05/2017.
 */
@Module
class AppModule(val app: App) {

    @Provides
    fun provideApplicationContext(): App = app
}
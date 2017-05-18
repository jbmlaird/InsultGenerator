package bj.fuckoff

import android.app.Application

/**
 * Created by Josh Laird on 18/05/2017.
 */
class App : Application() {
    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        setupGraph()
    }

    private fun setupGraph() {
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build();
        appComponent.inject(this)
    }
}
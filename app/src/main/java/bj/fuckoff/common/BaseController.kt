package bj.fuckoff.common

import android.view.View
import bj.fuckoff.App
import bj.fuckoff.AppComponent
import com.bluelinelabs.conductor.Controller

/**
 * Created by Josh Laird on 18/05/2017.
 */
abstract class BaseController : Controller() {
    override fun onAttach(view: View) {
        setupComponent(App.appComponent)
        super.onAttach(view)
    }

    abstract fun setupComponent(appComponent: AppComponent)
}
package bj.fuckoff.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import bj.fuckoff.R
import bj.fuckoff.enterdetails.EnterDetailsController
import bj.fuckoff.insult.InsultPresenter
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import kotlinx.android.synthetic.main.activity_fullscreen.*
import javax.inject.Inject

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class MainController : AppCompatActivity() {
    @Inject
    lateinit var presenter: InsultPresenter
    lateinit var router: Router

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fullscreen)
        router = Conductor.attachRouter(this, lytMain, savedInstanceState)
        if (!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(EnterDetailsController()))
        }
    }
}

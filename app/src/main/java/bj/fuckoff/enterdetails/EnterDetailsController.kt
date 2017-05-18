package bj.fuckoff.enterdetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import bj.fuckoff.R
import bj.fuckoff.insult.InsultController
import bj.fuckoff.utils.BundleBuilder
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.FadeChangeHandler
import kotlinx.android.synthetic.main.controller_enter_details.view.*

/**
 * Created by Josh Laird on 18/05/2017.
 */
class EnterDetailsController : Controller() {
    override fun onCreateView(layoutInflater: LayoutInflater, container: ViewGroup): View {
        val view = layoutInflater.inflate(R.layout.controller_enter_details, container, false)
        view.btnContinue.setOnClickListener { _ ->
            goToInsultController()
        }
        return view
    }

    private fun goToInsultController() {
        val bundle = BundleBuilder(Bundle())
        bundle.putString("yourName", view?.etYourName?.text.toString())
        bundle.putString("targetName", view?.etTargetName?.text.toString())
        router.pushController(RouterTransaction.with(InsultController(bundle.build()))
                .popChangeHandler(FadeChangeHandler())
                .pushChangeHandler(FadeChangeHandler()))
    }
}